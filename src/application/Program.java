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

        System.out.println("Deseja Fazer um depósito inicial Sim ou Não ? ");
        char opc = sc.next().charAt(0);
        if(opc == 's') {
            System.out.println("Digite o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta.deposito(deposito);
        }
        else{
            conta.deposito(0.0);
        }
        System.out.println(conta);

        System.out.println("Você deseja sacar algum valor ?");
        double saque = sc.nextDouble();
        conta.saque(saque);

        System.out.println(conta);


        sc.close();



    }
}
