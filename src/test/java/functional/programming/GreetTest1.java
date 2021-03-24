package functional.programming;

import functional.programming.programming.lambda.GreetingService;
import org.testng.annotations.Test;

public class GreetTest1 {

    @Test
    public void greetTest() {
//        GreetingService greetingService = new GreetingService() {
//            public void greet(String name) {
//                System.out.println("name: " + name);
//            }
//        };
//
//        greetingService.greet("SomeName");

        GreetingService greetingServiceLambda = (name) ->
                System.out.println("name:" + name.toLowerCase());
        greetingServiceLambda.greet("SOMENAME");
    }

}
