import SalaryInterface.SalesVolume;

public class CommissionEmployee extends Employee implements SalesVolume {

    int SalesAmount;

    public CommissionEmployee(int id,String name,int birthYear,int birthMouth,int salesAmount) {
        this.id=id;
        this.name=name;
        this.birthYear=birthYear;
        this.birthMonth=birthMouth;
        SalesAmount = salesAmount;
    }

    @Override
    public int salary() {
        salary = SalesAmount*SalaryPerSale;
        RedEnvelope r = new RedEnvelope();
        return salary+r.RedEnvelope(this);
    }


}
