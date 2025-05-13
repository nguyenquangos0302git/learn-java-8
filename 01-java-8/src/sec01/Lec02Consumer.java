package sec01;

import java.util.function.*;

public class Lec02Consumer {

    public static void main(String[] args) {
        Consumer<String> consumer = print();
        Consumer<String> combineConsumer = consumer.andThen(print());
        combineConsumer.accept("Hello");
    }

    private static Consumer<String> print() {
        return System.out::println;
    }

}
