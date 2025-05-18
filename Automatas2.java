public class Automatas2 {
public static void main(String[] args) {
//Ejercicio 2: 4 autómatas en total.
//Pimer autómata: Crea y lee el carácter, con un valor ASCII.
//(El ejercicio no pide recibir desde entrada del usuario).
char charac = 'e';
//Segundo autómata: Determina si el valor es mayor que 100, o se encuentra entre 0 y 100.
boolean case1 = false;
if ((int) charac > 100){
    case1 = true;
}
//Tercer autómata: Imprime "primero" si el valor es mayor que 100.
if (case1){
    System.out.print("primero");
//Cuarto autómata: Si el valor está entre 0 y 100 imprime "segundo".
} else {
    System.out.print("segundo");
}
    }
}
