import java.util.Scanner;

/*
Предположим, у вас есть массив с именами пользователей, например {"Иван Иванов", "Сергей Петров", "Елена Соколова" }
(массив задан в начале программы, естественно, имен может быть больше).
Реализовать следующие методы:

- метод, который выводит все элементы данного массива на экран, в виде
0 - Иван Иванов  1 - Сергей Петров  2 - Елена Соколова
т.е. index - значение

- метод, boolean checkName(String[] array, String name) который вернет true,
если в массиве присутствует заданный пользователь


 */
public class Main {
    public static void main(String[] args) {
        String[] users ={"Jack", "John", "Lena", "Nick"};
        printArray(users);
        System.out.println("task is finish");

        String name = inputName();
        System.out.println(name + (checkName(users,name)? " присутствует":" отсутствует" ));
    }

    public static String inputName(){
        System.out.println("Введите имя для поиска: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void printArray(String[] users){
        for(int i=0; i<users.length; i++){
            System.out.print(i+" - " + users[i]+"  ");
        }
        System.out.println();
    }


    public static boolean checkName(String[] array, String name){

        for(int i = 0; i<array.length; i++){
            if(array[i].equals(name)){ // str1==str2    str1.equals(str2)
                return true;
            }
        }
        return false;
    }

}

