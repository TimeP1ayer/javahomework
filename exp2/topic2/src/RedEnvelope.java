import java.time.LocalDate;

public class RedEnvelope{

    public int RedEnvelope(Employee e) {
        LocalDate currentDate = LocalDate.now();
        int month = currentDate.getMonthValue();
        if (month==e.birthMonth){
            return 100;
        }else {
            return 0;
        }
    }

}
