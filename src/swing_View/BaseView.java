/*
 * 메인 페이지
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
		tabbedPane.add("주문", mainPanel);
		StockView stockView = new StockView();
		tabbedPane.add("재고 조회", stockView);
		SalesManagement salesManagement = new SalesManagement();
		tabbedPane.add("판매 관리", salesManagement);
		ManagerView managerView = new ManagerView();
		tabbedPane.add("관리자", managerView);
		SalesView salesView = new SalesView();
		tabbedPane.add("매장 매출", salesView);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new BaseView();
	}
}
