package exercise_3;

public class BusinessMortgage extends Mortgage{

    public BusinessMortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term) {
        super(mortgageNumber, customerName, amount, interestRate, term);
        setInterestRate(getInterestRate()+1);
    }
}
