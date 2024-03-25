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

        int num1 = mynum.getNumber1();
        int num2 = mynum.getNumber2();

        System.out.println(num1 +" "+ num2);

        String multi= num1+"x"+num2+"="+num2*num1;
        String plus = num1+"+"+num2+"="+num2+num1;

        JOptionPane.showMessageDialog(null,multi+"  "+plus,"提示",JOptionPane.PLAIN_MESSAGE);

}}
