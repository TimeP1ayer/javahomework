import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class main {
    public static void main(String[] args) {

        //创建数字对象
        number mynum = new number();

        //创建随机器
        Random random = new Random();

        //初始化数字对象
        mynum.setNumber1(random.nextInt(10));
        mynum.setNumber2(random.nextInt(10));

        System.out.println(mynum.getNumber1() +" "+ mynum.getNumber2());

        //设定字体大小
        Font font = new Font("Arial",Font.PLAIN,20);

        //新键一个窗口，参数为窗口标题
        JFrame frame = new JFrame("Demo_ch2_2 by 3122004525");

        //窗口关闭时退出整个程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //设置窗口大小
        frame.setSize(400,300);



        //创建面板
        JPanel panel =new JPanel();

        frame.add(panel);

        //创建标签
        JLabel num1 = new JLabel(mynum.getNumber1()+"+"+mynum.getNumber2()+"="+mynum.getPlus());
        JLabel num2 = new JLabel(mynum.getNumber1()+"*"+mynum.getNumber2()+"="+mynum.getMulti());

        num1.setFont(font);
        num2.setFont(font);




        //添加刷新按钮
        JButton button = new JButton("刷新数字");

        //添加控件至面板
        panel.add(num1);
        panel.add(num2);
        panel.add(button);

        //调整控件布局
        panel.setLayout(null);

        num1.setBounds(170,20,100,20);
        num2.setBounds(170,60,100,20);
        button.setBounds(160,100,80,30);

        //为按钮添加监视器
        button.addActionListener(
                e -> {
                    //刷新数据
                    mynum.setNumber1(random.nextInt(10));
                    mynum.setNumber2(random.nextInt(10));
                    System.out.println(mynum.getNumber1() +" "+ mynum.getNumber2());
                    mynum.setMulti();
                    mynum.setPlus();
                    num1.setText(mynum.getNumber1()+"+"+mynum.getNumber2()+"="+mynum.getPlus());
                    num2.setText(mynum.getNumber1()+"*"+mynum.getNumber2()+"="+mynum.getMulti());
                    frame.repaint();
                }
        );

        //显示窗口
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
}}
