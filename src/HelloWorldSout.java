public class HelloWorldSout {

    void metode2 () {

    }



    void printOneToTen() {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new HelloWorldSout().metode2();

        System.out.println("Hello World");
        System.out.println("Just a text");
        System.out.println("Hello World 2");
        System.out.println("Hello");

        new HelloWorldSout().printOneToTen();

    }
}
