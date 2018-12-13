/*
 * [5 메뉴 패널]
 * 		판매 관리(영수증)
 */

package swing_View;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SalesManagement extends JPanel{
	private JTable table;
	public SalesManagement() {
		setSize(1280,720);
		setLayout(null);
		
		String titleLabel[] = {"시간", "주문내역", "가격",""};
		DefaultTableModel model = new DefaultTableModel(titleLabel, 0);
		
		table = new JTable(model);
		table.addMouseListener(new JTableMouseListener());
		
		
		for (int i = 0; i < 30; i++) {
			String test[] = { "", "", "", "" };
			model.addRow(test);
		}
		table.setRowHeight(50);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 1048, 662);
		add(scrollPane);
		
		
		setVisible(true);
	}
	
	private class JTableMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			JTable jtable = (JTable)e.getSource();
			int row = jtable.getSelectedRow();
			int col = jtable.getSelectedColumn();
			
			//테이블 데이터 처리
			System.out.println("row :"+row+"  col"+col);
		}

		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}
}
