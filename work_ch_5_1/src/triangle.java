public class triangle {
    private double a;
    private double b;
    private double c;

    public double getPerimeter(){
        double perimeter = this.a +this.b+this.c;
        return perimeter;
    }

    public double getArea(){
        double delta = getPerimeter()/2;
        double area = Math.sqrt(delta*(delta-a)*(delta-b)*(delta-c));
        return area;
    }

    public triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void printInfo(){
        System.out.println("周长："+getPerimeter());
        System.out.println("面积："+getArea());
    }

    public static void main(String[] args) {
        triangle t1 = new triangle(3,4,5);
        triangle t2 = new triangle(7,8,9);
        t1.printInfo();
        t2.printInfo();
    }


}
