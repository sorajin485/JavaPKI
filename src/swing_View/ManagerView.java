/*
 * [4 �޴� �г�]
 * 		������ ������
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
		
		JLabel lblNewLabel = new JLabel("���� ����");
		lblNewLabel.setFont(new Font("���� ���", Font.BOLD, 40));
		panel_3.add(lblNewLabel);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 100, 402, 70);
		panel.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("���� �߰�");
		btnNewButton.setFont(new Font("�������", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//���̾�α�â ��� �����߰�
			}
		});
		panel_6.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("���� ����");
		btnNewButton_1.setFont(new Font("�������", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��� üũ�ڽ� Ȱ��ȭ -> ���� �� ��ư ����
			}
		});
		panel_6.add(btnNewButton_1);
		
		//���� ���� ���̺� ���
		String titleLabel[] = {"���� ��ȣ", "���� �̸�", "���� ��ȭ��ȣ","���"};
		DefaultTableModel model = new DefaultTableModel(titleLabel, 0);
		table = new JTable(model);
			//���̺� ������ �Է�
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
		
		JLabel lblNewLabel_1 = new JLabel("ȸ�� ����");
		lblNewLabel_1.setFont(new Font("���� ���", Font.BOLD, 40));
		panel_4.add(lblNewLabel_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 100, 402, 70);
		panel_1.add(panel_7);
		panel_7.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_2 = new JButton("�� �߰�");
		btnNewButton_2.setFont(new Font("�������", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_7.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("�� ����");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("�������", Font.BOLD, 20));
		panel_7.add(btnNewButton_3);
		
		//������ ���̺� ���
		String titleLabel1[] = {"�� ��ȣ", "�� �̸�", "���� ����Ʈ","���"};
		DefaultTableModel model1 = new DefaultTableModel(titleLabel1, 0);
		table_1 = new JTable(model1);
		
			//���̺� ������ �Է�
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
		
		JLabel lblNewLabel_2 = new JLabel("��ǰ ����");
		lblNewLabel_2.setFont(new Font("���� ���", Font.BOLD, 40));
		panel_5.add(lblNewLabel_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(10, 100, 402, 70);
		panel_2.add(panel_8);
		panel_8.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_4 = new JButton("��ǰ �߰�");
		btnNewButton_4.setFont(new Font("�������", Font.BOLD, 20));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_8.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("��ǰ ����");
		btnNewButton_5.setFont(new Font("�������", Font.BOLD, 20));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_8.add(btnNewButton_5);
		
		//��ǰ���� ���̺� ���
		String titleLabel2[] = {"��ǰ ��ȣ", "ī�װ�", "��ǰ �̸�","��ǰ ����","����","���"};
		DefaultTableModel model2 = new DefaultTableModel(titleLabel2, 0);
		table_2 = new JTable(model2);
		
			//���̺� ������ �Է�
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
