package urvi2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class dailyplans extends JFrame{
	public dailyplans() {
		getContentPane().setLayout(null);
	
	}
   /**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
private static Font font;
   private JTable table_1;

public static void NewScreen5() throws Exception {
      DefaultTableModel tableModel = new DefaultTableModel();
      JTable table = new JTable(tableModel);
      tableModel.addColumn("Time");
      tableModel.addColumn("What you can eat");
      // applying adjustments to the next column only
      table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
      tableModel.addRow(new Object[] { "Breakfast: ", "24-ounce Jamba Juice Protein Berry Pizzazz Smoothie."});
      tableModel.addRow(new Object[] { "Morning Snack:", " 1 packet instant oatmeal sprinkled with 1 tablespoon ground flaxseed"});
      tableModel.addRow(new Object[] { "Lunch: ", " Asian grilled-chicken salad with mixed greens, edamame, mandarin oranges"});
      tableModel.addRow(new Object[] { "Afternoon Snack:", "Medium orange and 1 tablespoon chopped walnuts"});
      tableModel.addRow(new Object[] { "Dinner: ", "7 pieces sushi and 1 cup edamame"});
      tableModel.addRow(new Object[] { "Evening Treat:", "Gingerbread ice cream sandwich"});
     
       font = new Font("times new roman", Font.CENTER_BASELINE, 18);
      table.setFont(font);
      table.setBounds(0, 0, 1300, 700);
      table.setRowHeight(45);
      table.setBackground(Color.black);
      table.setForeground(Color.white);
      JFrame frame = new JFrame();
      frame.setBounds(104, 200, 1300, 345);
      frame.setTitle("Daily Plans");
      frame.getContentPane().add(new JScrollPane(table));
      frame.setVisible(true);
   }





}
