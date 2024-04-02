import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [][]arr=new int[5][5];

        Random rand = new Random();

        // 生成0到25的随机数
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = rand.nextInt(25);
            }
        }

        System.out.println("按行列输出数组：");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // 求最外一圈元素之和，横向遍历第一行和最后一行的值，竖向遍历第一列和最后一列除头和尾的值，两者同时进行
        int SumOuter = 0;
        for (int i = 0; i < 5; i++) {
            // 第一行的值
            SumOuter += arr[0][i];
            // 最后一行的值
            SumOuter += arr[4][i];
            if (i != 0 && i != 4) {
                // 不计算第一行和最后一行的值
                // 第一列的值
                SumOuter += arr[i][0];
                // 最后一列的值
                SumOuter += arr[i][4];
            }
        }
        System.out.println("最外一圈元素之和：" + SumOuter);

        // 求主对角线中最大元素的值及位置
        int maxD = arr[0][0];
        //最大行
        int maxDR = 0;
        //最大列
        int maxDC = 0;

        for (int i = 1; i < 5; i++) {
            if (arr[i][i] > maxD) {
                maxD = arr[i][i];
                maxDR = i;
                maxDC = i;
            }
        }
        System.out.println("主对角线中最大元素的值：" + maxD);
        System.out.println("最大元素的位置：第" + (maxDR + 1) + "行  第" + (maxDC + 1)+"列");

    }

}
