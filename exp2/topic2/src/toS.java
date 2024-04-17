public class toS {
    public void toS(Employee p){
        System.out.println("姓名："+p.name);
        System.out.println("工作类型："+p.getClass().getName());
        System.out.println("当月工资:"+p.salary());
        System.out.println("id:"+p.id);
        System.out.println("出生年月:"+p.birthYear+"/"+p.birthMonth);
        System.out.println();
    }
}
