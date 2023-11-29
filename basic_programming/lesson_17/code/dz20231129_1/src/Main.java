/*
Дан массив строк. Необходимо написать метод, который все строки в этом массиве, которые длиннее 5 символов, обрежет до первых 5 символов и добавит в конце "[+]"
Например:  {"Hello Java", "Jack", "Ann is a programmer", "She has a good offer"}   ->  {"Hello[+]", "Jack", "Ann i[+]", "She h[+]"}
 */




public class Main {




    public static void main(String[] args) {

        String[] array = {"Всем привет!", "Каk", "Бухгалтер"};
        int limit = 4;
        printArray(array);


        System.out.println("-------------------------------------");
        String[] newArray = transformStringsArray(array, limit);
        printArray(newArray);
    }

    public static  String[] transformStringsArray(String[] array, int limit) {
        String[] result = new String[array.length];

        for(int i=0; i<array.length; i++){
            result[i] = array[i].length()>limit ? transformString(array[i],limit) : array[i];
        }

        return result;
    }

    public static String transformString(String str, int limit){
        return str.substring(0, limit) + "[+]";
    }

    public static void printArray(String[] array){
        for (String str: array){
            System.out.println(str);
        }
    }
}

            /*
             result[i]= str.length()>limit ? str.substring(0, limit) + "[+]" : str;
             */


            /*
            if (str.length()>limit) {
                str = str.substring(0, limit) + "[+]";
            }

             */