package exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class DetectReservedWordsTest {

    @Test
    @DisplayName("Dada una frase (preferiblemente en inglés), comprobar si contienen palabras reservadas")
    public void checkIfASentenceContainsWordsReserved(){

        assertTrue(DetectReservedWords.containsReservedWord("If I were you"));


    }


}