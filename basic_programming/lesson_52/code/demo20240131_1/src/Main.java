// java.io  qwe
// java.nio


import java.io.*;
import java.net.URL;

public class Main {
    //String pathToFile1="D:\\ait-tr\\gits\\cohort37.2\\basic_programming\\lesson_52\\code\\files\\file1.txt";
    static String pathToFile1="D:/ait-tr/gits/cohort37.2/basic_programming/lesson_52/code/files/file1.txt";
    static String pathToFile2="D:/ait-tr/gits/cohort37.2/basic_programming/lesson_52/code/files/file2.txt";
    public static void main(String[] args) {


        String str=read();
        System.out.println(str);
        write(str);
    }

    public static String read()  {

        //try (InputStream is = new FileInputStream(pathToFile1)) {
        try (InputStream is = new URL("https://ru.wikipedia.org/wiki/").openStream()) {
            int data;
            StringBuilder res=new StringBuilder();
            while ( (data = is.read())!=-1 ) {
                //System.out.print( (char) data);
                res.append((char) data);

            }
           return res.toString();


        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return "";
    }


    public static String read2()  {

        try (InputStream is = new FileInputStream(pathToFile1)) {
        //try (InputStream is = new URL("https://ru.wikipedia.org/wiki/").openStream()) {
            byte[] data = new byte[1024*1024];
            int count=0;
            StringBuilder res=new StringBuilder();
            while ( (count=is.read(data))>0 ) {
                for (int i=0; i<data.length && i<count; i++) {
                    res.append((char) data[i]);
                }
            }
            return res.toString();


        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return "";
    }


    public static String read3()  {

        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(pathToFile1))) { ///

            StringBuilder res = new StringBuilder();
            byte[] data = is.readAllBytes();
            for (int i=0; i<data.length;  i++) {
                res.append((char) data[i]);
            }
            return res.toString();


        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return "";
    }

    public static String read4()  {

        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(pathToFile1))) {

            int data;
            StringBuilder res=new StringBuilder();
            while ( (data = is.read())!=-1 ) {
                //System.out.print( (char) data);
                res.append((char) data);

            }
            return res.toString();



        } catch (FileNotFoundException e){
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return "";
    }



    public static void write(String msg){

        try(OutputStream os = new FileOutputStream(pathToFile2)) {
            byte[] bytes = msg.getBytes();
            for (var b : bytes) {
                os.write(b);
            }
            os.flush();
        }catch (FileNotFoundException e){
                System.out.println("FileNotFoundException");
        } catch (IOException e) {
                System.out.println("IOException");
        }

    }


}