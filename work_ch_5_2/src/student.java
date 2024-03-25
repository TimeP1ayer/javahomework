public class student {
    public static class Student {
        int no;
        String name;
        int age;

        Student(int no, String name, int age){
            this.no=no;
            this.name=name;
            this.age=age;
        }

        void Add(Student[] arr) {
            for(int i=0;i<arr.length;i++) {
                arr[i].age+=1;
            }
        }

        void Check(Student[] arr) {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].age>20) {
                    System.out.println("学号："+arr[i].no+"|"+"姓名："+arr[i].name+"|"+"年龄："+arr[i].age);
                }
            }
        }

        void Print(Student[] arr) {
            for(int i=0;i<arr.length;i++) {
                System.out.println("学号："+arr[i].no+"|"+"姓名："+arr[i].name+"|"+"年龄："+arr[i].age);
            }
        }
    }

    public static void main(String[] args) {

        Student student1=new Student(1011,"stu1",14);
        Student student2=new Student(1703,"stu2",20);
        Student student3=new Student(1204,"stu3",28);
        Student student4=new Student(1468,"stu4",26);

        Student[] arr= {student1,student2,student3,student4};

        System.out.println("学生初始信息:");
        student1.Print(arr);
        student1.Add(arr);
        System.out.println("学生年龄加一后:");
        student1.Print(arr);
        System.out.println("年龄大于20的学生:");
        student1.Check(arr);
    }
}
