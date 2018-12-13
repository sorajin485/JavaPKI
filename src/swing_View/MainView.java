/*
 * [1 메뉴 패널]
 * 		주문 및 계산
 */

package swing_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JMenuBar;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import java.awt.Panel;

public class MainView extends JPanel {
	private JTextField tf_memberId;
	private JTextField tf_point;
	private JTable table;
	private JTable table_1;

	public MainView() {
		setSize(1280, 720);
		setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 0, 1, 1);
		add(list);
		
		table = new JTable();
		table.setBounds(0, 646, 466, -645);
		add(table);
		
		JPanel productMenuPanel = new JPanel();
		productMenuPanel.setBounds(0, 0, 466, 647);
		add(productMenuPanel);
		productMenuPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel productCategory1 = new JLabel("카테고리 1");
		productMenuPanel.add(productCategory1);
		
		JLabel productCategory2 = new JLabel("카테고리 2");
		productMenuPanel.add(productCategory2);
		
		JLabel productCategory3 = new JLabel("카테고리 3");
		productMenuPanel.add(productCategory3);
		
		JLabel productCategory4 = new JLabel("카테고리 4");
		productMenuPanel.add(productCategory4);
		
		JLabel product001 = new JLabel("New label");
		productMenuPanel.add(product001);
		
		JLabel product002 = new JLabel("New label");
		productMenuPanel.add(product002);
		
		JLabel product003 = new JLabel("New label");
		productMenuPanel.add(product003);
		
		JLabel product004 = new JLabel("New label");
		productMenuPanel.add(product004);
		
		JLabel product005 = new JLabel("New label");
		productMenuPanel.add(product005);
		
		JLabel product006 = new JLabel("New label");
		productMenuPanel.add(product006);
		
		JLabel product007 = new JLabel("New label");
		productMenuPanel.add(product007);
		
		JLabel product008 = new JLabel("New label");
		productMenuPanel.add(product008);
		
		JLabel product009 = new JLabel("New label");
		productMenuPanel.add(product009);
		
		JLabel product010 = new JLabel("New label");
		productMenuPanel.add(product010);
		
		JLabel product011 = new JLabel("New label");
		productMenuPanel.add(product011);
		
		JLabel product012 = new JLabel("New label");
		productMenuPanel.add(product012);
		
		JLabel product013 = new JLabel("New label");
		productMenuPanel.add(product013);
		
		JLabel product014 = new JLabel("New label");
		productMenuPanel.add(product014);
		
		JLabel product015 = new JLabel("New label");
		productMenuPanel.add(product015);
		
		JLabel product016 = new JLabel("New label");
		productMenuPanel.add(product016);
		
		JLabel product017 = new JLabel("New label");
		productMenuPanel.add(product017);
		
		JLabel product018 = new JLabel("New label");
		productMenuPanel.add(product018);
		
		JLabel product019 = new JLabel("New label");
		productMenuPanel.add(product019);
		
		JLabel product020 = new JLabel("New label");
		productMenuPanel.add(product020);
		
		JLabel product021 = new JLabel("New label");
		productMenuPanel.add(product021);
		
		JLabel product022 = new JLabel("New label");
		productMenuPanel.add(product022);
		
		JLabel product023 = new JLabel("New label");
		productMenuPanel.add(product023);
		
		JLabel product024 = new JLabel("New label");
		productMenuPanel.add(product024);
		
		JPanel orderPanel = new JPanel();
		orderPanel.setBounds(472, 0, 355, 537);
		add(orderPanel);
		
		
		
		
		//상품 클릭시 메뉴 수량 금액 테이블 뷰
		String title2[] = {"메뉴", "수량", "금액"};
		DefaultTableModel model2 = new DefaultTableModel(title2, 0);
		orderPanel.setLayout(new GridLayout(0, 1, 0, 0));
		table_1 = new JTable(model2);
		for (int i = 0; i < 30; i++) {
			String test[] = { "", "", "", "" };
			model2.addRow(test);
		}
		table_1.setRowHeight(50);
		JScrollPane scrollPane2 = new JScrollPane(table_1);
		orderPanel.add(scrollPane2);
		
		
		
		
		tf_memberId = new JTextField();
		tf_memberId.setBounds(996, 39, 116, 21);
		add(tf_memberId);
		tf_memberId.setColumns(10);
		
		JLabel label = new JLabel("\uD68C\uC6D0");
		label.setBounds(876, 42, 108, 15);
		add(label);
		
		JButton btn_memberIDcheck = new JButton("New button");
		btn_memberIDcheck.setBounds(1124, 38, 97, 23);
		add(btn_memberIDcheck);
		
		JLabel memberName = new JLabel("New label");
		memberName.setBounds(996, 93, 57, 15);
		add(memberName);
		
		JLabel memberPoint = new JLabel("New label");
		memberPoint.setBounds(996, 118, 57, 15);
		add(memberPoint);
		
		JButton btn_cardPayment = new JButton("card");
		btn_cardPayment.setBounds(839, 236, 228, 113);
		add(btn_cardPayment);
		 
		JButton btn_moneyPayment = new JButton("money");
		btn_moneyPayment.setBounds(839, 359, 228, 113);
		add(btn_moneyPayment);
		
		JButton btn_cancel = new JButton("cancel");
		btn_cancel.setBounds(839, 489, 228, 113);
		add(btn_cancel);
		
		JLabel point = new JLabel("New label");
		point.setBounds(996, 143, 57, 15);
		add(point);
		
		tf_point = new JTextField();
		tf_point.setBounds(952, 168, 116, 21);
		add(tf_point);
		tf_point.setColumns(10);
		
		JButton btn_inputPoint = new JButton("inputPoint");
		btn_inputPoint.setBounds(1078, 167, 87, 23);
		add(btn_inputPoint);
		
		JPanel panel = new JPanel();
		panel.setBounds(472, 547, 355, 100);
		add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel receiveAmount = new JLabel("New label");
		panel.add(receiveAmount);
		
		JLabel change = new JLabel("New label");
		panel.add(change);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		panel.add(lblNewLabel_17);
		
		JLabel label_1 = new JLabel("New label");
		panel.add(label_1);

		
		setVisible(true);
	}
}
