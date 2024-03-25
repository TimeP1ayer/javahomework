import java.util.*;

public class saPlus {

        public static void main(String []args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("加的数a是谁(1-9):");
            int a = scanner.nextInt();

            System.out.print("几个数相加(n):");
            int n = scanner.nextInt();


            int c=a;
            int s=0;
            for(int i=1;i<=n;i++) {
                s+=a;
                a=a*10;
                a+=c;
            }

            System.out.println(s);
        }
}
