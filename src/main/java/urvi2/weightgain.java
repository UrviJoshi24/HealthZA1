package urvi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class weightgain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weightgain frame = new weightgain();
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
	public weightgain() {
		setTitle("Weight Gain");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\weightgain (1).jpg"));
		lblNewLabel.setBounds(0, 10, 1126, 558);
		contentPane.add(lblNewLabel);
	}

}
