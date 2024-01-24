public class Wrapper {
    public static void main(String[] args) {
        Integer i1= 127;  // Integer.valueOf(10) // boxing
        Integer i2=127;
        Integer i3=i1+i2;  //i1.intValue() + i2.intValue()  // unboxing

        System.out.println("i1 == i2 :" + (i1==i2));
        System.out.println("i1.equals(i2) :" + (i1.equals(i2)));

    }
}
