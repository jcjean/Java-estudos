package classeseobjetos;
/**
 *
 * @author jeanc
 */
/*
Quando invocamos o método com um argumento de um certo tipo, o Java é inteligente 
o suficiente para invocar corretamente o método que foi declarado com o tipo correto como parâmetro.
*/
public class Overloading {
    public static int quadrado(int num){
        return num*num;
    }
    
    public static double quadrado(double num){
        return num*num;
    }
    
    public static void main(String[] args){
        System.out.println("Inteiro - 2 ao quadrado: " + quadrado(2));
        System.out.println("Double - PI ao quadrado: " + quadrado( Math.PI ));
    }
}
