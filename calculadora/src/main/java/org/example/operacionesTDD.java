package org.example;

import java.util.Objects;
public class operacionesTDD {

    public static Integer sumar(String... numbers) {
        Integer resultado = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(i == 0 && Objects.equals(numbers[i], "")) {
                return 0;
            }else if(i > 0 && Objects.equals(numbers[i], "") || resultado < 0) {
                return -1;
            }

            resultado += (Integer.parseInt(numbers[i]) > 1000) ? 0 : Integer.parseInt(numbers[i]);
        }

        return resultado;
    }
}

