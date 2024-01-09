public class Main {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        instance1.setValue("qwerty");
        System.out.println(instance1);

        EnumSingleton instance2 = EnumSingleton.INSTANCE; ///  !!!!!! тот же объект
        instance2.setValue("000000000");
        System.out.println(instance1);
    }
}