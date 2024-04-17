import SalaryInterface.GetSalaryPerMonth;
import SalaryInterface.SalesVolume;

public class BasePlusCommissionEmployee extends Employee implements SalesVolume, GetSalaryPerMonth{
    int SalesAmount;

    public BasePlusCommissionEmployee(int id,String name,int birthYear,int birthMouth,int salesAmount) {
        this.id=id;
        this.name=name;
        this.birthYear=birthYear;
        this.birthMonth=birthMouth;
        SalesAmount = salesAmount;
    }

    @Override
    public int salary() {
        salary = SalaryPerSale*SalesAmount+BaseSalary;
        RedEnvelope r = new RedEnvelope();
        return salary+r.RedEnvelope(this);
    }

}
