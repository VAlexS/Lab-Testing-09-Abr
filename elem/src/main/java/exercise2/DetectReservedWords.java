package exercise2;

import java.util.List;

public class DetectReservedWords {

    public static final String[] wordsReserved = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char",
    "class", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "if", "implements",
    "import", "instanceof", "int", "interface", "long", "new", "package", "private", "protected", "public", "return", "short", "static",
    "super", "switch", "synchronized", "this", "throw", "throws", "try", "void", "volatile", "while", "null", "false", "true", "var"};


    public static boolean containsReservedWord(String sentence){

        String str = sentence.toLowerCase();


        String[] words = str.split(" ");

        //en este caso, hay un bucle anidado, ya que tengo que recorrer 2 arrays, uno para separar la frase en palabras y
        // otro para comprobar si contiene palabras reservadas
        for (String elem : words)
            for (String elem2 : wordsReserved)
                if (elem2.equals(elem))
                    return true;


        return false;
    }



}
