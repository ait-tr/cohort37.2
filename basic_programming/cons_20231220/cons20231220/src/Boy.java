public class Boy extends Schoolboy{
    boolean isGoalkeeper;

    public Boy(String name, int age, boolean isGoalkeeper) {
        super(name, age);
        this.isGoalkeeper = isGoalkeeper;
    }
    public void trud(){
        System.out.println("trud(): Точить ножи");
    }

    @Override
    public String toString() {
        return super.toString() +  " isGoalkeeper=" + isGoalkeeper;
    }
}
