package excercise1;

import java.util.ArrayList;
import java.util.List;

public class ArrayInteger {

    //dado un entero, devuelvo un array con los numeros impares del 1 a ese numero
    public static List<Integer> generateOddNumbers(int n){

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n; i++)
            if (i % 2 != 0)
                result.add(i);


        return result;


    }




}
