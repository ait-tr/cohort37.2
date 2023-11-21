import java.util.Scanner;

/*
Давайте напишем программу длч коые-машины.
Каждый решепт кофе определяется количеством кофе, количеством молока, количеством воды. Таким образом у вас должен быть метод который принимает 3 int: coffee, milk, water. Метод должен
выводить на экран что-то типа:
~~~~
добавляю:
  кофе: 20 грамм
  молоко: 50ml
  вода: 70ml
~~~~

можете вывод сделать на свое усмотрение, чуть красивее, но цифры должгы передаваться в параметрах
В main дайте пользователю возможность выбрать вид кофе: 1. эспрессо, 2. лате .... и т.д. Ваша программа должна подготовить параметры для приготовления кофе в соответствие
с выбором и "принотовить" кофе, вызвав ваш метод.

 */
public class Main {
    public static void main(String[] args) {
        int coffeeType;
        do {
            coffeeType = choiceCoffee();
            makeCoffeeByChoice(coffeeType);
        } while (coffeeType>=1 && coffeeType<=4);

    }

    public static void makeCoffeeByChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Espresso:");
                makeCoffee(8,0,30);
                System.out.println("--- done ---");
                break;
            case 2:
                System.out.println("Latte:");
                makeCoffee(8,170,30);
                System.out.println("--- done ---");
                break;
            case 3:
                System.out.println("Cappuccino:");
                makeCoffee(8,90,30);
                System.out.println("--- done ---");
                break;
            case 4:
                System.out.println("Americano:");
                makeCoffee(8,0,100);
                System.out.println("--- done ---");
                break;
            default:
                System.out.println("Switch off ......");

        }
    }

    public static int choiceCoffee(){
        System.out.println("Input number of coffee type: ");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.println("4. Americano");
        System.out.println(" or any other numbers for switch off ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void makeCoffee(int coffee, int milk, int water){
        if (coffee>0){
            System.out.println("add coffee " + coffee + "g.");
        }
        if(milk>0){
            System.out.println("add milk " + milk + "ml.");
        }
        if(water>0){
            System.out.println("add water " + water + "ml.");
        }
    }
}