package urvi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class blogs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					blogs frame = new blogs();
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
	public blogs() {
		setTitle("BLOGS");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1221, 729);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnCelebrateYourSuccesses = new JTextPane();
		txtpnCelebrateYourSuccesses.setBounds(21, 39, 511, 47);
		txtpnCelebrateYourSuccesses.setBackground(SystemColor.menu);
		txtpnCelebrateYourSuccesses.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 40));
		txtpnCelebrateYourSuccesses.setText("Celebrate Your Successes");
		contentPane.add(txtpnCelebrateYourSuccesses);
		
		JTextPane txtpnLosingWeightIs = new JTextPane();
		txtpnLosingWeightIs.setBounds(21, 96, 511, 562);
		txtpnLosingWeightIs.setBackground(SystemColor.menu);
		txtpnLosingWeightIs.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		txtpnLosingWeightIs.setText("Losing weight is hard, so celebrate all your successes to keep yourself motivated.Give yourself some credit when you accomplish a goal. Social media or weight loss sites with community pages are great places to share your successes and get support. When you feel pride in yourself, you will increase your motivation.Moreover, remember to celebrate behavior changes and not just reaching a certain number on the scale.However, it’s important to pick appropriate rewards. Avoid rewarding yourself with food. Also, avoid rewards that are so expensive you would never buy it, or so insignificant that you would allow yourself to have it anyway.The following are some good examples of rewards:Getting a manicure");
		contentPane.add(txtpnLosingWeightIs);
		
		JTextPane txtpnKeepAWeight = new JTextPane();
		txtpnKeepAWeight.setBackground(SystemColor.menu);
		txtpnKeepAWeight.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 34));
		txtpnKeepAWeight.setText("Keep a Weight Loss Journal");
		txtpnKeepAWeight.setBounds(653, 50, 494, 47);
		contentPane.add(txtpnKeepAWeight);
		
		JTextPane txtpnSelfmonitoringIsCrucial = new JTextPane();
		txtpnSelfmonitoringIsCrucial.setBackground(SystemColor.menu);
		txtpnSelfmonitoringIsCrucial.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 26));
		txtpnSelfmonitoringIsCrucial.setText("Self-monitoring is crucial to weight loss motivation and success.Research has found that people who track their food intake are more likely to lose weight and maintain their weight loss,However, to keep a food journal correctly, you must write down everything you eat. This includes meals, snacks and the piece of candy you ate off your coworker’s desk.You can also record your emotions in your food journal. This can help you identify certain triggers for overeating and help you find healthier ways to cope.");
		txtpnSelfmonitoringIsCrucial.setBounds(653, 132, 494, 431);
		contentPane.add(txtpnSelfmonitoringIsCrucial);
	}

}
