public class Calc {

    public static double add(double num1, double num2){
        System.out.println("double double");
        return num1+num2;
    }
    public static double add(double num1, double num2, double num3){
        return num1+num2+num3;
    }

    public static double add(double[] nums){
        double sum=0;
        for (double num:nums) {
            sum+=num;
        }
        return sum;
    }

    public static double add(int num1, int num2){
        System.out.println("int int");
        return num1+num2;
    }


}
