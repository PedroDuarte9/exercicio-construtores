package application;

import entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o nome do Títular: ");
        conta.setNome(sc.nextLine());

        System.out.println("Digite o número do Titular: ");
        conta.setNumero(sc.nextInt());

        System.out.println("Digite um valor para iniciar a conta: ");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);

        System.out.println(conta);

        System.out.println("Você deseja sacar algum valor ?");
        double saque = sc.nextDouble();
        conta.saque(saque);

        System.out.println(conta);


        sc.close();



    }
}
