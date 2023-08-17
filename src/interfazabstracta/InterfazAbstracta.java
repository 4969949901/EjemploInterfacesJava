
package interfazabstracta;

//Calculadora basica
public class InterfazAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculadoraUniversitaria cu= new CalculadoraUniversitaria() {};//objeto
       System.out.println(cu.sumar(5, 10));
        System.out.println(cu.restar(10, 5));
        System.out.println(cu.multiplicar(5, 10));
        System.out.println(cu.dividir(15, 3));
       
    }
    
}
