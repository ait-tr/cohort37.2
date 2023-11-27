
public class Main {
    public static void main(String[] args) {
     // array

       int[] arr = {2,4,1,-1};
       String[] users = {"Jack", "Nick", "Elena" };
       double[] numbers = {3.3, 3.5, 6.0, 7.1 };


        ////  Обращение к элементу массива
        System.out.println(users[0]); // Jack
        System.out.println(arr[2]);  // 1
        int index=2;
        System.out.println(users[0] +" " + users[index]);// Elena

        // перебор
        System.out.println("перебор и вывод на экран массива");
        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for (int i=0; i< users.length; i++){
            System.out.print(users[i]+" ");
        }


        System.out.println();  // перевод каретки
        System.out.print("asdf\nwer\nty\n");  // \n - с новой строчки


        users[0] = users[0] + "'s";

        for (int i=0; i< users.length; i++){
            System.out.print(users[i]+" ");
        }

        System.out.println(arraySum(numbers));

    }
    public static double arraySum(double[] array){
        double result=0;

        for (int i =0; i<array.length; i++){
            result+= array[i];
        }

        return result;
    }
}