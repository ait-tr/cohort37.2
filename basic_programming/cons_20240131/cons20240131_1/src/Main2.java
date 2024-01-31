import java.io.*;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Serialization   Deserialization

        List<String> list = List.of(
                "1",
                "2"
        );
        //write(new Person("Jack"));

        read();

    }

    public static void write(Person str){
        try(var w= new ObjectOutputStream(new FileOutputStream("file.bin"))){
            w.writeObject(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void read(){
        try(var r= new ObjectInputStream(new FileInputStream("file.bin"))){
            Person o = (Person)r.readObject();
            System.out.println(o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
