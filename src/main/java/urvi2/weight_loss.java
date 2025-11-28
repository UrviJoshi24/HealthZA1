package urvi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class weight_loss extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weight_loss frame = new weight_loss();
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
	public weight_loss() {
		setTitle("Weight Loss ");
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\weightloss.png"));
		lblNewLabel.setBounds(0, 0, 680, 667);
		contentPane.add(lblNewLabel);
	}
}
