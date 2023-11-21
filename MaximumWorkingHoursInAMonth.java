import java.util.Scanner;

public class MaximumWorkingHoursInAMonth {
    private static final int PART_TIME_WAGE_HOUR = 4;
    private static final int FULL_TIME_WAGE_HOUR = 8;
    private static final int CHARGE_PER_HOUR = 20;
    private static final int TOTAL_HOUR_IN_MONTH = 100;
    private static final int NUMBER_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int totalNumberOfWorkingDays = 1;
        int totalHours = 0;
        while (totalNumberOfWorkingDays <= NUMBER_OF_WORKING_DAYS && totalHours <= TOTAL_HOUR_IN_MONTH) {
            totalNumberOfWorkingDays++;

            System.out.println("Please select an option:\n1. Working Full Time\n2. Working Part time");
            Scanner sc = new Scanner(System.in);
            int typeOfEmployee = sc.nextInt();
            switch (typeOfEmployee) {
                case 1:
                    totalHours += FULL_TIME_WAGE_HOUR;
                    break;
                case 2:
                    totalHours += PART_TIME_WAGE_HOUR;
                    break;
                default:
                    System.out.println("INVALID INPUT!");
                    break;
            }

        }
        System.out.println("Total Wages: ₹" + totalHours * CHARGE_PER_HOUR);
    }
}
