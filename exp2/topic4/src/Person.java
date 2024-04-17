public class Person {
    String name;
    int age;
    String gender;
    String partner;


    public Person(String name, int age, String gender, String partner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
    }

    boolean agemarry(Person p){
        if (this.gender=="male"&&this.age>23&&p.age>21){
            return true;
        }

        if (this.gender=="women"&&this.age>21&&p.age>23){
            return true;
        }
        return false;

    }

    boolean partnermarry(Person p){
        if (this.partner==null&& p.partner==null){
            return true;
        }
        return false;
    }

    /*
    1)必须是异性，同性不允许结婚。
    2)有配偶者不能结婚。
    3)要达到年龄方可结婚：男方23岁以上，女性21岁以上。
    如果可以结婚，将其partner属性赋值为其配偶。
     */
    void marry(Person p){
        if(this.gender==p.gender){
            System.out.println("gender Error!");
            return;
        }
        if (!agemarry(p)){
            System.out.println("age Error!");
            return;
        }
        if (!partnermarry(p)){
            System.out.println("partner Error!");
            return;
        }

        this.partner=p.name;
        p.partner=this.name;
        System.out.println(this.name + " match " +p.name+"!");
    }

}
