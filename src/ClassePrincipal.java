
import java.util.Scanner;


public class ClassePrincipal {
     public static void main(String [] args) {
         ContaBancaria contabancaria = new ContaBancaria();
          Scanner scan = new Scanner(System.in);
          
         System.out.print("Nome Do Cliente");
         contabancaria.NomeDoCliente = scan.next();
         
         System.out.println("Nome Do Cliente"+contabancaria.NomeDoCliente);
         
         System.out.print("Coloque um Valor");
         contabancaria.numero = scan.nextInt();
         
         System.out.println("Valor colocado"+contabancaria.numero);
         
         System.out.print("Saldo Do Cliente");
         contabancaria.saldo = scan.nextDouble();
         
         System.out.println("Saldo"+contabancaria.saldo);
         
     }
    
}
