import java.util.Scanner;
/**
 * ax2+bx+c=0
 */
public class FunctionSolve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入a: ");
        double a = scanner.nextDouble();
        System.out.print("请输入b: ");
        double b = scanner.nextDouble();
        System.out.print("请输入c: ");
        double c = scanner.nextDouble();

        double d = b*b - 4*a*c;

        if (d < 0) {
            System.out.println("方程无实数根。");
        } else {
            double root1 = (-b + Math.sqrt(d)) / (2*a);
            double root2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("根1: " + root1);
            System.out.println("根2: " + root2);
        }

    }
}