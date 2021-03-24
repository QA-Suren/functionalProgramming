package functional.programming;

import functional.programming.programming.lambda.GreetingService;
import functional.programming.programming.lambda.WelcomeService;
import org.testng.annotations.Test;

public class WelcomeTest2 {

    @Test
    public void welcomeTest() {
        WelcomeService welcomeService = new WelcomeService() {
            @Override
            public String welcome(String name) {
                return name;
            }
        };

        System.out.println("Welcome servce1: " + welcomeService.welcome("SomeName"));

        WelcomeService welcomeService1 = (name) ->  name.toLowerCase();
        System.out.println("Welcome servce1: " + welcomeService1.welcome("SOMEnameE"));

        welcomeService1 = (name) ->  {
            return name.toLowerCase();
        };
        System.out.println("Welcome servce1: " + welcomeService1.welcome("SOMEnameE"));

        welcomeService1 = (name) ->  {
            System.out.println("Multi line lambda");
            return name.toLowerCase();
        };
        System.out.println("Welcome servce1: " + welcomeService1.welcome("SOMEnameE"));

    }

    @Test
    public void shifting(){
        System.out.println(-10 >> 1);
        System.out.println(-1 >>> 1);
    }

}
