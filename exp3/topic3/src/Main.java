import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        Student []stu = new Student[5];
        Student s1 = new Student("202401","jason",ReadUtil.RandomNum(),"01");
        Student s2 = new Student("202402","ken",ReadUtil.RandomNum(),"02");
        Student s3 = new Student("202403","Watson",ReadUtil.RandomNum(),"03");
        Student s4 = new Student("202404","Octane",ReadUtil.RandomNum(),"04");
        Student s5 = new Student("202405","horizon",ReadUtil.RandomNum(),"05");
        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        stu[3] = s4;
        stu[4] = s5;


        File file = new File("student_data.txt");

        try {
            ReadUtil.WriteFile(file,stu);
            ReadUtil.ReadFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
