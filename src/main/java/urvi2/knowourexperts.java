package urvi2;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextPane;

public class knowourexperts extends JFrame {

	private JPanel contentPane;
	private JTextField txtDietitianPriyanka;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					knowourexperts frame = new knowourexperts();
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
	public knowourexperts() {
		setTitle("Know Our Experts!");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1308, 784);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\OneDrive\\Desktop\\expert1.png"));
		lblNewLabel.setBounds(10, 43, 348, 483);
		contentPane.add(lblNewLabel);
		
		txtDietitianPriyanka = new JTextField();
		txtDietitianPriyanka.setBackground(SystemColor.inactiveCaptionBorder);
		txtDietitianPriyanka.setHorizontalAlignment(SwingConstants.CENTER);
		txtDietitianPriyanka.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		txtDietitianPriyanka.setText("Dietitian Olivia");
		txtDietitianPriyanka.setBounds(374, 53, 326, 51);
		contentPane.add(txtDietitianPriyanka);
		txtDietitianPriyanka.setColumns(10);
		
		JTextPane txtpnOneOfThe = new JTextPane();
		txtpnOneOfThe.setBackground(SystemColor.menu);
		txtpnOneOfThe.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		txtpnOneOfThe.setText("One of the famous Dietitians in India is Dt. Olivia. She runs her clinic in Chandigarh and provides all health facilities across the world. Dt. Olivia offers easy diet plans with a positive output. With her work, she pleased many clients.");
		txtpnOneOfThe.setBounds(380, 131, 653, 208);
		contentPane.add(txtpnOneOfThe);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(103, 631, 32339, -33405);
		contentPane.add(lblNewLabel_1);
		ImageIcon icon=new ImageIcon(this.getClass().getResource("/expert1.png"));
	}
}
