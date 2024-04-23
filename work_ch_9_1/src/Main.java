import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String s= JOptionPane.showInputDialog("请输入复数计算字符串");
        complex a = new complex(0,0);
        a = a.plus(a.returnComplexCollection(s));
        System.out.println(s+"="+"("+a.x+","+a.y+"i)");
    }
}
