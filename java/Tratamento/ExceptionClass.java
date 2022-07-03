package Tratamento;

public class ExceptionClass extends Exception{
    private int numerador;
    private int denominador;
    public ExceptionClass(String string, int numerador, int denominador) {
        super(string);
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
}
