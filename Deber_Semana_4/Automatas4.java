public class Automatas4 {
public static void main(String[] args) {
//Ejercicio 4: 4 autómatas en total.
//Primer autómata: Crea y lee las cuatro palabras (el ejercicio pide crear un autómata que ingrese cuatro palabras).
String fWord = "ola";
String sWord = "hola";
String tWord = "rola";
String foWord = "sola";
//Segundo autómata: Crea la variable para almacenar la oración.
String phrase;
//Tercer autómata: Crea la oración de longitud de 10 palabras.
phrase = tWord +", " + foWord +", " + sWord +", " + fWord +", " + foWord +", "
+ sWord +", " + tWord +", " + fWord +", " + foWord +", " + foWord;
//Cuarto autómata: Imprime la oración.
System.out.print(phrase);
}
}
