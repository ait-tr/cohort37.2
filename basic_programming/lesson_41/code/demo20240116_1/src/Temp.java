public class Temp {


    public static <T1,T2> boolean isClassEquals(T1 value1, T2 value2){
        System.out.println(value1.getClass().getSimpleName());
        System.out.println(value2.getClass().getSimpleName());
        return value1.getClass().getSimpleName().equals(value2.getClass().getSimpleName());
    }
    public static <T1,T2> T2 isClassEquals2(T1 value1, T2 value2){
        System.out.println(value1.getClass().getSimpleName());
        System.out.println(value2.getClass().getSimpleName());
        return value2;
    }



}
