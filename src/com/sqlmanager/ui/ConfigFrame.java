package com.sqlmanager.ui;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigFrame extends JFrame {
	
	private Box textBox=Box.createHorizontalBox();
	private Box bottonBox=Box.createHorizontalBox();
	private Box mainBox=Box.createHorizontalBox();
	
	private JLabel mysqlHomeLabel=new JLabel("MySQL�İ�װĿ¼��");
	private JTextField mysqlHomeField=new JTextField();
	
	private JButton confirmButton=new JButton("ȷ��");
	private JButton cancelButtuon=new JButton("ȡ��");
	private JButton chooseButton=new JButton("ѡ��");

}
