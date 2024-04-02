public class Student extends Person{
    int id;
    String classname;

    public Student(String name, String age, String sex, int id, String classname) {
        super(name, age, sex);
        this.id = id;
        this.classname = classname;
    }


    @Override
    public String toString(){
        return super.toString()+" 学号："+id+"班级："+classname;
    }
}
