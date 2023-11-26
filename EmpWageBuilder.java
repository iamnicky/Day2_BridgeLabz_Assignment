import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpWageBuilder {
    private static List<CompanyEmpWage> companiesDetails = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the company name");
        String compName = sc.nextLine();

        //dummy code to illustrate as the list is actually empty
        for (CompanyEmpWage item :
                companiesDetails) {
            if (item.getCompanyName().equals(compName)) {
                MaximumWorkingHoursInAMonth maximumWorkingHoursInAMonth = new MaximumWorkingHoursInAMonth();
                maximumWorkingHoursInAMonth.computeWagesInAMonth(item.getWagePerHour(), item.getTotalWorkingHour(), item.getTotalWorkingDaysInAMonth());
                sc.close();
                return;
            }
        }
        // cannot find the company
        System.out.println("Company not found");
    }
}
