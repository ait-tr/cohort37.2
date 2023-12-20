public abstract class Schoolboy {
    private String name;
    private int age;

    private String word ="";

    public Schoolboy(String name, int age) {
        this(name,age,"");
    }

    public Schoolboy(String name, int age, String word) {
        this.name = name;
        this.age = age;
        this.word = word;
    }

    @Override
    public String toString() {
        return "Schoolboy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWord() {
        return word;
    }

    public  abstract void trud();
}
