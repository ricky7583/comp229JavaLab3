package exercise_3;

public abstract class Mortgage implements MortgageConstants {
    public int mortgageNumber;
    public String customerName;
    public double amount;
    public double interestRate;
    public int term;

    public int getMortgageNumber(){
        return mortgageNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public double getAmount(){return amount;}
    public double getInterestRate(){
        return interestRate;
    }
    public int getTerm(){
        return term;
    }

    public void setMortgageNumber(int mortgageNumber){
        this.mortgageNumber = mortgageNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    public void setTerm(int term){
        this.term = term;
    }
    public Mortgage(int mortgageNumber, String customerName, double amount, double interestRate, int term){
        super();
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        if (amount <= MAXAMOUNT){
            this.amount = amount;
        }
        else{
            this.amount = MAXAMOUNT;
        }
        this.interestRate = interestRate;
        if(term !=3 || term !=5){
            this.term = SHORTTERM;
        }
    }
    public String getMortgageInfo() {
        return "[mortgageNumber=" + mortgageNumber + ", customerName=" + customerName + "," +
                " amount=" + amount + ", interestRate=" + interestRate + ", term=" + term + "]";
    }

    @Override
    public String toString() {
        return "Mortgage [Mortgage number: " + mortgageNumber + ", Customer Name: " + customerName + ", " +
                "Amount: " + amount + ", Interest rate: " + interestRate + ", Term: " + term + "]";
    }
}

