import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Sharik", 3);
        Dog dog2 = new Dog("Bobik", 3);

        Dog[] dogs= {new Dog("Bobik", 5),
                new Dog("Sharik", 3),
                new Dog("Sharik1", 3),
                new Dog("Sharik2", 3),
                new Dog("Sharik3", 3),
                new Dog("Sharik4", 3)
        };

        System.out.println(dog1);
        System.out.println(dog2);
        dog1.printName();
        dog2.printName();

        dog1.setVid("Dog  ");  // переменная static vid принадлежит классу!
        dog1.printName();
        dog2.printName();

        System.out.println("--------------------------");
        for (Dog dog : dogs){
            System.out.println(dog);  // обратите внимание как заполнено id
        }


    }



}