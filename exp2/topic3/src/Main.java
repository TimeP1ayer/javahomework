import java.util.Random;

public class Main {

    public static void main(String[] args) {

        GuessNumber g = new GuessNumber();
        int answer=0;

        while (true){

            //在第一轮时生成新的数字
            if (g.count==1){
                answer = new Random().nextInt(4);
            }

            g.point(g.startguess(answer));

        }



    }
}
