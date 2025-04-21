package com.exercicios5.tributes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        while(index != 0){
            System.out.println("===Sistema de cálculo de tributos===");
            System.out.println("Selecione a categoria do produto");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e bem estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("0 - Encerrar programa");
            System.out.println("===================================");
            index = scanner.nextInt();
            if(index == 0) return;
            System.out.println("Informe o preço do produto");
            double price = scanner.nextDouble();
            switch (index){
                case 1:
                    Food food = new Food();
                    System.out.printf("O valor do tributo desse produto da categoria Alimentação é %.2f \n", food.calculateTribute(price));
                    break;
                case 2:
                    HealthAndWellness healthAndWellness = new HealthAndWellness();
                    System.out.printf("O valor do tributo desse produto da categoria Saúde e bem estar é %.2f \n", healthAndWellness.calculateTribute(price));
                    break;
                case 3:
                    Clothing clothing = new Clothing();
                    System.out.printf("O valor do tributo desse produto da categoria Vestuário é %.2f \n", clothing.calculateTribute(price));
                    break;
                case 4:
                    Culture culture = new Culture();
                    System.out.printf("O valor do tributo desse produto da categoria Cultura é %.2f \n", culture.calculateTribute(price));
                    break;
                default:
                    System.out.println("Opção inválida de categoria");
                    break;
            }
        }
    }
}
