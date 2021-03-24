package functional.programming;

import functional.programming.programming.lambda.StringOperations;

import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

public class OperatorTest5 {
//    StringOperations op1 = (inch) -> System.out.println(inch);
////            System.out::println;
//    StringOperations op2 = (s) -> Objects.isNull(s);
    StringOperations op2 = Objects::isNull;
//    StringOperations op = (s1, s2) ->{
//        return s1.concat(s2);
//} ;
//    StringOperations o = String::concat;

//    BiFunction bf = (nm, mn) -> mn + " " + nm;
Function<String,Integer> welcomeService1 = (name) ->  name.length();

    BiFunction<String,String,Integer> w = (name, mane) ->  (name+mane).length();


}
