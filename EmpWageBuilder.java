import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.IEmpWagesBuilder;

public class EmpWageBuilder implements IEmpWagesBuilder {
    private static List<CompanyEmpWage> companiesDetails = new ArrayList<>();

    @Override
    public void compute(String compName) {
        for (CompanyEmpWage item :
                companiesDetails) {
            if (item.getCompanyName().equals(compName)) {
                MaximumWorkingHoursInAMonth maximumWorkingHoursInAMonth = new MaximumWorkingHoursInAMonth();
                maximumWorkingHoursInAMonth.computeWagesInAMonth(item.getWagePerHour(), item.getTotalWorkingHour(), item.getTotalWorkingDaysInAMonth());
                return;
            }
        }
        // cannot find the company
        System.out.println("Company not found");
    }
}
