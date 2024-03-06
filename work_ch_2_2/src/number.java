public class number {
    int number1;
    int number2;

    int plus ;
    int multi ;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getMulti() {
        return multi;
    }

    public int getPlus() {
        return plus;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setMulti() {
        this.multi = this.number1*this.number2;
    }

    public void setPlus() {
        this.plus = this.number1+this.number2;
    }
}
