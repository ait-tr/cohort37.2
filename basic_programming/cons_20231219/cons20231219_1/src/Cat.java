public class Cat extends Pet {

    public Cat(String name, String owner) {
        super(name, owner);
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }

    @Override
    public void say(){
        System.out.println("мяу!");
    }


}
