import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        Conta matheus = new Conta();

        matheus.nome = "Matheus";
        matheus.tipoConta = "Corrente";
        matheus.saldoInicial = 2500;

        int op;

        System.out.println("Operações");
            System.out.println("1 - Consultar saldo: ");
            System.out.println("2 - Depositar");
            System.out.println("3 - Tranferir");
            System.out.println("4 - Sair");
            System.out.println("Digite o numero da opção desejada");

        op = leitura.nextInt();

        while(op != 4){

            

            switch(op) {
                case 1:
                matheus.consultaSaldo();
                break;

                case 2:
                System.out.println("Digite o valor a ser depositado");
                matheus.depositar(leitura.nextDouble());
                break;

                case 3:
                System.out.println("Digite o valor a ser transferido");
                matheus.transfere(leitura.nextDouble());
                break;

                default:
                System.out.println("Digite um valor válido");
            }

            op = leitura.nextInt();

        }
    }

}
