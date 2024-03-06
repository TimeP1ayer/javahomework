import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.println("输入半径:");
        Scanner sc = new Scanner(System.in);
        float i = sc.nextInt();
        float pi =  3.14159f;
        float zc = 2*pi*i;
        float mj = pi*i*i;

        System.out.println("周长: "+String.format("%.4f", zc));
        System.out.println("面积: "+String.format("%.4f", mj));
    }
}
