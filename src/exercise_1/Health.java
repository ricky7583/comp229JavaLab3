package exercise_1;
public class Health extends Insurance{
    public Health(){
        super("Health");
    }

    @Override
    public void setInsuranceCost(double cost){
        super.setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type : " + this.getInsuranceType() + "\nMonthly Cost : " + this.getMonthlyCost());
    }
}
