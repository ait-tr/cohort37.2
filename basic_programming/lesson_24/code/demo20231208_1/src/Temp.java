public class Temp {
    private int index =10;

    public String toString(){
        return "Temp: "+ index;
    }

    public Temp(){
        System.out.println("hello temp 1");
    }

    public Temp(int index){
        System.out.println("hello temp 2");
        this.index = index;
    }

    public Temp(int index, int index2){
        System.out.println("hello temp 3");
        this.index = index*index2;
    }

    public Temp(String str){
        System.out.println(str);
        this.index=str.length();
    }

    public Temp(String str, int index){
        System.out.println(str);
        this.index=index;
    }

    public static void main(String[] args) {
        Temp temp = new Temp();
        System.out.println(temp);

        Temp temp1 = new Temp(100);
        System.out.println(temp1);

        Temp temp2 = new Temp(7, 2);
        System.out.println(temp2);

        Temp temp4 = new Temp("qwertyuiop[");
        System.out.println(temp4);

        Temp temp5 = new Temp("qwertyuiop[",0);
        //Temp temp6 = new Temp(0,"qwertyuiop[");  //Error !!! порядок параметров не соответствует
        System.out.println(temp5);

        System.out.println("--------------------------------------------");
        String str = "qw1/we2/tyeu3/wtt4";
        String[] strings= str.split("/");
        for (String s: strings){
            System.out.println(s);
        }


    }

}
