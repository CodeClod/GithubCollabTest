public class HelloWorldSout {

    void printOneToTen() {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Just a text");
        System.out.println("Hello World 2");

        new HelloWorldSout().printOneToTen();

    }
}
