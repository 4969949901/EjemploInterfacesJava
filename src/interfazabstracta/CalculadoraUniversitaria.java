
package interfazabstracta;


public class CalculadoraUniversitaria implements Interface, InterfaceDos {

    @Override
    public double sumar(double a, double b) {
        return a+b; 
    }

    @Override
    public double multiplicar(double a, double b) {
        return a*b; 
    }

    @Override
    public double dividir(double a, double b) {
       return a/b; 
    }

    @Override
    public double restar(double a, double b) {
        return a-b; 
    }

    @Override
    public double CalcularRaiz(double a, double b) {
        return Math.sqrt(a); 
    }

    @Override
    public double Potencia(double a, double b) {
        return Math.pow(a, b); 
    }
    
}
