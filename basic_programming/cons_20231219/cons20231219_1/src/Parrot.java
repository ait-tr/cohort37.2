public class Parrot extends Pet {

    public Parrot(String name, String owner) {
       super(name, owner);
    }

    @Override
    public String toString() {
        return "Parrot" + super.toString();
    }

    public void say(){
        System.out.println("Попка дурак!");
    }

    public void fly(){
        System.out.println("летююююююю...!");
    }
}
