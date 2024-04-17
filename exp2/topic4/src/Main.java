public class Main {
    public static void main(String[] args) {
        Person jack = new Person("jack",23,"male",null);
        Person Hammer = new Person("Hammer",25,"male",null);
        Person jay = new Person("jay",25,"male","luck");

        Person anna = new Person("anna",22,"women",null);
        Person Shara = new Person("Shara",22,"women","handsome boy");
        Person Susan = new Person("Susan ",19,"women",null);

        System.out.println("jack:");
        jack.marry(anna);
        jack.marry(Shara);
        jack.marry(Susan);
        System.out.println();

        System.out.println("jay:");
        jay.marry(anna);
        jay.marry(Shara);
        jay.marry(Susan);
        System.out.println();

        System.out.println("Hammer:");
        Hammer.marry(Hammer);
        Hammer.marry(Shara);
        Hammer.marry(anna);
        Hammer.marry(Susan);

    }
}
