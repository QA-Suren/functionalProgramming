package functional.programming;

import functional.programming.programming.lambda.GreetingService;
import functional.programming.programming.lambda.WelcomeService;
import org.testng.annotations.Test;

public class HigherOrderTest3 {

    @Test
    public void higherOrderTest() {
        WelcomeService welcomeService = (a) -> a;
        String str1  = higherOrderFunction(welcomeService,"aaaa");
        System.out.println("str1: " + str1);
        String str2 = higherOrderFunction((name) -> name.toLowerCase(),"MyTask");
        System.out.println("str2: " + str2);
        String str3 = higherOrderFunction(name -> name.toUpperCase(),"MyTask");
        System.out.println("str3: " + str3);
    }

    public String toLower(String str){
        return str.toLowerCase();
    }
    public String toUpper(String str){
        return str.toLowerCase();
    }
    public static String  higherOrderFunction(WelcomeService welcomeService, String name){
       return welcomeService.welcome(name);
    }
}
