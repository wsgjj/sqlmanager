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
	
	private JLabel mysqlHomeLabel=new JLabel("MySQL的安装目录：");
	private JTextField mysqlHomeField=new JTextField();
	
	private JButton confirmButton=new JButton("确定");
	private JButton cancelButtuon=new JButton("取消");
	private JButton chooseButton=new JButton("选择");

}
