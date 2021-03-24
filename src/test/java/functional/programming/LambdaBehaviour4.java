package functional.programming;

import functional.programming.programming.lambda.WelcomeService;
import org.testng.annotations.Test;

public class LambdaBehaviour4 {
    public static String higherOrderFunction(WelcomeService welcomeService) {
        System.out.println("Inside higherOrderFunction. Recieved welcomeService.");
        return welcomeService.welcome("PicsArt JAVA Meetup");
    }

    public static WelcomeService getLambda() {
        System.out.println("Inside getLambda");
//        WelcomeService welcomeService = (name) -> name.toUpperCase();// Function as first class object
//        return welcomeService;
        return (name) -> name.toUpperCase();
    }

    @Test
    public void lambdaBehaviour() {
        System.out.println("Starting Execution");
        System.out.println("Get Lambda " + higherOrderFunction(getLambda()));
        System.out.println("Ending Execution");
    }
}
