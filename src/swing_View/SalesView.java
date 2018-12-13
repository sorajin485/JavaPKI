/*
 * [3 메뉴 패널]
 * 		매장 매출 조회
 */

package swing_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SalesView extends JPanel {
	private JTable table;
	public SalesView() {
		setSize(1280,720);
		setLayout(null);
		
		String titleLabel[] = {"날짜", "총 매출"};
		DefaultTableModel model = new DefaultTableModel(titleLabel, 0);
		
		table = new JTable(model);
//		table.addMouseListener(new JTableMouseListener());
		
		for (int i = 0; i < 30; i++) {
			String test[] = { "", "" };
			model.addRow(test);
		}
		table.setRowHeight(50);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 1256, 662);
		add(scrollPane);
		
		setVisible(true);
	}
}
