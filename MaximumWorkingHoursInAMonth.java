import java.util.Scanner;

public class MaximumWorkingHoursInAMonth {
    private static final int PART_TIME_WAGE_HOUR = 4;
    private static final int FULL_TIME_WAGE_HOUR = 8;

    public void computeWagesInAMonth(int wagesRate, int totalWorkingHours, int totalWorkingDays) {
        int totalNumberOfWorkingDays = 1;
        int totalHours = 0;
        while (totalNumberOfWorkingDays <= totalWorkingDays && totalHours <= totalWorkingHours) {
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
        System.out.println("Total Wages: ₹" + totalHours * wagesRate);
    }
}
