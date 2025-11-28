package urvi2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class signup extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void signupScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup frame = new signup();
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
	public signup() {
		setTitle("Sign Up ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1199, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(444, 0, 759, 582);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ACER\\OneDrive\\Desktop\\signup-2.jpg"));
		contentPane.add(lblNewLabel_1);
		ImageIcon icon= new ImageIcon(this.getClass().getResource("/signup-2.jpg"));
		
		JLabel lblNewLabel_3 = new JLabel("Sign Up!!");
		lblNewLabel_3.setBounds(81, 56, 243, 127);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("                USERNAME:");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_4.setBounds(10, 204, 177, 40);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("                  PASSWORD:");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setBounds(10, 270, 177, 40);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(223, 206, 177, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(223, 272, 177, 40);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("LET'S BE HEALHTY!! ");
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
		
				 public void actionPerformed(ActionEvent e) {
		                String username = textField.getText();
		             
		                String password = passwordField.getText();
		                String url="jdbc:mysql://localhost:3306/student";
		            	String user="root";
		            	String pass="admin";
		              
try {
		                    Connection connection = DriverManager.getConnection(url,user,pass);

		                    String query = "INSERT INTO sample4 values('"+username+ "','" +password+ "')";

		                    Statement sta = connection.createStatement();
		                    int x = sta.executeUpdate(query);
		                    if (x == 0) {
		                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
		                    } else {
		                        JOptionPane.showMessageDialog(btnNewButton,
		                            "Welcome "+ "Your account is sucessfully created");

		        				JFrame frame1= new JFrame();
		        				frame1.dispose();
		        				try {
		        				questionnaire.questionscreen();
		        				}catch(Exception e1) {
		        					e1.printStackTrace();
		        				}
		        				
		                    }
		                    connection.close();
		                } catch (Exception exception) {
		                    exception.printStackTrace();
		                }
		            }
		        });
			
		btnNewButton.setBounds(104, 408, 198, 40);
		contentPane.add(btnNewButton);
		
	
	
	}

	
}
