package urvi2;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class questionnaire extends JFrame {
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;

/**
* Launch the application.
*/
public static void questionscreen() {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
questionnaire frame = new questionnaire();
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
public questionnaire() throws java.lang.ClassNotFoundException
{
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 742, 643);
getContentPane().setLayout(null);

JLabel lblNewLabel = new JLabel("    QUESTIONNAIRE");
lblNewLabel.setBounds(47, 58, 352, 69);
lblNewLabel.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 25));
lblNewLabel.setForeground(new Color(0, 0, 0));
lblNewLabel.setBackground(new Color(128, 128, 128));
getContentPane().add(lblNewLabel);

JLabel lblNewLabel_1 = new JLabel("What's Your Age?");
lblNewLabel_1.setBounds(57, 137, 142, 31);
lblNewLabel_1.setFont(new Font("Bell MT", Font.ITALIC, 18));
lblNewLabel_1.setBackground(new Color(128, 128, 128));
getContentPane().add(lblNewLabel_1);

textField = new JTextField();//text field of age
textField.setBounds(223, 137, 72, 31);
getContentPane().add(textField);
textField.setColumns(10);

JLabel lblNewLabel_2 = new JLabel("What's your eating preference?");
lblNewLabel_2.setBounds(47, 178, 213, 46);
lblNewLabel_2.setFont(new Font("Bell MT", Font.ITALIC, 18));
getContentPane().add(lblNewLabel_2);

textField_6 = new JTextField();// text field for eating preference 
textField_6.setBounds(269, 187, 148, 31);
getContentPane().add(textField_6);
textField_6.setColumns(10);

JLabel lblNewLabel_3 = new JLabel("What's your height?");
lblNewLabel_3.setBounds(47, 234, 178, 31);
lblNewLabel_3.setFont(new Font("Bell MT", Font.ITALIC, 18));
getContentPane().add(lblNewLabel_3);

textField_1 = new JTextField();// text field of height
textField_1.setBounds(223, 234, 72, 32);
getContentPane().add(textField_1);
textField_1.setColumns(10);

JLabel lblNewLabel_4 = new JLabel("What's your weight?");
lblNewLabel_4.setBounds(47, 275, 161, 32);
lblNewLabel_4.setFont(new Font("Bell MT", Font.ITALIC, 18));
getContentPane().add(lblNewLabel_4);

textField_2 = new JTextField();//text field of weight
textField_2.setBounds(223, 276, 72, 31);
getContentPane().add(textField_2);
textField_2.setColumns(10);

JLabel lblNewLabel_5 = new JLabel("Are you diabetic?If yes then describe?");
lblNewLabel_5.setBounds(47, 317, 269, 31);
lblNewLabel_5.setFont(new Font("Bell MT", Font.ITALIC, 18));
getContentPane().add(lblNewLabel_5);

JLabel lblNewLabel_6 = new JLabel("Do you have any disease/disorder?If yes then describe?");
lblNewLabel_6.setBounds(47, 382, 383, 31);
lblNewLabel_6.setFont(new Font("Bell MT", Font.ITALIC, 18));
getContentPane().add(lblNewLabel_6);

textField_3 = new JTextField();// text field of diabetic 
textField_3.setBounds(47, 358, 248, 24);
getContentPane().add(textField_3);
textField_3.setColumns(10);

JLabel lblNewLabel_8 = new JLabel("Are you allergic to any food?");
lblNewLabel_8.setBounds(47, 460, 213, 31);
lblNewLabel_8.setFont(new Font("Bell MT", Font.ITALIC, 18));
getContentPane().add(lblNewLabel_8);

textField_4 = new JTextField();// text field for disorder
textField_4.setBounds(253, 460, 177, 29);
getContentPane().add(textField_4);
textField_4.setColumns(10);

textField_5 = new JTextField();// text field of allergic 
textField_5.setBounds(47, 423, 248, 27);
getContentPane().add(textField_5);
textField_5.setColumns(10);

JButton btnNewButton = new JButton("Submit");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		{ 
			try{
			
				String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String password="admin";
	//	 sql="select * from Sample";
		String height,weight1,age,diabetes,disease_or_disorder,allergies,eating_preference = null; 
		height=textField_1.getText();
		weight1=textField_2.getText();
		age=textField.getText();
		diabetes=textField_3.getText();
		disease_or_disorder=textField_5.getText();
		allergies=textField_5.getText();
		eating_preference=textField_6.getText();
		String query = "INSERT INTO question values('" + age + "','" + eating_preference + "','" + height+ "','" + 
	            weight1+ "','" + diabetes + "','" + disease_or_disorder + "','" + allergies + "')";  
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
	Statement st=con.createStatement();
	
	 int x = st.executeUpdate(query);
     if (x != 0) {
         JOptionPane.showMessageDialog(null, "Datas added successfully");
    
			}
     else
    	 return;
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
			catch(ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
			}
	}
});
btnNewButton.setBounds(224, 501, 129, 31);
getContentPane().add(btnNewButton);



JLabel lblNewLabel_9 = new JLabel("");
lblNewLabel_9.setBounds(0, 0, 728, 596);
lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\WhatsApp Image 2022-11-04 at 10.24.32 PM (1).jpeg"));
getContentPane().add(lblNewLabel_9);
}
}


