package exercise_2;

public class FullTimeGameTester extends GameTester{

    public FullTimeGameTester(String name, boolean checkStatus) {
        super(name, checkStatus);
    }

    @Override
    double getSalary() {
        return 3000;
    }
}
