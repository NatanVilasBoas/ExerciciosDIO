import com.exercicios.carro.Car;

import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("======Seja bem vindo ao Banco======");
//        System.out.println("\n");
//        System.out.println("Crie sua conta para podermos prosseguir");
//        System.out.printf("Primeiro digite seu nome: ");
//        String nome = scanner.next();
//        System.out.printf("Digite seu saldo inicial: ");;
//        double saldo = scanner.nextDouble();
//
//        ContaBancaria primeiraConta = new ContaBancaria(nome, saldo);
//
//        System.out.println("Conta criada.");
//        System.out.println("\n");
//
//        int index = -1;
//        while(index !=0){
//            System.out.println("Qual operação deseja realizar?");
//            System.out.println("1- Consultar Saldo.");
//            System.out.println("2- Consultar se está sendo utilizado cheque especial.");
//            System.out.println("3- Sacar valor.");
//            System.out.println("4- Depositar valor");
//            System.out.println("5- Pagar Boleto");
//            System.out.println("6- Consultar valor do cheque especial.");
//            System.out.println("0- Finalizar operações");
//            System.out.println("\n");
//            int value = scanner.nextInt();
//
//            switch (value){
//                case 1:
//                    System.out.println(primeiraConta.consultarSaldo());
//                    System.out.println("\n");
//                    break;
//                case 2:
//                    primeiraConta.verificarChequeEspecial();
//                    System.out.println("\n");
//                    break;
//                case 3:
//                    System.out.println("Qual valor deseja sacar?");
//                    double valorSaque = scanner.nextDouble();
//                    primeiraConta.sacar(valorSaque);
//                    System.out.println("\n");
//                    break;
//                case 4:
//                    System.out.println("Qual valor deseja depositar?");
//                    double valorDep = scanner.nextDouble();
//                    primeiraConta.depositar(valorDep);
//                    System.out.println("\n");
//                    break;
//                case 5:
//                    System.out.println("Qual o valor do boleto a ser pago?");
//                    double valorBol = scanner.nextDouble();
//                    primeiraConta.pagarBoleto(valorBol);
//                    System.out.println("\n");
//                    break;
//                case 6:
//                    System.out.println(primeiraConta.consultaChequeEspecial());
//                    System.out.println("\n");
//                default:
//                    index = value;
//                    break;
//            }
//        }
//    }

    public static void main(String[] args){
        Car uno = new Car();

        Scanner scanner = new Scanner(System.in);

        int index = -1;
        while(index !=0) {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1- Ligar carro.");
            System.out.println("2- Desligar carro.");
            System.out.println("3- Acelerar.");
            System.out.println("4- Desacelerar.");
            System.out.println("5- Virar para esquerda ou direita");
            System.out.println("6- verificar velocidade.");
            System.out.println("7- trocar marcha.");
            System.out.println("0- Finalizar operações");
            System.out.println("\n");
            int value = scanner.nextInt();

            switch (value) {
                case 1:
                    uno.setIsOn(true);
                    System.out.println("\n");
                    break;
                case 2:
                    uno.setIsOn(false);
                    System.out.println("\n");
                    break;
                case 3:
                    uno.accelerate();
                    System.out.println("\n");
                    break;
                case 4:
                    uno.decelerate();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("Qual lado deseja virar? (esquerda/direita)");
                    String resp = scanner.next();
                    uno.turnRightLeft(resp);
                    System.out.println("\n");
                    break;
                case 6:
                    System.out.println("A velocidade atual é: " + uno.getVelocity() + "km/h");
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.println("Deseja trocar para qual marcha?");
                    int gear = scanner.nextInt();
                    uno.setGears(gear);
                    break;
                default:
                    index = value;
                    break;
            }
        }
    }
}