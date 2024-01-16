public class FullStackProgrammer implements Employee {
    public String name;

    public FullStackProgrammer(String name) {
        this.name = name;
    }

    @Override
    public void notifyHandler(String msg) {
        System.out.println("FulStack программист " + name + " принял: " + msg);
    }
}
