package exercise_2;
import java.util.Scanner;
public class Console {
    public static void main(String []args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the type of tester(F for full-time, P for part-time): ");
    char input = scanner.next().charAt(0);

    if(input == 'F'){
        FullTimeGameTester f = new FullTimeGameTester("Ricky", true);
        System.out.println("The salary of full time game tester is: $" + f.getSalary());
    }
    else if (input == 'P'){
        System.out.println("Enter the number of part time games tester worked: ");
        int hours = scanner.nextInt();
        PartTimeGameTester p = new PartTimeGameTester("Evan", false, hours);
        System.out.println("The salary of part time game tester is $" + p.getSalary());
        }
    }
}
