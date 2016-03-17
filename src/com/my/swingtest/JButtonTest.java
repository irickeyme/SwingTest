package com.my.swingtest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.border.CompoundBorder;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class JButtonTest extends JFrame {

	private JPanel contentPane;
	private JTextField txtHimaybeALittle;
	private final JLabel lblNewLabel = new JLabel("");
	private JList<String> list;
	private JLabel label;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JButtonTest frame = new JButtonTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JButtonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtHimaybeALittle = new JTextField();
		txtHimaybeALittle.setText("hi,maybe a little tired");
		contentPane.add(txtHimaybeALittle, BorderLayout.NORTH);
		txtHimaybeALittle.setColumns(10);
		
		label = new JLabel("");
		contentPane.add(label, BorderLayout.CENTER);
		list = new JList<String>();
		list.setModel(new AbstractListModel<String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			String[] values = new String[] {"java", "c++", "ruby", "pthyon"};
			public int getSize() {
				return values.length;
			}
			public String getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(list, BorderLayout.WEST);
		

		JButton btnGet = new JButton("get");
		lblNewLabel.setLabelFor(btnGet);
		btnGet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				label.setText(list.getSelectedValue());
				
			}
		});
		btnGet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnGet, BorderLayout.SOUTH);
	
		
		
	}

}
