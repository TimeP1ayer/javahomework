//student.java
public class Student {
    private String id;
    private String name;
    private String intake;
    private String grade;


    public Student(String id, String name, String intake, String grade) {
        this.id = id;
        this.name = name;
        this.intake = intake;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", intake=" + intake +
                ", grade='" + grade + '\'' +
                '}';
    }
}

