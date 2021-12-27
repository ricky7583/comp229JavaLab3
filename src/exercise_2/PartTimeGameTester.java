package exercise_2;

public class PartTimeGameTester extends GameTester {
    private int hours;

    public PartTimeGameTester(String name, boolean checkStatus, int hours) {
        super(name, checkStatus);
        this.hours = hours;
    }

    @Override
    double getSalary() {
        return this.hours*20;
    }
}
