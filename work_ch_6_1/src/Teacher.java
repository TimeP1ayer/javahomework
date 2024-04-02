public class Teacher extends Person{
    String subject;
    String branch;

    public Teacher(String name, String age, String sex, String subject, String branch) {
        super(name, age, sex);
        this.subject = subject;
        this.branch = branch;
    }


    @Override
    public String toString(){
        return super.toString()+" 职称："+ subject +" 部门："+branch;
    }

}
