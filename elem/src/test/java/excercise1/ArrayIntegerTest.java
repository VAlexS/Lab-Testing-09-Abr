package excercise1;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayIntegerTest {

    @Test
    @DisplayName("Dado un numero, se genera una lista de los numeros impares desde el 1 hasta el numero proporcionado")
    public void givenNumberReturnListOddNumbers(){

        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(9);

        assertEquals(lista, ArrayInteger.generateOddNumbers(10));



    }


}