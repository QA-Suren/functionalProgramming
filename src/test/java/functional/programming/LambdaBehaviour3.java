package functional.programming;

import functional.programming.programming.lambda.GreetingService;
import org.testng.annotations.Test;

public class LambdaBehaviour3 {
    @Test
    public void lambdaBehaviour() {
        System.out.println("Starting Execution");
        higherOrderFunction(
                (name -> {
                    System.out.println("Inside Lambda");
                    System.out.println(name.toLowerCase());
                })
        );
        System.out.println("Ending Execution");
    }

    public static void   higherOrderFunction(GreetingService greetingService){
        System.out.println("Inside higherOrderFunction. Recieved greetingService.");
        greetingService.greet("PicsArt JAVA Meetup");
    }
}
