package classeseobjetos;
/**
 *
 * @author jeanc
 */
public class returnTest {
    public static int soma(){
        return 1+1;
    }
    
    public static String mensagem(){
        return "Curso Java";
    }
    
    public static void main(String[] args){
        int resultSoma = soma();
        
        System.out.println(resultSoma);
        System.out.println(mensagem());
    }
}
