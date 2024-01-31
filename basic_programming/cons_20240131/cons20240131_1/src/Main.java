import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static String pathFile1 = "D:\\ait-tr\\gits\\cohort37.2\\basic_programming\\cons_20240131\\cons20240131_1\\src\\files\\file1.txt";
    public static void main(String[] args) {
        List<String> list = trueReadTxtFile1();
        System.out.println(list);
        /*
        SortedMap<String, Charset> map = Charset.availableCharsets();
        for (var e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

         */

    }

    public static void read(){ // InputStream  binary data
        try(BufferedInputStream bReader = new BufferedInputStream(new FileInputStream(pathFile1))){
            int data;
            while ((data= bReader.read())!=-1){
                //System.out.print((char)data);
                System.out.print(" " + data);
            }


        } catch (IOException e){
            System.out.println("IOException");
        }
    }

    public static void read2(){ // Reader TXT
        //System.out.println(Charset.defaultCharset());
        Charset charset = Charset.forName("KOI8-R");
        try(BufferedReader bReader = new BufferedReader(new FileReader(pathFile1,charset))){
            int data;
            while ((data= bReader.read())!=-1){
                //System.out.print((char)data);
                System.out.print(" " + data);
            }


        } catch (IOException e){
            System.out.println("IOException");
        }
    }

    public static List<String> trueReadTxtFile1(){ // Reader TXT
        List<String> list = new ArrayList<>();
        try(BufferedReader bReader = new BufferedReader(new FileReader(pathFile1))){
            String str;
            while ((str = bReader.readLine())!=null){
                list.add(str);
                System.out.println(str);

            }
        } catch (IOException e){
            System.out.println("IOException");
        }
        return list;
    }


    public static List<String> trueReadTxtFile2(){ // Reader TXT
        List<String> list = Collections.EMPTY_LIST;
        try(BufferedReader bReader = new BufferedReader(new FileReader(pathFile1))){
            Stream<String> lines = bReader.lines();
            list = lines.collect(Collectors.toList());
        } catch (IOException e){
            System.out.println("IOException");
        }
        return list;
    }


    public static void copyFileToConsole(){
        try(BufferedInputStream bReader = new BufferedInputStream(new FileInputStream(pathFile1))){
            bReader.transferTo(System.out);
        } catch (IOException e){
            System.out.println("IOException");
        }
    }

}