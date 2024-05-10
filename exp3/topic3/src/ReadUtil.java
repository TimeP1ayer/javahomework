import java.io.*;
import java.util.Random;

public class ReadUtil {

    public static String RandomNum() {
        int N = 6;
        StringBuilder chaptcha = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            chaptcha.append(rand.nextInt(10));
        }
        return chaptcha.toString();
    }

    public static void ReadFile(File file) throws IOException //读取文件
    {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String data;
        while ((data = bufferedReader.readLine()) != null)
        {
            System.out.println(data); //逐行打印结果，printf是为了输出\t
        }
        bufferedReader.close();
        fileReader.close();
    }

    public static void WriteFile(File file, Student []stu_arr) throws IOException //写入文件
    {
        FileWriter fileWriter = new FileWriter(file,false); //要覆盖之前的内容，选择false
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student s : stu_arr)
        {
            bufferedWriter.write(s.toString());
            bufferedWriter.newLine(); //写入一个学生的信息后换行
        }
        bufferedWriter.close();
        fileWriter.close();
    }

}
