public class PartTimeWage {
    private static final int PART_TIME_WAGE_HOUR = 4;
    private static final int CHARGE_PER_HOUR = 20;

    public static void computePartTimeWages() {
        System.out.println("Daily wage of part time employee is: ₹" + PART_TIME_WAGE_HOUR * CHARGE_PER_HOUR);
    }
}
