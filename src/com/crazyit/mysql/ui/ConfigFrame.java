package com.crazyit.mysql.ui;

import com.crazyit.mysql.util.FileUtil;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfigFrame extends JFrame {
    private Box textBox=Box.createHorizontalBox();
    private Box buttonBox=Box.createHorizontalBox();
    private Box mainBox=Box.createVerticalBox();

    private JLabel mysqlHomeLabel=new JLabel("MYSQL的安装目录:  ");
    private JTextField mysqlHomeField=new JTextField();
    private JButton confirmButton=new JButton("确定");
    private JButton cancelButton=new JButton("取消");
    private JButton chooseButton=new JButton("选择");

    public ConfigFrame(){
        Init();
    }

    private void Init(){
        this.mysqlHomeField.setEditable(false);
        this.mysqlHomeField.setText(FileUtil.getMySQLHome());
    }
}
