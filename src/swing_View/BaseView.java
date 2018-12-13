/*
 * ���� ������
 */

package swing_View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class BaseView extends JFrame {
	
	public BaseView() {
		setTitle("POS");
		setSize(1280,720);
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setSize(new Dimension(100, 60));
		getContentPane().add(tabbedPane);
		
		MainView mainPanel = new MainView();
		tabbedPane.add("�ֹ�", mainPanel);
		StockView stockView = new StockView();
		tabbedPane.add("��� ��ȸ", stockView);
		SalesManagement salesManagement = new SalesManagement();
		tabbedPane.add("�Ǹ� ����", salesManagement);
		ManagerView managerView = new ManagerView();
		tabbedPane.add("������", managerView);
		SalesView salesView = new SalesView();
		tabbedPane.add("���� ����", salesView);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BaseView();
	}
}
