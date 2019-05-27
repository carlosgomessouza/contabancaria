import java.util.Scanner;

public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int option;

        do {

            System.out.println("============= Escolha uma opção =============");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Realizar um saque");
            System.out.println("3 - Realizar deposito");
            System.out.println("0 - Encerrar");
            System.out.print("Opção: ");
            option = scan.nextInt();

            if (option == 0) {
                System.exit(0);
            }

            if (option == 1) {
                ContaBancaria contabancaria = new ContaBancaria();

                System.out.print("Nome do Cliente: ");
                contabancaria.NomeDoCliente = scan.next();

                System.out.print("Digite o número da conta: ");
                contabancaria.numero = scan.nextInt();
                
            }

        } while (option != 0);

    }

}
