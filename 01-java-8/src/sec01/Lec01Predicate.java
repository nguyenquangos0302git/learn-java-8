package sec01;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Lec01Predicate {

    public static void main(String[] args) {
        predicate();
    }

    private static void predicate() {
        Predicate<String> isStartWith = checkStartWith("J");
        Predicate<String> isGreaterThan = checkMinLength(3);
        Predicate<String> isNotEmpty = checkNotEmpty();

        Predicate<String> combine = isStartWith.and(isGreaterThan).and(isNotEmpty);
        System.out.println(combine.test("Java"));

    }

    private static Predicate<String> checkStartWith(String prefix) {
        return t -> {
            return t.startsWith(prefix);
        };
    }

    private static Predicate<String> checkMinLength(int length) {
        return t -> t.length() >= length;
    }

    private static Predicate<String> checkNotEmpty() {
        return Predicate.not(String::isEmpty);
    }

}
