public class Demo2 {
    private  static  Demo2 INSTANCE = null;
    private String name;

    private Demo2(String name) {
        this.name = name;
    }

    public static Demo2 getInstance(String name){
        if (INSTANCE == null){
            INSTANCE = new Demo2(name);
        }
        return INSTANCE;
    }

}
