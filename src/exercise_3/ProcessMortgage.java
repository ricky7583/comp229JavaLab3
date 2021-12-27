package exercise_3;
import java.util.Scanner;

public class ProcessMortgage {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Mortgage[] loans = new Mortgage[3];
        char selection;
        int number=0;
        String name = "";
        double amount = 0.0;
        double rate = 0.0;
        int term;

        for(int i = 0;i<3;i++){
            System.out.println("Choose the type of mortgage(P : Personal, B : Business) : ");
            selection = scanner.next().charAt(0);
            if(selection == 'P'){
                System.out.println("Enter the mortgage number: ");
                number = scanner.nextInt();
                System.out.println("Enter the mortgage name : ");
                name = scanner.next();
                System.out.println("Enter the amount of mortgage : ");
                amount = scanner.nextDouble();
                System.out.println("Enter the interest rate : ");
                rate = scanner.nextDouble();
                System.out.println("Enter the term : ");
                term = scanner.nextInt();
                Mortgage array1 = new PersonalMortgage(number, name, amount, rate, term);
                loans[i] = array1;
            }
            else if(selection == 'B'){
                System.out.println("Enter the mortgage number: ");
                number = scanner.nextInt();
                System.out.println("Enter the mortgage name : ");
                name = scanner.next();
                System.out.println("Enter the amount of mortgage : ");
                amount = scanner.nextDouble();
                System.out.println("Enter the interest rate : ");
                rate = scanner.nextDouble();
                System.out.println("Enter the term : ");
                term = scanner.nextInt();
                Mortgage array2 = new PersonalMortgage(number, name, amount, rate, term);
                loans[i] = array2;
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(loans[i].toString());
        }
    }
}
