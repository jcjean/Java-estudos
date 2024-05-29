package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class IMC {
    public static float IMC(float peso, float altura){
        return peso/quadrado(altura);
    }
    
    public static float quadrado(float num){
        return num*num;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float imc;
        
        System.out.println("Informe seu peso (em Kg): ");
        float peso = scan.nextFloat();
        
        System.out.println("Informe sua altura (em metros): ");
        float altura = scan.nextFloat();
        
        imc = IMC(peso, altura);
        System.out.printf("Seu IMC é: %.2f", imc);
    }
}
