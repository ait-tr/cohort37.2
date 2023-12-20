public class Girl extends Schoolboy{

    public Girl(String name, int age) {
        super(name, age );
    }


    public Girl(String name, int age, String word) {
        super(name, age, word );
    }

    @Override
    public void trud(){
        System.out.println("trud():  печь торт");
    }




}
