package org.example;

public class FizzBuzz {

    public static String returnNumber(Integer number) {
        return (number % 3 == 0 && number % 5 != 0) ? "Fizz" :
                (number % 5 == 0 && number % 3 != 0) ? "Buzz" :
                        (number % 3 == 0 && number % 5 == 0) ? "FizzBuzz" :
                                number.toString();
    }

}
