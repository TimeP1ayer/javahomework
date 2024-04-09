import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] words = new String[10];
        System.out.println("请输入十个单词：");
        Scanner put=new Scanner(System.in);

        int wbegin = 0,includ_or = 0,lenth3 = 0;
        int i = 0;
        for(int j = 0;j < words.length;j++) {
            words[j] = put.next();
        }

        do {
            if(words[i].charAt(0)=='w') {
                wbegin++;
            }
            if(words[i].contains("or")) {
                includ_or++;
            }
            if(words[i].length()==3) {
                lenth3++;
            }
            i++;
        }
        while(i<words.length);

        System.out.println("以字母w开头的单词数："+wbegin);
        System.out.println("单词中含“or”字符串的单词数："+includ_or);
        System.out.println("长度为 3 的单词数："+lenth3);

    }
}
