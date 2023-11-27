/*
Создайте программу для проверки пароля, введенного пользователем.
Пароль считается валидным, если он не короче 8 символов и содержит хотя бы одну цифру.
Естественно, используйте цикл и charAt для анализа каждого символа пароля.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = getPassword();
        System.out.println( validatePassword(password) ? "ok. pass is correct" : "pass is not correct"  );

    }

    public static String getPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input password: ");
        return scanner.nextLine();
    }

    public static boolean validatePassword(String password){
        return checkLength(password) && checkIfDigit(password);
    }

    public static boolean checkLength(String password){
        return password.length()>=8;
    }

    public static boolean checkIfDigit(String password){

        for(int i=0; i<password.length();i++){
            char ch=password.charAt(i);
            if (isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDigit(char ch){
        //return  ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' || ch=='6' || ch=='7' || ch=='8' || ch=='9';

        /*
        switch (ch){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9': return true;
            default: return false;

        }
         */
        //Character.isDigit(ch);

        return  ch>='0' && ch<='9';
    }
    public static boolean isUpper(char ch){
        return  (int)ch>='A' && ch<='Z';

    }

}

/*
        if (condition){
            return true;
        } else {
            return false;
        }
         можно заменить:

         return condition;

 */