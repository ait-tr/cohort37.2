public class JavaProgrammer implements Employee{
    public String name;

    public JavaProgrammer(String name) {
        this.name = name;
    }

    @Override
    public void notifyHandler(String msg) {
        if (msg.indexOf("Java")>=0){
            System.out.println("Джава программист " + name + " принял: " + msg);
        }
    }
}
