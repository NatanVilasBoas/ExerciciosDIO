import com.banco.contabancaria.ContaBancaria;

import java.util.Scanner;

public class Main {
    private static int index = 1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======Seja bem vindo ao Banco======");
        System.out.println("\n");
        System.out.println("Crie sua conta para podermos prosseguir");
        System.out.printf("Primeiro digite seu nome: ");
        String nome = scanner.next();
        System.out.printf("Digite seu saldo inicial: ");;
        double saldo = scanner.nextDouble();

        ContaBancaria primeiraConta = new ContaBancaria(nome, saldo);

        System.out.println("Conta criada.");
        System.out.println("\n");


        while(index !=0){
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1- Consultar Saldo.");
            System.out.println("2- Consultar se está sendo utilizado cheque especial.");
            System.out.println("3- Sacar valor.");
            System.out.println("4- Depositar valor");
            System.out.println("5- Pagar Boleto");
            System.out.println("6- Consultar valor do cheque especial.");
            System.out.println("0- Finalizar operações");
            System.out.println("\n");
            int value = scanner.nextInt();

            switch (value){
                case 1:
                    System.out.println(primeiraConta.consultarSaldo());
                    System.out.println("\n");
                    break;
                case 2:
                    primeiraConta.verificarChequeEspecial();
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Qual valor deseja sacar?");
                    double valorSaque = scanner.nextDouble();
                    primeiraConta.sacar(valorSaque);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Qual valor deseja depositar?");
                    double valorDep = scanner.nextDouble();
                    primeiraConta.depositar(valorDep);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("Qual o valor do boleto a ser pago?");
                    double valorBol = scanner.nextDouble();
                    primeiraConta.pagarBoleto(valorBol);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println(primeiraConta.consultaChequeEspecial());
                    System.out.println("\n");
                default:
                    index = value;
                    break;
            }
        }
    }
}