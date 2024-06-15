package classeseobjetos;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author jeanc
 */
//lança o dado 'numLancs' vezes. Conta quantas vezes cada número saiu e a porcentagem de ocorrencias
public class sorteiaDado {
    public static int[] dado(){
        int num, numLancs = 100000;
        int[] resultados = new int[6];
     
        Random randomNum = new Random();
        for(int i=0; i<numLancs; i++){
            num = randomNum.nextInt(6)+1;
            resultados[num-1]++;
        }
        return resultados;
    }
    
    public static void main(String[] args){
        int[] results = dado();
        int numLancs = 100000;
        
        for(int i=0; i<results.length; i++){
            System.out.printf("Numero %d: sorteado %d vezes\n", i+1, results[i]);
        }
        
        for(int i=0; i<results.length; i++){
            double percent = ((double)results[i]/numLancs)*100;
            System.out.printf("Número %d: %.2f%%\n", i + 1, percent);
        }
    }
}
