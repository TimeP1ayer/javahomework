public class Person {
    String name;
    String age;
    String sex;

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString(){
        return "姓名："+name+" 年龄："+age+" 性别："+sex;
    }

}
