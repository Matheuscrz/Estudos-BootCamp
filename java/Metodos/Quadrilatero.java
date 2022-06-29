package Metodos;

public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Area do quadrado: " + (lado*lado));
    }
    public static void area(double lado1, double lado2) {
        System.out.println("Area do retângulo: " + (lado1*lado2));
    }
    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do trapézio: " + ((baseMaior+baseMenor)*altura)/2);
    }
    // public static double area(double raio, double pi) {
    //     return (raio*raio) * pi;
    // }
}
