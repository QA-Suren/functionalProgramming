package functional.programming;

import org.testng.annotations.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class JavaFunctionalInterfaces {

    @Test
    public void consumerChaining(){
        List<String> lst = List.of("nunufar", "zanzibar");

        Consumer<String> dbConsumer = (s) -> {
            System.out.println("I am writing into DB: " + s);
        };

        Consumer<String> logConsumer = (s) -> {
            System.out.println("I am writing into log file: " + s);
        };

//        lst.forEach(dbConsumer);
//        lst.forEach(logConsumer);
        Consumer<String> dbLogConsumer = dbConsumer.andThen(logConsumer);
        lst.forEach(dbLogConsumer);

    }

    @Test
    public void functionAndThenChaining(){
        Function<String,Integer> strLen = (str) -> str.length();
        Function<Integer,Integer> square = (i) -> (i*i);

        System.out.println(
                strLen.andThen(square).apply("Some string")
        );


    }

    @Test
    public void functionComposeChaining(){
        Function<Integer,Integer> incremenet = (i) ->(i + 1);
        Function<Integer,Integer> square = (i) -> (i*i);

        System.out.println(
                incremenet.andThen(square).apply(10) + " " +
                incremenet.compose(square).apply(10)
        );
    }

    @Test
    public void predicate(){
        Predicate<Integer> isGt2 = (i) -> i > 2;
        Predicate<Integer> isLt10 = (i) -> i < 10;

        System.out.println(
//                isGt2.and(isLt10).test(4)
                isGt2.negate().test(1)

        );
    }
}
