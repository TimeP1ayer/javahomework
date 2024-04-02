public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("kobe","24","man");
        Student s1 = new Student("张三","25","男",3122,"se4");
        Teacher t1 = new Teacher("李四","26","man","chinese","dd");

        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(t1.toString());

    }
}
