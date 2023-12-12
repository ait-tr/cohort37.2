public class NamesHandler {
    private String[] names;

    public NamesHandler(String[] names) {
        this.names = names;
    }
    public NamesHandler(String namesString){
        this.names = namesString.split(",");
    }

    public String toString(){
        //return String.join(",",names);
        return join(",");
    }

    public String toStringByLength(int length){

        String res="";
        for (String str: names){
            if (str.length() == length) {
                res+=str+",";
            }
        }
        return res.length()==0?"":res.substring(0,res.length()-1);
    }

    public  String toStringByStartWith(char ch){
        String res="";
        for(String str:names){
            if(str.charAt(0)==ch){
                res += str+",";
            }
        }
        return res.length()==0?"":res.substring(0,res.length()-1);
    }




    private String join(String delimiter){
        if (names.length==0) {
            return "";
        }
        String  res="";
        for (String str : names){
            res += str+delimiter;
        }
        return res.substring(0,res.length()-1);
    }
}
