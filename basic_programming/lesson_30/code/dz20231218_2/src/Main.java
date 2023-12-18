public class Main {
    public static void main(String[] args) {
        ProgrammingBooks p1=new ProgrammingBooks("Чистый код","Роберт Мартин","Programming",30,10);
        ProgrammingBooks p2=new ProgrammingBooks("Совершенный код","Стив Макконнелл","Programming",32,5);
        HorrorBooks h1=new HorrorBooks("Сияние","Стивен Кинг","Horror",20,5);
        HorrorBooks h2=new HorrorBooks("Дракула","Брэм Стокер","Horror",23,20);
        FantasyBooks f1=new FantasyBooks("Властелин Колец. Том 1. Братство кольца","Джон Рональд Руэл Толкин","Fantasy", 41.99,10);
        FantasyBooks f2=new FantasyBooks("Трудно быть богом","Аркадий и Борис Стругацкие","Fantasy",34.99,10);



        Book[] libraries={p1,p2,h1,h2,f1,f2};
        for (Book book : libraries){
            System.out.println("----------------------------------");
            book.printGenre();
            book.printTitle();
            book.printAuthor();
            book.bookPrice();
            book.printDiscount();
            book.printNewPrice();
        }
    }
}