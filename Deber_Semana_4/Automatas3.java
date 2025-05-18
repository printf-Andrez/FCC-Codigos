public class Automatas3 {
public static void main(String[] args) {
//Ejercicio 3: 9 autómatas en total.
//Pimer autómata: Crea y lee tres palabras.
//(El ejercicio no pide recibir desde entrada del usuario).
String word1 = "lente";
String word2 = "calvo";
String word3 = "medusa";
//Segundo autómata: Crea y lee un número entero positivo.
int number = 280;
//Tercer autómata: Crea las variables para almacenar las sumas y el mayor valor.
int sum1;
int sum2;
int sum3;
int maxNum;
//Quinto autómata: Almacena la suma de los valores ASCII de los caracteres de cada palabra.
sum1 = plus(word1);
sum2 = plus(word2);
sum3 = plus(word3);
//Sexto autómata: Compara si la primer palabra tiene el mayor valor.
if (sum1 > sum2 && sum1 > sum3 && sum1 > number){
//Autómata 6.1: Asigna el valor en caso de ser el mayor valor.
    maxNum = sum1;
//Séptimo autómata: Compara si la segunda palabra tiene el mayor valor.
} else if (sum2 > sum1 && sum2 > sum3 && sum2 > number){
//Autómata 7.1: Asigna el valor en caso de ser el mayor valor.
    maxNum = sum2;
//Octavo autómata: Compara si la tercera palabra tiene el mayor valor.
} else if (sum3 > sum2 && sum3 > sum1 && sum3 > number){
//Autómata 8.1: Asigna el valor en caso de ser el mayor valor.
    maxNum = sum3;
//Noveno autómata: Compara si el número entero positivo tiene el mayor valor.
} else {
//Autómata 9.1: Asigna el valor en caso de ser el mayor valor.
    maxNum = number;
}
//(No se imprime nada, puesto que el ejercicio no lo pide)
}
//Cuarto autómata: Suma de los valores ASCII de los caracteres de cada palabra.
public static int plus(String a) {
    char[] word = a.toCharArray();
    int sum = 0;
    for (int i = 0 ; i < word.length ; i++){
        sum = sum + (int) word [i];
    }
    return sum;
    }
}
