import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner leitura = new Scanner(System.in);
        Conta matheus = new Conta();

        matheus.nome = "Matheus";
        matheus.tipoConta = "Corrente";
        matheus.saldoInicial = 2500;

        int op = 0;
        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + matheus.nome);
        System.out.println("Tipo da conta: " + matheus.tipoConta);
        System.out.println("Saldo: " + matheus.saldoInicial);
        System.out.println("\n*************************");

        String menu = """
            Operações

            1 - Consultar saldo
            2 - Depositar
            3 - Tranferir
            4 - Sair

            Digite o numero da opção desejada
                
                """;

        while(op != 4){
            System.out.println(menu);
            op = leitura.nextInt();

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

                    double valor = leitura.nextDouble();

                    if(valor > matheus.saldoInicial) {
                        System.out.println("Você não tem saldo suficiente");
                    } else {
                        matheus.transfere(valor);
                    }
                break;

                default:
                    System.out.println("Digite um valor válido");
            }  

        }
    }

}
