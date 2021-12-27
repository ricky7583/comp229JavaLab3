package exercise_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Driver {
    public static void main(String []args){
        List<Insurance> list = new ArrayList<>();
        Insurance insurance = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the type of insurance: ");
        String type = scanner.nextLine();
        System.out.println("Enter monthly cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();
        if(type.equalsIgnoreCase("health")){
            insurance = new Health();
            insurance.setMonthlyCost(cost);
            insurance.displayInfo();
        }
        else if(type.equalsIgnoreCase("life")){
            insurance = new Life();
            insurance.setMonthlyCost(cost);
            insurance.displayInfo();
        }
    }
}
