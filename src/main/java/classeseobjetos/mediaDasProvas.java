package classeseobjetos;
import java.util.Scanner;

/**
 *
 * @author jeanc
 */
public class mediaDasProvas {
    public static float media(float ...valores){
        float media = 0;
        
        for(float valor: valores){
            media += valor;
        }
        return media/valores.length;
    }
    
    public static float maiorNum(float ...valores){
        float maiorNum = 0;
        
        for(float num: valores){
            if(num>maiorNum){
                maiorNum = num;
            }
        }
        return maiorNum;
    }
    
    public static float menorNum(float nota1, float nota2, float nota3){
        
        if(nota1 <= nota2){
            if(nota1 <= nota3)
                return nota1;
        }else if(nota2 <= nota3){
            return nota2;
        }
        return nota3;
    }
    
    public static float mediaDuasMaiores(float ...valores){
        float maior1 = 0, maior2 = 0;
        
        for(float num: valores){
            if(num>maior1){
                maior2 = maior1;
                maior1 = num;
            }else if(num>maior2 && num!=maior1){
                maior2=num;
            }
        }
        return media(maior1, maior2);
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        float nota1, nota2, nota3;
        
        System.out.println("Insira a primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.println("Insira a segunda nota: ");
        nota2 = scan.nextFloat();
        System.out.println("Insira a terceira nota: ");
        nota3 = scan.nextFloat();
        
        System.out.printf("Essa é a media geral das 3 notas: %.2f\n", media(nota1, nota2, nota3));
        System.out.printf("Essa é a media das duas maiores notas: %.2f\n", mediaDuasMaiores(nota1, nota2, nota3));
        System.out.printf("Maior nota: %.2f\n", maiorNum(nota1, nota2, nota3));
        System.out.printf("Menor nota: %.2f\n", menorNum(nota1, nota2, nota3));
    }
}
