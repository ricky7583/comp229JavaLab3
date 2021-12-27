package exercise_1;

public abstract class Insurance {
    public String insuranceType;
    public double monthlyCost;
    public Insurance(String insuranceType){
        this.insuranceType = insuranceType;
    }
    public void setMonthlyCost(double monthlyCost){
        this.monthlyCost = monthlyCost;
    }
    public String getInsuranceType(){
        return insuranceType;
    }
    public double getMonthlyCost(){
        return monthlyCost;
    }

    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}
