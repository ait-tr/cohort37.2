public class Fish extends  Pet{
    public Fish(String name, String owner) {
        super(name, owner);
    }
    @Override
    public String toString() {
        return "Fish" + super.toString();
    }

    @Override
    public void say() {
        //System.out.println("чего тебе надобно, старче?");
    }
}
