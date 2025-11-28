package urvi2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
public class Bmi {
 private JFrame frmBmiCalculator;
 private JTextField textField;
 private JTextField textField_1;
 private JComboBox<Object> comboBox;
 private JComboBox<Object> comboBox_1;
 private JComboBox<Object> comboBox_2;
 String day,year,month;
 String height="",weight="",gen="",result="";
 private ButtonGroup gengp;
 private String dates[]
 = { "1", "2", "3", "4", "5",
 "6", "7", "8", "9", "10",
 "11", "12", "13", "14", "15",
 "16", "17", "18", "19", "20",
 "21", "22", "23", "24", "25",
 "26", "27", "28", "29", "30",
 "31" };
 private String months[]
 = { "Jan", "feb", "Mar", "Apr",
 "May", "Jun", "July", "Aug",
 "Sup", "Oct", "Nov", "Dec" };
 private String years[]
 = { "1987", "1988", "1989", "1990",
 "1991", "1992", "1993", "1994",
 "1995", "1996", "1997", "1998",
 "1999", "2000", "2001", "2002",
 "2003", "2004", "2005", "2006",
 "2007", "2008", "2009", "2010",
 "2011", "2012", "2013", "2014",
 "2015", "2016", "2017", "2018",
 "2019","2020","2021" };
 /**
 * Launch the application.
 */
 public static void NewScreen3() throws java.lang.ClassNotFoundException
 {
 EventQueue.invokeLater(new Runnable() {
 public void run() {
 try {
 Bmi window = new Bmi();
 window.frmBmiCalculator.setVisible(true);
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 });
 }
 /**
 * Create the application.
 */
 public Bmi() {
 initialize();
 }
 /**
 * Initialize the contents of the frame.
 */
 private void initialize() {
 frmBmiCalculator = new JFrame();
 frmBmiCalculator.setTitle("BMI Calculator");
 frmBmiCalculator.setBounds(100, 100, 854, 615);
 frmBmiCalculator.getContentPane().setLayout(null);
 
 JLabel lblNewLabel = new JLabel("BMI CALCULATOR");
 lblNewLabel.setBounds(0, 57, 555, 33);
 lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
 lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
 frmBmiCalculator.getContentPane().add(lblNewLabel);
 
 JLabel lblHeight = new JLabel("Height(cm)");
 lblHeight.setBounds(38, 156, 178, 53);
 lblHeight.setHorizontalAlignment(SwingConstants.CENTER);
 lblHeight.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
 frmBmiCalculator.getContentPane().add(lblHeight);
 
 textField = new JTextField();
 textField.setBounds(279, 165, 178, 40);
 textField.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
 textField.setHorizontalAlignment(SwingConstants.CENTER);
 frmBmiCalculator.getContentPane().add(textField);
 textField.setColumns(10);
 
 JLabel lblWeight = new JLabel("Weight(Kg)");
 lblWeight.setBounds(65, 242, 151, 40);
 lblWeight.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
 frmBmiCalculator.getContentPane().add(lblWeight);
 
 textField_1 = new JTextField();
 textField_1.setHorizontalAlignment(SwingConstants.CENTER);
 textField_1.setBounds(279, 245, 178, 40);
 textField_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
 textField_1.setColumns(10);
 frmBmiCalculator.getContentPane().add(textField_1);
 
 JLabel lblGender = new JLabel("Gender");
 lblGender.setBounds(33, 303, 117, 33);
 lblGender.setHorizontalAlignment(SwingConstants.CENTER);
 lblGender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
 frmBmiCalculator.getContentPane().add(lblGender);
 
 JRadioButton rdbtnMale = new JRadioButton("Male");
 rdbtnMale.setBounds(89, 342, 70, 23);
 rdbtnMale.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 rdbtnMale.setHorizontalAlignment(SwingConstants.CENTER);
 rdbtnMale.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 gen="Male";
 }
 });
 frmBmiCalculator.getContentPane().add(rdbtnMale);
 
 JRadioButton rdbtnFemale = new JRadioButton("Female");
 rdbtnFemale.setBounds(208, 342, 123, 23);
 rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 rdbtnFemale.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 gen="Female";
 }
 });
 frmBmiCalculator.getContentPane().add(rdbtnFemale);
 
 JRadioButton rdbtnOther = new JRadioButton("Other");
 rdbtnOther.setBounds(351, 342, 81, 23);
 rdbtnOther.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 rdbtnOther.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 gen="Other";
 }
 });
 frmBmiCalculator.getContentPane().add(rdbtnOther);
 gengp = new ButtonGroup();
 gengp.add(rdbtnMale);
 gengp.add(rdbtnFemale);
 gengp.add(rdbtnOther);
 JLabel lblAge = new JLabel("DOB");
 lblAge.setBounds(65, 383, 104, 33);
 lblAge.setHorizontalAlignment(SwingConstants.CENTER);
 lblAge.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
 frmBmiCalculator.getContentPane().add(lblAge);
 
 JButton btnSubmit = new JButton("Submit");
 btnSubmit.setBounds(40, 471, 110, 33);
 btnSubmit.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 btnSubmit.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent arg0) {
 calculate_bmi();
 }
 });
 frmBmiCalculator.getContentPane().add(btnSubmit);
 
 JButton btnReset = new JButton("Reset");
 btnReset.setBounds(329, 472, 104, 31);
 btnReset.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 btnReset.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 height="";
 weight="";
 result="";
 day="";
 month="";
 year="";
 gen="";
 textField.setText("");
 textField_1.setText("");
 comboBox.setSelectedIndex(0);
 comboBox_1.setSelectedIndex(0);
 comboBox_2.setSelectedIndex(0);
 rdbtnMale.setSelected(true);
 }
 });
 frmBmiCalculator.getContentPane().add(btnReset);
 comboBox = new JComboBox<Object>(dates);
 comboBox.setBounds(208, 389, 52, 24);
 comboBox.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 frmBmiCalculator.getContentPane().add(comboBox);
 comboBox_1 = new JComboBox<Object>(months);
 comboBox_1.setBounds(261, 389, 70, 24);
 comboBox_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 frmBmiCalculator.getContentPane().add(comboBox_1);
 comboBox_2 = new JComboBox<Object>(years);
 comboBox_2.setBounds(329, 389, 70, 24);
 comboBox_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
 frmBmiCalculator.getContentPane().add(comboBox_2);
 
 JLabel lblNewLabel_1 = new JLabel("");
 lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\bmi-1.jpg"));
 lblNewLabel_1.setBounds(0, 0, 840, 578);
 frmBmiCalculator.getContentPane().add(lblNewLabel_1);
 }
 public void calculate_bmi() {
 if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || gen.isEmpty())
 {error();
 return;
 }
 double h,w,r;
 height = textField.getText();
 weight = textField_1.getText();
 day = dates[comboBox.getSelectedIndex()];
 month = months[comboBox_1.getSelectedIndex()];
 year = years[comboBox_2.getSelectedIndex()];
 h=Double.parseDouble(height);
 w=Double.parseDouble(weight);
 r=w/Math.pow((h/100), 2);
 DecimalFormat df = new DecimalFormat("###.##");
 result="";
 result+=String.valueOf(df.format(r));
 if (r >= 25)
 result+="\t Overweight \n You have a higher than normal body weight. \nTry to exercise more.";
 else if (r > 18.5)
 result+="\t Normal \n You have normal body weight.\n Good Job!.";
 else
 result+="\t Underweight \n You have a lower than normal body weight.\n You can eat a it more.";
 JFrame f =new JFrame(); 
 JOptionPane.showMessageDialog(f,result); 
 }
 public void error() {
 JFrame f =new JFrame(); 
 JOptionPane.showMessageDialog(f,"Fill all the details","Alert",JOptionPane.WARNING_MESSAGE); 
 }
}