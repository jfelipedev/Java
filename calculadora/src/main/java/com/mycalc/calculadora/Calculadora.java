package com.mycalc.calculadora;
import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    static int x, y, escolha;

    public static void soma() {
        System.out.println("Digite os números a serem somados: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("O resultado é: " + (x + y) + "\n");
    }

    public static void sub() {
        System.out.println("Digite os números a serem subtraídos: ");
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("O resultado é: " + (x - y) + "\n");
    }

    public static void mult() {
        System.out.println("Digite os números a serem multiplicados: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("O resultado é: " + (x * y) + "\n");
    }

    public static void div() {
        System.out.println("Digite os números a serem divididos: ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("O resultado é: " + (x / y) + "\n");
    }
    public static void potencia() {
        System.out.println("Digite o número a ser elevado ao quadrado: ");
        x = sc.nextInt();
        System.out.println("O resultado é: " + (x * x) + "\n");
    }

    public static void main(String args[]) {
        do {
            System.out.println(
            "1. Soma\n" +
            "2. Subtração\n" +
            "3. Multiplicação\n" +
            "4. Divisão\n" +
            "5. Potência\n" +
            "0. Sair do programa\n" +
            "Digite o número da operação desejada (ou '0' para sair): ");

            escolha = sc.nextInt();
            if (escolha == 1)
                soma();
            if (escolha == 2)
                sub();
            if (escolha == 3)
                mult();
            if (escolha == 4)
                div();
            if (escolha == 5)
                potencia();
            if (escolha == 0)
                break;
        } while (escolha != 0);
    }
}
