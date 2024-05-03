//@author jeanc

public class progAritmetica{
    public static void main(String[] args){
        int an, inicial = 0, razao = 3, Max = 20;
        an = inicial;
        
        System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao, Max);
        while(an<=Max){
            System.out.println(an);
            an+=razao;
        }
    }
}