package urvi2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class waterconsumption extends JFrame{
	public waterconsumption() {
	}
   /**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
private static Font font;

public static void NewScreen1() throws Exception {
      DefaultTableModel tableModel = new DefaultTableModel();
      JTable table = new JTable(tableModel);
      tableModel.addColumn("Age");
      tableModel.addColumn("Adequate Intake defined by EFSA");
      // applying adjustments to the next column only
      table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
      tableModel.addRow(new Object[] { "0-6 Months", "100-190 mL/kg/day"});
      tableModel.addRow(new Object[] { "6-12 Months", "800 to 1000mL/day"});
      tableModel.addRow(new Object[] { "1-2Years", "1100 to 1200mL/day"});
      tableModel.addRow(new Object[] { "2-3Years", "1300 mL/day"});
      tableModel.addRow(new Object[] { "4-8 Years", "1600 mL/day"});
      tableModel.addRow(new Object[] { "9-13 Years", "2100 mL/day(for boys)"});
      tableModel.addRow(new Object[] { "9-13 Years", "1900 mL/day(for girls)"});
      tableModel.addRow(new Object[] { "From 14 Years onwards", "2600 mL/day(for boys)"});
      tableModel.addRow(new Object[] { "From 14 Years onwards", "2000 mL/day(for girls)"});
       font = new Font("times new roman", Font.CENTER_BASELINE, 18);
      table.setFont(font);
      table.setRowHeight(45);
      table.setBackground(Color.black);
      table.setForeground(Color.white);
      JFrame frame = new JFrame();
     frame.setBounds(104, 200, 500, 482);
      frame.setTitle("Water Consumption");
      frame.getContentPane().add(new JScrollPane(table));
      frame.setVisible(true);
   }





}

 






	





   