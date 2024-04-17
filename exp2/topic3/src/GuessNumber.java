import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

    /**
     * point 得分
     * count 轮数
     */
    int point = 0;
    int count=1;

    public void judge()
    {
        int choice;
        try {

            System.out.println("1.再来一次");
            System.out.println("2.退出");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (choice) {
                    case 1: {
                        break;
                    }
                    case 2: {
                        System.exit(0);
                        break;
                    }
                    default: {
                        System.out.println("输入范围错误!请输入0-1：");
                        judge();
                    }
            }

        }
        catch (InputMismatchException e) //非整数(小数、字符)会被捕获
        {
            System.out.println("请输入整数!");
            judge();
        }
    }

    //计算得分
    public int point(int count)
    {
        if(count<=3){
            this.point += 4-count;
        }
        else {
            this.point -= 2;
        }
        this.count=1;
        return this.point;
    }

    //猜数部分
    //num为答案

    public int startguess(int num) //返回值为count
    {


        if (this.count<4){
            System.out.println("当前得分："+this.point);
            System.out.println("这是你的第"+this.count+"次猜数：");
        }else {
            System.out.println("猜数机会已用完，本轮游戏结束");
            System.out.println();
            judge();
            return this.count;
        }

        try {
            Scanner sc = new Scanner(System.in);
            int input_number;

            System.out.println("请输入你猜的数(0-99)：");
            input_number = sc.nextInt();
            //清除缓冲区
            sc.nextLine();
            if (input_number < 0 || input_number > 99)
            {
                //防止输入范围出错
                System.out.println("输入的整数范围：[0,99]");
                return startguess(num);
            }
            else
            {
                //猜小了
                if (input_number < num)
                {
                    System.out.println("猜小了");
                    System.out.println();
                    this.count++;
                    if(this.count==4){
                        return startguess(num);
                    }

                    judge();
                    return startguess(num);
                }
                //猜大了
                else if (input_number > num)
                {
                    System.out.println("猜大了");
                    System.out.println();
                    this.count++;
                    if(this.count==4){
                        return startguess(num);
                    }

                    judge();
                    return startguess(num);
                }
                //猜中了
                else
                {
                    System.out.println("猜中了");
                    return this.count;
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("请输入整数!");
            startguess(num);
        }
        return -1;
    }

}
