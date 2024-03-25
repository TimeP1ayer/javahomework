import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("运动员人数为(输入0结束):");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            if(n==0){break;}

            //组数
            int group = n / 8;
            //余数
            int mod = n % 8;

            //有余数，组数+1
            if (mod != 0) {
                group++;
            }

            int[] arr = new int[group];

            Arrays.fill(arr, n / group);

            for (int i = 0; i < mod; i++) {
                arr[i]++;
            }

            for (int i = 0; i < group; i++) {
                System.out.println("第"+(i+1)+"组为:"+arr[i]+"人");
            }

            System.out.println("运动员人数为:");
    }

}}
