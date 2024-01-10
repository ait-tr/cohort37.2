import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumberReader {

    public List<Integer> read(){
        List<Integer> result = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number or 0 for exit");
        int num = 0;
        do{
            num = scanner.nextInt();
            if(num!=0){
                result.add(num);
            }
        } while (num!=0);
        return result;
    }





}
