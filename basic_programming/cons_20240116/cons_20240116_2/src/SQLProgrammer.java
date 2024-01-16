public class SQLProgrammer implements Employee {
    public String name;

    public SQLProgrammer(String name) {
        this.name = name;
    }

    @Override
    public void notifyHandler(String msg) {
        if (msg.indexOf("SQL")>=0){
            System.out.println("SQL программист " + name + " принял: " + msg);
        }
    }
}
