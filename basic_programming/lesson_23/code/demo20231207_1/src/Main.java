/*
Придумайте и опишите класс, для любой предметной области.
Например,товар в интернет-магазине или автомобиль для продажи или любой другой.
В вашем классе должно быть несколько полей. Сделайте конструктор. Сделайте toString.
В main создайте несколько объектов своего класса, положите их в массив и,
по образу и подобию классной работы выведите на экран.
 */
public class Main {
    public static void main(String[] args) {

        Book[] arr = {  new Book(1,"Чистый код","Роберт Мартин",2008),
                        new Book(2,"Совершенный код", "Стив Макконнелл", 1993),
                        new Book(3,"Программист-прагматик", "Дейв Томас и Энди Хант", 1999)
        };

        Library library = new Library(-10);
        library.addBook(new Book(1,"Чистый код","Роберт Мартин",2008));
        System.out.println(library);
        System.out.println("Всего: " + library.getSize() + " книг");

        //library.size=-10;
        System.out.println("----------------------------------------");
        library.addBook(new Book(2,"Совершенный код", "Стив Макконнелл", 1993));
        System.out.println(library);
        System.out.println("Всего: " + library.getSize() + " книг");

        //library.books[0] = null;
        System.out.println(library);
    }
}