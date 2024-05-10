//Customer.java
public class User extends Thread {
    private String name;
    private int money;
    //操作码，1为存钱，-1为取钱
    private int code;

    public User(String name) {
        this.name=name;
    }

    @Override
    public void run() {
        //每个用户存钱的次数
        int t = (int)(Math.random()*4+1);
        int j = 1;
        for (int i = 0; i < t; i++) {
            j*=-1;
            //每次存入的钱数随机
            int money = ((int)(Math.random()*9+1))*100;
            this.setMoney(money);
            this.setCode(j);
            //向账户中存入钱
            Bank.updateTotal(this);
        }
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUserName() {
        return this.name;
    }

    public int getMoney() {
        return money;
    }

    public int getCode() {
        return code;
    }

}

