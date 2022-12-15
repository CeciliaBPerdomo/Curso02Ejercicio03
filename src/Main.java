public class Main {
    // Primera parte:
    // Crear una función con tres parámetros que sean números que se suman entre sí.
    // Llamar a la función en el main y darle valores.
    public static void main(String[] args) {
        // Ejercicio 1
        int resultado;
        resultado = sumar(1,2, 3);
        System.out.println(resultado);

        // Ejercicio 2
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int sumar(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        return resultado;
    }
}
    // Segunda parte:
    // Crear una clase coche.
    // Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    // Una función que incremente el número de puertas que tiene el coche.
    // Crear un objeto miCoche en el main y añadirle una puerta.
    // Mostrar el número de puertas que tiene el objeto.

class Coche{
    public int puertas = 4;

    public void sumarPuertas() {
        this.puertas ++;
    }
}