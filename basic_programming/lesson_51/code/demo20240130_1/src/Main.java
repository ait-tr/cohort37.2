import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {
    public static void main(String[] args) {

        try {
            Reader fileReader = new  FileReader("C:/LessonJava/1.txt");
            int res;
            while ((res=fileReader.read())!=-1){
                System.out.print( (char) res   );
            }

        } catch (FileNotFoundException e) {
            System.out.println("не найден файл");
            //throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("что то не получилось");
            throw new RuntimeException(e);
    }
    }
}