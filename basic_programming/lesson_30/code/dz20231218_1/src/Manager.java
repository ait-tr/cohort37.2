public class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus){
        super(name,salary); // Вызов конструктора род. класса. Первая инструкция в дочернем конструкторе!!
        this.bonus = bonus;
    }

    public  String toString(){
        return "Manager:" + getName() + " (" + getSalary() + " and my bonus is" + this.bonus +")  ";
    }

    public void work(){
        System.out.println(getName() + ": I am Manager. I should arrange the work processes, but make only mess and stress. ");
    }


   @Override
    public  void  paySalary(){
        System.out.println(" gets " + getSalary() + " Euro " + " bonus: " + bonus);
    }

}
