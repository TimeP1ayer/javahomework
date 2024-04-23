import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 生成一个0到99之间的随机整数作为中奖号码
        int winningNumber = (int) (Math.random() * 100);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入一个整数或命令（quit/give me hint!）: ");
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                System.out.println("游戏结束，再见！");
                break;
            }

            if (input.equals("give me hint!")) {
                System.out.println("中奖号码是：" + winningNumber);
                System.out.println("游戏结束，再见！");
                break;
            }

            try {
                int guess = Integer.parseInt(input);
                if (guess == winningNumber) {
                    System.out.println("你中奖了！");
                    System.out.println("游戏结束，再见！");
                    break;
                } else {
                    System.out.println("没有中奖");
                }
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
            }
        }

        scanner.close();
    }
}
