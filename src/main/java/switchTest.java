import java.util.Scanner;

public class switchTest{
    public static void main(String[] args){
        char vogal;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite uma vogal minúscula: ");
        vogal = scan.nextLine().charAt(0);
        
        switch(vogal){
            case 'a':
                System.out.println("Você está no case da vogal 'a'");
            case 'e':
                System.out.println("Você está no case da vogal 'e'");
            case 'i':
                System.out.println("Você está no case da vogal 'i'");
            case 'o':
                System.out.println("Você está no case da vogal 'o'");
            case 'u':
                System.out.println("Você está no case da vogal 'u'");
            default:
                System.out.println("Você não digitou uma vogal minúscula");
        }
    }
}