import SalaryInterface.GetSalaryPerMonth;

public class SalariedEmployee extends Employee implements GetSalaryPerMonth {

    public SalariedEmployee(int id,String name,int birthYear,int birthMouth) {
        this.id=id;
        this.name=name;
        this.birthYear=birthYear;
        this.birthMonth=birthMouth;
    }

    @Override
    public int salary() {
        salary = BaseSalary;
        RedEnvelope r = new RedEnvelope();
       return salary+r.RedEnvelope(this);
    }

}
