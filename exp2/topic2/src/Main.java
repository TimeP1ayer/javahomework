public class Main {
    public static void main(String[] args) {
        Employee []employees = new  Employee[4];
        employees[0] = new SalariedEmployee(1,"小明",2000,8);
        employees[1] = new HourlyEmployee(2,"小红",2001,4,165);
        employees[2] = new CommissionEmployee(3,"小张",2002,5,180);
        employees[3] = new BasePlusCommissionEmployee(4,"小南",1999,3,165);

        toS s = new toS();
        for (int i = 0; i < employees.length; i++) {
            s.toS(employees[i]);
        }

    }
}
