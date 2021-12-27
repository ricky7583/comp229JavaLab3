package exercise_1;

public class Life extends Insurance{
    public Life(){
        super("Life");
    }

    @Override
    public void setInsuranceCost(double cost){
        super.setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance type : " + this.getInsuranceType() + "\nMonthly Cost : " + this.getMonthlyCost());
    }
}
