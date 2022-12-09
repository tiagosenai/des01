import java.time.LocalDate;
import java.util.Scanner;
public class App {
    //Método Principal
    public static void main(String[] args) throws Exception {
        // System.out.println("Olá Mundo!");
        // Scanner entrada = new Scanner(System.in);
        // System.out.println("Informe seu nome..: ");
        // String nome;
        // nome = entrada.nextLine();
        // System.out.println("O nome informado foi..: "+nome);
        // int a,b;
        // System.out.println("Informe o 1º Número..: ");
        // a = entrada.nextInt();
        // System.out.println("Informe o 2º Número..: ");
        // b = entrada.nextInt();
        // System.out.println("A soma dos dois números é..: "+(a+b));
        var livro1 = new Livro(1, "Marketing Digital", "Tiago", "Senai", "123456789", LocalDate.of(1999,01,01), 4, "Texto");
        System.out.println(livro1);
        
    }
}
