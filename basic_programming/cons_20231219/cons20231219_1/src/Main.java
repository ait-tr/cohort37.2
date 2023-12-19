public class Main {
    public static void main(String[] args) {

        Pet[] pets = {
                new Cat("Tom", "Micky"),
                new Cat("Barsik", "Alex"),
                new Dog("Sharik", "Alex"),
                new Parrot("Kesha", "Alex"),
                new Fish("Gold", "Lena")
        };

        Pet pet = new Cat("Vaska", "Jack");
        pet = new Parrot("Jorge", "John Silver");

        PetFood universal= new PetFood("универсальный корм",12);

        //Pet pet1 = new Pet("wrt","ttyuiow");

        for (Pet p: pets){
            //System.out.println(p.getOwner() + " " + p.getName());
            System.out.println(p);
            p.say();

        }

        Pet q =  new Parrot("Jorge", "John Silver");
        Parrot w =  new Parrot("Jorge", "John Silver");






    }
}