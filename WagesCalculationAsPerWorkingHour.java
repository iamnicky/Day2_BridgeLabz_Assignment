import java.util.Scanner;
import java.util.logging.Handler;

public class WagesCalculationAsPerWorkingHour {
    private static final int PART_TIME_WAGE_HOUR = 4;
    private static final int FULL_TIME_WAGE_HOUR = 8;
    private static final int CHARGE_PER_HOUR = 20;
    public void calculateWagesAsPerWorkingHour() {
        System.out.println("Please select an option:\n1. Full Time Employee\n2. Part time Employee");
        Scanner sc = new Scanner(System.in);
        int typeOfEmployee = sc.nextInt();
        switch (typeOfEmployee){
            case 1:
                System.out.println("Employee Wages: ₹"+FULL_TIME_WAGE_HOUR*CHARGE_PER_HOUR);
                break;
            case 2:
                System.out.println("Employee Wages: ₹"+ PART_TIME_WAGE_HOUR *CHARGE_PER_HOUR);
                break;
            default:
                System.out.println("INVALID INPUT!");
                break;
        }
    }
}
