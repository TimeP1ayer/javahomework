import SalaryInterface.WorkHourly;

public class HourlyEmployee extends Employee implements WorkHourly {

    int WorkHour;

    public HourlyEmployee(int id,String name,int birthYear,int birthMouth,int workHour) {
        this.id=id;
        this.name=name;
        this.birthYear=birthYear;
        this.birthMonth=birthMouth;
        WorkHour = workHour;
    }

    @Override
    public int salary() {
        if(WorkHour>StandardWorkHour){
            salary = SalaryPerHour*StandardWorkHour+(WorkHour-StandardWorkHour)*OverTimeSalary;
        }else {
            salary = SalaryPerHour*StandardWorkHour;
        }

        RedEnvelope r = new RedEnvelope();
        return salary+r.RedEnvelope(this);
    }

}
