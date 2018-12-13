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
import javax.swing.JScrollBar;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ScrollPaneConstants;

public class ManagerView extends JPanel{
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	public ManagerView() {
		setSize(1280, 720);
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 0, 402, 90);
		panel.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("직원 관리");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		panel_3.add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 100, 402, 70);
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("직원 추가");
		btnNewButton.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//다이얼로그창 띄워 직원추가
			}
		});
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("직원 삭제");
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//목록 체크박스 활성화 -> 선택 후 버튼 삭제
			}
		});
		panel_6.add(btnNewButton_1);
		
		//직원 관리 테이블 목록
		String titleLabel[] = {"직원 번호", "직원 이름", "직원 전화번호","비고"};
		DefaultTableModel model = new DefaultTableModel(titleLabel, 0);
		table = new JTable(model);
			//테이블 데이터 입력
		for (int i = 0; i < 30; i++) {
			String test[] = { "", "", "", "" };
			model.addRow(test);
		}
		table.setRowHeight(50);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 180, 402, 530);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 0, 402, 90);
		panel_1.add(panel_4);
		
		JLabel lblNewLabel_1 = new JLabel("회원 관리");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 100, 402, 70);
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_2 = new JButton("고객 추가");
		btnNewButton_2.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_7.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("고객 삭제");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("나눔고딕", Font.BOLD, 20));
		panel_7.add(btnNewButton_3);
		
		//고객관리 테이블 목록
		String titleLabel1[] = {"고객 번호", "고객 이름", "보유 포인트","비고"};
		DefaultTableModel model1 = new DefaultTableModel(titleLabel1, 0);
		table_1 = new JTable(model1);
		
			//테이블 데이터 입력
		for (int i = 0; i < 30; i++) {
			String test1[] = { "", "", "", "" };
			model1.addRow(test1);
		}
		table_1.setRowHeight(50);
		
		JScrollPane scrollPane_1 = new JScrollPane(table_1);
		scrollPane_1.setBounds(10, 180, 402, 530);
		panel_1.add(scrollPane_1);
		

		
		JPanel panel_2 = new JPanel();
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 0, 400, 90);
		panel_2.add(panel_5);
		
		JLabel lblNewLabel_2 = new JLabel("상품 관리");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 100, 402, 70);
		panel_2.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_4 = new JButton("상품 추가");
		btnNewButton_4.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_8.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("상품 삭제");
		btnNewButton_5.setFont(new Font("나눔고딕", Font.BOLD, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_8.add(btnNewButton_5);
		
		//상품관리 테이블 목록
		String titleLabel2[] = {"상품 번호", "카테고리", "상품 이름","상품 가격","수량","비고"};
		DefaultTableModel model2 = new DefaultTableModel(titleLabel2, 0);
		table_2 = new JTable(model2);
		
			//테이블 데이터 입력
		for (int i = 0; i < 30; i++) {
			String test2[] = { "", "", "", "", "", "" };
			model2.addRow(test2);
		}
		table_2.setRowHeight(50);
		
		JScrollPane scrollPane_2 = new JScrollPane(table_2);
		scrollPane_2.setBounds(12, 180, 402, 530);
		panel_2.add(scrollPane_2);
		
		
	}
}
