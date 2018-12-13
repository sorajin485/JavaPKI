/*
 * [2 메뉴 패널]
 * 		재고 조회
 */

package swing_View;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import DataBase.Product;

public class StockView extends JPanel {
	private JTable table;
	// 이거에 값들 받아와서 사용한다
	ArrayList<Product> products = new ArrayList<>();
	// model.addrow(new Object[]{products.get(0).getCategory_ID(), ...}

	public StockView() {
		setSize(1280, 720);
		setLayout(null);

		String titleLabel[] = { "카테고리", "상품명", "수량", "가격" };
		DefaultTableModel model = new DefaultTableModel(titleLabel, 0);

		for (int i = 0; i < 30; i++) {
			String test[] = { "", "", "", "" };
			model.addRow(test);
		}

		table = new JTable(model);
		table.setRowHeight(50);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 1256, 700);
		add(scrollPane);

		setVisible(true);
	}
}
