import ru.netology.services.VacationTimeService;


public class Main {

    public static void main(String[] args) {

        VacationTimeService service = new VacationTimeService();
        int vacationMonth = service.vacationCal(10000, 3000, 20000);
        System.out.println(vacationMonth);

    }
}
