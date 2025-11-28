package urvi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;

import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Label;

import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setForeground(SystemColor.windowText);
		setBackground(SystemColor.activeCaption);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// EXIT_ON_CLOSE will automatic close the output
		setBounds(100, 100, 878, 615);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		//ImageIcon icon1=new ImageIcon(this.getClass().getResource("/person.jpg"));
		//ImageIcon icon2=new ImageIcon(this.getClass().getResource("/lock.jpg"));
				contentPane.setLayout(null);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(0, 0, 370, 578);
				contentPane.add(panel_1);
				panel_1.setBackground(new Color(153, 0, 51));
				panel_1.setLayout(null);
				
				JLabel lblNewLabel = new JLabel("   UserID:");
				lblNewLabel.setBounds(56, 256, 124, 38);
				lblNewLabel.setForeground(new Color(204, 255, 204));
				lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
				lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
				panel_1.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel("   Password:");
				lblNewLabel_1.setBounds(56, 314, 111, 38);
				lblNewLabel_1.setForeground(new Color(204, 255, 204));
				lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
				panel_1.add(lblNewLabel_1);
				
				textField = new JTextField();
				textField.setBounds(175, 258, 146, 38);
				textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
				textField.setHorizontalAlignment(SwingConstants.CENTER);
				panel_1.add(textField);
				textField.setColumns(10);
				
				passwordField = new JPasswordField();
				passwordField.setBounds(177, 315, 144, 38);
				passwordField.setEchoChar('*');
				passwordField.setFont(new Font("Times New Roman", Font.BOLD, 15));
				passwordField.setHorizontalAlignment(SwingConstants.CENTER);
				panel_1.add(passwordField);
				
				JButton btnNewButton = new JButton("Login");
				btnNewButton.setBounds(56, 372, 111, 38);
				btnNewButton.setForeground(new Color(204, 255, 204));
				btnNewButton.setBackground(new Color(0, 0, 0));
				btnNewButton.addActionListener(new ActionListener()// ActionListener is a interface
				{
					private ResultSet rs;
					public void actionPerformed(ActionEvent e)// this is the object of addActionListener
					{
						try
						{
						// get text and password from user
						String un=textField.getText();
						@SuppressWarnings("deprecation")
						String pass=passwordField.getText();
						
							String url="jdbc:mysql://localhost:3306/student";
							String user="root";
							String password="admin";
							String sql="select * from sample4 where username='"+un+"'and password='"+pass+"'";
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection(url,user,password);
							Statement st=con.createStatement();
							rs=st.executeQuery(sql);
						}
						catch(SQLException e1) {
							e1.printStackTrace();
						}
						catch(ClassNotFoundException e1) {
							e1.printStackTrace();
						}
						
						
							try {
								if(rs.next()) {
									JOptionPane.showMessageDialog(null, "Login Successful");
									JFrame jFrame = new JFrame();
									jFrame.dispose();
									homepage Homepage=new homepage();
									
									Homepage.setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null, "Invalid UserId or Password");
								}
							} catch (HeadlessException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						
					}
				});
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
				panel_1.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("Reset");
				btnNewButton_1.setBounds(187, 372, 124, 38);
				btnNewButton_1.setBackground(new Color(0, 0, 0));
				btnNewButton_1.setForeground(new Color(204, 255, 204));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						textField.setText("");
						passwordField.setText("");
					}
				});
				btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
				panel_1.add(btnNewButton_1);
				
				JTextArea txtrDidHaveAn = new JTextArea();
				txtrDidHaveAn.setBounds(0, 452, 357, 46);
				txtrDidHaveAn.setBackground(new Color(153, 0, 51));
				txtrDidHaveAn.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
				txtrDidHaveAn.setText("        Did have an account? Register Now");
				panel_1.add(txtrDidHaveAn);
						
						JTextArea txtrLogin = new JTextArea();
						txtrLogin.setBounds(45, 165, 240, 81);
						txtrLogin.setBackground(new Color(153, 0, 51));
						txtrLogin.setForeground(new Color(204, 255, 204));
						txtrLogin.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
						txtrLogin.setText("            LOGIN");
						panel_1.add(txtrLogin);
						
						JButton btnNewButton_2 = new JButton("Register Now");
						btnNewButton_2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {

								JFrame frame1= new JFrame();
								frame1.dispose();
								try {
								signup.signupScreen();
								}catch(Exception e1) {
									e1.printStackTrace();
								}
								
							}
						});
						btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
						btnNewButton_2.setBackground(new Color(153, 0, 51));
						btnNewButton_2.setForeground(new Color(204, 255, 204));
						btnNewButton_2.setBounds(95, 492, 167, 32);
						panel_1.add(btnNewButton_2);
						
						JLabel lblNewLabel_2 = new JLabel("");
						lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ACER\\OneDrive\\Desktop\\image.jpg"));
						lblNewLabel_2.setBounds(369, 0, 495, 578);
						contentPane.add(lblNewLabel_2);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/image.jpg"));
	}
}
