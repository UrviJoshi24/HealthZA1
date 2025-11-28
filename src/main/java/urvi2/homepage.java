package urvi2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window;

import java.awt.Color;
import java.awt.Dialog;

import javax.swing.DropMode;
import javax.swing.JMenu;

@SuppressWarnings("serial")
public class homepage extends JFrame {

	private JPanel contentPane;
	protected Window jFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setTitle("Home Page ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1365, 786);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		ImageIcon icon1=new ImageIcon(this.getClass().getResource("/homepage-2.jpg"));
		//ImageIcon icon2=new ImageIcon(this.getClass().getResource("/logo1.jpg"));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("HEALTHZA");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setFont(new Font("Rockwell Condensed", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(10, 10, 355, 88);
		//lblNewLabel_1.setIcon(icon2);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Personalised Plans");
		btnNewButton.setBounds(407, 28, 176, 34);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame4=new JFrame();
				frame4.dispose();
				try {
					personalisedplans.NewScreen5();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Daily Plans");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
JFrame frame4=new JFrame();
frame4.dispose();
try {
	dailyplans.NewScreen5();
}
catch(Exception e1) {
	e1.printStackTrace();
}
			}
		});
		btnNewButton_1.setBounds(640, 28, 186, 34);
		btnNewButton_1.setBackground(new Color(143, 188, 143));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Help Desk");
		btnNewButton_2.setBounds(1076, 28, 122, 34);
		btnNewButton_2.setBackground(new Color(143, 188, 143));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame5=new JFrame();
				frame5.dispose();
				try {
					helpdesk.NewScreen6();
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Blogs");
		btnNewButton_3.setBounds(900, 28, 107, 34);
		btnNewButton_3.setBackground(new Color(143, 188, 143));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame3= new JFrame();
				frame3.dispose();
				try {
				blogs.NewScreen4();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Check Your Calorie Count.");
		btnNewButton_4.setBounds(46, 200, 372, 34);
		btnNewButton_4.setBackground(new Color(143, 188, 143));
		
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFrame frame3 = new JFrame();
			frame3.dispose();
				
				try {
					Calorie.NewScreen4();
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				//new Demo4();
				
			}
		});
		JButton btnNewButton_5 = new JButton("Check Per Day Water Consunption.");
		btnNewButton_5.setBounds(46, 276, 372, 34);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame();
			frame.dispose();
				
				try {
					waterconsumption.NewScreen1();
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
				//new Demo4();
				
			}
		});
		btnNewButton_5.setBackground(new Color(143, 188, 143));
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Check Your BMI");
		btnNewButton_6.setBackground(new Color(143, 188, 143));
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JFrame frame2= new JFrame();
			frame2.dispose();
			try {
			Bmi.NewScreen3();
			}catch(Exception e1) {
				e1.printStackTrace();
			}
			}
	});
		btnNewButton_6.setBounds(46, 349, 372, 34);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Know Our Diet Experts.");
		btnNewButton_7.setBackground(new Color(143, 188, 143));
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1= new JFrame();
				frame1.dispose();
				try {
				knowourexperts.NewScreen2();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				}
		});
		
		btnNewButton_7.setBounds(46, 423, 372, 34);
		contentPane.add(btnNewButton_7);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setBounds(0, 0, 1361, 758);
		lblNewLabel.setIcon(icon1);
		contentPane.add(lblNewLabel);
		
	}
}
