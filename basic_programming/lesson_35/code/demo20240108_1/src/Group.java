public class Group {
    // singleton
    private String title;
    public static final Group  instance = new Group("Группа 37.2");


   private Group(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title='" + title + '\'' +
                '}';
    }

}
