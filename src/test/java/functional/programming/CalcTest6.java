package functional.programming;

import functional.programming.programming.lambda.MathOperation;
import org.testng.annotations.Test;

public class CalcTest6 {
    @Test public void calcTest(){
        MathOperation add = (a, b) -> (a + b);
        MathOperation substract = (a, b) -> (a - b);
        MathOperation multilply = (a, b) -> (a * b);
        MathOperation divide = (a, b) -> (a / b);

        System.out.println(calculate(4, add, 10));
        System.out.println(calculate(4, substract, 10));
        System.out.println(calculate(4, multilply, 10));
        System.out.println(calculate(4, divide, 10));

    }

    public static int calculate(int a, MathOperation mathOperation, int b){
        return  mathOperation.operate(a,b);
    }
}
