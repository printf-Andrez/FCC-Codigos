public class Automatas1 {
public static void main(String[] args){
//Ejercicio 1: 8 autómatas en total.
//Primer autómata: Crea y lee las dos palabras (el ejercicio pide crear un autómata que ingrese dos palabras).
String fWord = "mantequilla";
String sWord = "grapas";
//Segundo autómata: Cuenta el número de letras y almacena el valor.
int numFWord = fWord.length();
int numSWord = sWord.length();
//Tercer autómata: Compara las longitudes.
boolean case1 = false;
boolean case2 = false;
boolean case3 = false;
if (numFWord > numSWord) {
    case1 = true;
//Cuarto autómata: Compara las longitudes.
} else if (numSWord > numFWord) {
    case2 = true;
//Quinto autómata: Compara las longitudes.
} else {
    case3 = true;
}
//Sexto autómata: Muestra cuál de las dos tiene más letras.
if (case1) {
    System.out.print("La palabra " + fWord + " tiene más letras");
//Séptimo autómata: Muestra cuál de las dos tiene más letras.
} else if (case2) {
    System.out.print("La palabra " + sWord + " tiene más letras");
//Octavo autómata: Muestra cuál de las dos tiene más letras.
} else if (case3) {
    System.out.print("Igual número de letras");
}
}
}