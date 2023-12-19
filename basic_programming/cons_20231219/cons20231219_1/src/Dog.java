public class Dog extends Pet {
    DogFood food;

    public Dog(String name, String owner) {
        super(name, owner);
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }

    public DogFood getFood() {
        return food;
    }

    public void say(){
        System.out.println("гав!");
    }
}
