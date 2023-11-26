import java.util.Scanner;

public class MonthlyWages {
    private static final int WORKING_DAYS = 20;
    private static final int PART_TIME_WAGE_HOUR = 4;
    private static final int FULL_TIME_WAGE_HOUR = 8;
    private static final int CHARGE_PER_HOUR = 20;

    public void computeMonthlyWages() {
        System.out.println("Please select an option:\n1. Full Time Employee\n2. Part time Employee");
        Scanner sc = new Scanner(System.in);
        int typeOfEmployee = sc.nextInt();
        switch (typeOfEmployee) {
            case 1:
                System.out.println("Monthly Wages: ₹" + FULL_TIME_WAGE_HOUR * CHARGE_PER_HOUR * WORKING_DAYS);
                break;
            case 2:
                System.out.println("Monthly Wages: ₹" + PART_TIME_WAGE_HOUR * CHARGE_PER_HOUR * WORKING_DAYS);
                break;
            default:
                System.out.println("INVALID INPUT!");
                break;
        }
    }
}
