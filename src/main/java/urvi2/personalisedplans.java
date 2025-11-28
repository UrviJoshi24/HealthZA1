package urvi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class personalisedplans extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen5() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					personalisedplans frame = new personalisedplans();
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
	public personalisedplans() {
		setTitle("Personalised Diet Plan");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Weight Loss");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame2 = new JFrame();
				frame2.dispose();
				try{
					weight_loss.NewScreen2();	
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(268, 138, 334, 58);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Weight Gain");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame3 = new JFrame();
				frame3.dispose();
				try {
					weightgain.NewScreen3();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(268, 256, 334, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Heart Disease ");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame4 = new JFrame();
				frame4.dispose();
				try {
					heartpatient.NewScreen4();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(268, 370, 334, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Daibetes ");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame1=new JFrame();
			frame1.dispose();
			try {
				diabetes.NewScreen1();
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}}
		});
		btnNewButton_3.setBounds(268, 478, 334, 51);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 905, 717);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\PERSONALISEDPLANS (1).jpg"));
		contentPane.add(lblNewLabel);
	}
}
