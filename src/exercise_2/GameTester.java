package exercise_2;
abstract class GameTester {
    protected String name;
    protected boolean checkStatus;

    public GameTester(String name, boolean checkStatus){
        this.name = name;
        this.checkStatus = checkStatus;
    }
    abstract double getSalary();
}
