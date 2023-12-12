public class StringHandler {
    String str;

    public StringHandler(String string) {
        this.str = string;
    }

    public String toString(){
        return str;
    }
    public String reverse(){
        String res="";
        for (int i=str.length()-1; i>=0; i-- ){
            res = res + str.charAt(i);
        }
        return res;
    }

    public int countWords(char delimiter){
        int count=0;
        for (int i=0; i<str.length();i++){
          char ch=str.charAt(i);
          if (ch==delimiter){
              count++;
          }
        }
      return count+1;
    }

    public void splitDemo(){
        String str="hello,Java world";
        String[] array = str.split("ll");
    }


}
