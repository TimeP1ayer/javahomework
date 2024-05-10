public class Bank {
    private static int total = 5000;

    public synchronized static void updateTotal(User user) {
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) { }
        total += user.getMoney()*user.getCode();
        String op =  " 存了 ";
        if(user.getCode()==-1){
            op=" 取了 ";
        }
        System.out.println(user.getUserName() + op + user.getMoney() + "元");
        System.out.println("当前银行账户总额：" + total + "元\n");
    }
}


