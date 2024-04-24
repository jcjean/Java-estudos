import java.util.Scanner;
import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
            int idade, anoAtual, anoNascimento, dia;
            //anoNascimento = scan.nextInt();
            Calendar calendario = Calendar.getInstance();
            dia = calendario.get(Calendar.DAY_OF_MONTH);
            System.out.println("Hoje é dia " + dia);
            //idade = anoAtual - anoNascimento;

            //System.out.println("Voce tem "s + idade + " anos.");
    }
}