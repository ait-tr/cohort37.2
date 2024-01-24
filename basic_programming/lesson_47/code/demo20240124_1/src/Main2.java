public class Main2 {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {
            @Override
            public void a() {
                System.out.println("1");
            }

            @Override
            public void b() {
                System.out.println("2");
            }

            @Override
            public void c() {
                System.out.println("3");
            }
        };

        temp(obj);

    }

    public static void temp(MyInterface obj){
        obj.b();
        obj.c();
        obj.a();
    }
}
