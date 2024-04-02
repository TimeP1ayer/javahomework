import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] id  = new String[50];
        String [] set  = new String[50];

        //给定初始座位
        for(int i = 1;i<=50;i++){
            String idname;
            if(i<10){
                idname = "0"+i;
            }else {
                idname = ""+i;
            }
            set[i-1]=idname;
        }

        //给定初始学号
        for(int i = 1;i<=50;i++){
            String setname;
            if(i<10){
                setname = "a0"+i;
            }else {
                setname = "a"+i;
            }
            id[i-1]=setname;
        }

        List<String> list=new ArrayList<String>(Arrays.asList(set));
        Random rand=new Random(50);
        //打乱顺序
        Collections.shuffle(list,rand);
        //输出数对
        for(int i = 0;i<50;i++){
            System.out.print("("+id[i]+","+ list.get(i) +")");
            if (i!=49){
                System.out.print(", ");
            }
            if (i!=0&&(i+1)%10==0){
                System.out.println("");
            }
        }
    }
}
