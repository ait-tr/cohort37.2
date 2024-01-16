public class Main {
    public static void main(String[] args) {

        TeamLead teamLead = new LmsProjectTeamLead("Jack", "STO");

        JavaProgrammer jp1 = new JavaProgrammer("Lena");
        JavaProgrammer jp2 = new JavaProgrammer("Oleg");
        JavaProgrammer jp3 = new JavaProgrammer("Igor");
        SQLProgrammer sp1 = new SQLProgrammer("Nick");
        FullStackProgrammer fs1 = new FullStackProgrammer("Pavel");
        FullStackProgrammer fs2 = new FullStackProgrammer("Sergey");

        teamLead.addEmployee(jp1);
        teamLead.addEmployee(jp2);
        teamLead.addEmployee(fs1);
        teamLead.addEmployee(fs2);
        teamLead.addEmployee(sp1);

        teamLead.notifyEmployees("Write Java applet");
        System.out.println("---------");
        teamLead.notifyEmployees("Write SQL script");

        System.out.println("---------");
        teamLead.notifyEmployees("Write app");

    }
}