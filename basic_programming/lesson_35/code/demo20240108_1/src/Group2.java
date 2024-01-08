public class Group2 {
    // singleton
    private String title;


    private static Group2  instance = null;


    private Group2(String title) {
        this.title = title;
    }

    public static Group2 getInstance(String title){
        if (instance == null) {
            instance = new Group2(title);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                '}';
    }

}