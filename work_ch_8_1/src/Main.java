
abstract class fruit {//定义抽象类
    protected double weight;
    abstract public double getWeight() ;
}

class apple extends fruit {//定义苹果类
    public apple(double weight) {
        this.weight=weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}

class peach extends fruit {//定义桃子类
    public peach(double weight) {
        this.weight=weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}

class orange extends fruit {//定义橘子类
    public orange(double weight) {
        this.weight=weight;
    }
    @Override
    public double getWeight() {
        return weight;
    }
}

public class Main {

    public static void main(String[] args) {

        fruit fruits[]=new fruit[3];
        fruits[0]=new apple(3.14159);
        fruits[1]=new peach(0.11111);
        fruits[2]=new orange(100.5);

        for(int i=0;i<fruits.length;i++) {
            System.out.println(fruits[i].getClass().getName()+"  weight: "+fruits[i].getWeight());
        }

    }
}
