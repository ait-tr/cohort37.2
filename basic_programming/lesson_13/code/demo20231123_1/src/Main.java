public class Main {
    public static void main(String[] args) {
        String str = "Java is very easy";
        char ch = 'x';
        int index = indexOf(str,ch);
        if (index>=0){
            System.out.println("В строке "+ str + " символ '"+ch+"' первый раз встречается в позиции: " + index);
        } else {
            System.out.println("В строке "+ str + " символ '"+ch+"' не встречается");
        }

    }
    public static int indexOf(String str, char ch){

        for (int i=0; i < str.length(); i++){
          char currentChar =  str.charAt(i);
          if(currentChar==ch){
             return i;
          }
        }
       return -1;
    }
}