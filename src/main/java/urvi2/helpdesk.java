package urvi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class helpdesk extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen6() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					helpdesk frame = new helpdesk();
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
	public helpdesk() {
		setTitle("HelpDesk");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\help desk.jpg"));
		lblNewLabel.setBounds(0, 0, 1311, 743);
		contentPane.add(lblNewLabel);
	}
}
