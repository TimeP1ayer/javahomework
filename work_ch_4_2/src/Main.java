import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int num1=0,num2=0;
        String swingText = "";
        //遍历300-305
        for (int i = 300+1;i<350;i+=2) {
            int j;
            //判断素数
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    break;
                }
            }

            //素组则赋值给num1
            if (j >i / 2) {
                num1=i;
                //判断num1和num2是否均为素数
                if (num1 - num2 == 2) {
                    swingText+=num1+"与"+num2+"  ";
                    System.out.println(num2 + ":" + num1);
                    num2 = num1;
                } else {
                    num2 = num1;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"300-350姐妹素数对: "+swingText);
    }

}
