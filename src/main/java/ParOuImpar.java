import java.util.Scanner;
//@author jeanc

public class ParOuImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.println("Digite um número: ");
        x = scan.nextInt();
        
        if(x%2 == 0){
            System.out.println("É par!");
        }else{
            System.out.println("É ímpar!");
        }
    }
}
