/*
 * [4 메뉴 패널]
 * 		관리자 페이지
 */

package swing_View;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ManagerView extends JPanel{
	private JTable table;
	public ManagerView() {
		setSize(1280, 720);
		setLayout(null);
		
		String title[] = {"id", "이름", "생일", "포인트"};
		DefaultTableModel model = new DefaultTableModel(title, 0);
		
		table = new JTable(model);
		
		for (int i = 0; i < 30; i++) {
			String test[] = { "", "","","" };
			model.addRow(test);
		}
		table.setRowHeight(50);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 717, 572, -618);
		add(scrollPane);

		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1142, 99);
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uBAA9\uB85D");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC7AC\uACE0\uAD00\uB9AC");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(570, 98, 572, 622);
		add(panel_2);
		panel_2.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uCE74\uD14C\uACE0\uB9AC");
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_16 = new JLabel("\uC0C1\uD488\uBA85");
		panel_2.add(lblNewLabel_16);
		
		JLabel lblNewLabel_15 = new JLabel("\uC218\uB7C9");
		panel_2.add(lblNewLabel_15);
		
		JLabel lblNewLabel_14 = new JLabel("\uAC00\uACA9");
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13 = new JLabel("");
		panel_2.add(lblNewLabel_13);
		
		JLabel product_category01 = new JLabel("product_category01");
		panel_2.add(product_category01);
		
		JLabel product_name01 = new JLabel("New label");
		panel_2.add(product_name01);
		
		JLabel product_conut01 = new JLabel("New label");
		panel_2.add(product_conut01);
		
		JLabel product_price01 = new JLabel("New label");
		panel_2.add(product_price01);
		
		JButton btn_modify01 = new JButton("New button");
		panel_2.add(btn_modify01);
		
		JLabel product_category02 = new JLabel("New label");
		panel_2.add(product_category02);
		
		JLabel product_name02 = new JLabel("New label");
		panel_2.add(product_name02);
		
		JLabel product_conut02 = new JLabel("New label");
		panel_2.add(product_conut02);
		
		JLabel product_price02 = new JLabel("New label");
		panel_2.add(product_price02);
		
		JButton btn_modify02 = new JButton("New button");
		panel_2.add(btn_modify02);
		
		JLabel product_category03 = new JLabel("New label");
		panel_2.add(product_category03);
		
		JLabel product_name03 = new JLabel("New label");
		panel_2.add(product_name03);
		
		JLabel product_conut03 = new JLabel("New label");
		panel_2.add(product_conut03);
		
		JLabel product_price03 = new JLabel("New label");
		panel_2.add(product_price03);
		
		JButton btn_modify03 = new JButton("New button");
		panel_2.add(btn_modify03);
		
		JLabel product_category04 = new JLabel("New label");
		panel_2.add(product_category04);
		
		JLabel product_name04 = new JLabel("New label");
		panel_2.add(product_name04);
		
		JLabel product_conut04 = new JLabel("New label");
		panel_2.add(product_conut04);
		
		JLabel product_price04 = new JLabel("New label");
		panel_2.add(product_price04);
		
		JButton btn_modify04 = new JButton("New button");
		panel_2.add(btn_modify04);
		
		JLabel product_category05 = new JLabel("New label");
		panel_2.add(product_category05);
		
		JLabel product_name05 = new JLabel("New label");
		panel_2.add(product_name05);
		
		JLabel product_conut05 = new JLabel("New label");
		panel_2.add(product_conut05);
		
		JLabel product_price05 = new JLabel("New label");
		panel_2.add(product_price05);
		
		JButton btn_modify05 = new JButton("New button");
		panel_2.add(btn_modify05);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(1141, 98, 139, 622);
		add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btn_product_add = new JButton("\uC0C1\uD488\uCD94\uAC00");
		panel_3.add(btn_product_add);
		
		JButton btn_member_add = new JButton("\uD68C\uC6D0\uCD94\uAC00");
		panel_3.add(btn_member_add);
		
		JButton btn_member_del = new JButton("\uD68C\uC6D0\uC0AD\uC81C");
		panel_3.add(btn_member_del);
		
		JButton btn_employee_add = new JButton("\uC9C1\uC6D0\uCD94\uAC00");
		panel_3.add(btn_employee_add);
		
		JButton btn_employee_del = new JButton("\uC9C1\uC6D0\uC0AD\uC81C");
		panel_3.add(btn_employee_del);
		
		
		setVisible(true);
	}
}
