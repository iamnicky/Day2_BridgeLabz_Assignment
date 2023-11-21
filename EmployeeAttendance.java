import java.util.Random;

public class EmployeeAttendance {

    public static void main(String[] args) {
        Random random = new Random();
        boolean isPresent = random.nextInt(2)==1;
        if(isPresent){
            System.out.println("Present");
        }else {
            System.out.println("Absent");
        }
    }
}
