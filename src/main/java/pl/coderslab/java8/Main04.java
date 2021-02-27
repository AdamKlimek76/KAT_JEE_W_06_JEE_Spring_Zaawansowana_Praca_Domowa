package pl.coderslab.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main04 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> test =
                Integer -> Integer > 4;
        List<Integer> testList = search(list, test);
        System.out.println("search");
        for (Integer item : testList) {
            System.out.println(item);
        }

        List<String> stringList = Arrays.asList("adam", "ewa", "michał", "ewelina", "franciszek");
        Function<String, Integer> changeStrToInt =
                String::length;
        List<Integer> integerList = changeCollection(stringList, changeStrToInt);
        System.out.println("changeCollection");
        integerList.forEach(System.out::println);

        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        Consumer<Integer> consumerResult =
                obj -> System.out.println("Wynik konsumera: " + obj);
        consumeCollection(integerList1, consumerResult);

    }

    static <T> List<T> search(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    static <T, S> List<S> changeCollection(Collection<T> collection, Function<T, S> function) {
        return collection.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    static <T> void consumeCollection(Collection<T> collection, Consumer<T> consumer) {
        collection.forEach(consumer);
    }

}
