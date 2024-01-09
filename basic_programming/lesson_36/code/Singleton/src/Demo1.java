public class Demo1 {
    private  static final Demo1 INSTANCE = new Demo1("Singleton 1");
    private String name;

    private Demo1(String name) {
        this.name = name;
    }

    public static Demo1 getInstance(){
        return INSTANCE;
    }

}
