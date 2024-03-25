import java.util.Random;

public class Main {
    public static void main(String args[]){
        int sum=0,max = Integer.MIN_VALUE;
        float avg=0;
        Random random = new Random();
        int []b=new int[20];
        for (int i = 0; i < b.length; i++) {
            b[i]=random.nextInt(100);
        }

        System.out.println("生成数字为：");
        for (int i:b) {
            System.out.print(i+"  ");
        }

        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
            sum=sum+b[i];
        }


        System.out.println("最大数为："+max);

        avg=sum/b.length;
        System.out.println("平均数为："+avg);

        int count=0;
        for(int j=0;j<b.length;j++) {
            boolean prime=true;
            for(int y=2;y<b[j];y++) {
                if(b[j]%y==0) {
                    prime=false;
                    break;
                }
            }
            if(prime) {
                count++;
            }
        }
        System.out.println("素数的个数为："+count);
    }
}
