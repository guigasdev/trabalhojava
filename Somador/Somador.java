package Somador;

import java.util.Scanner;
public class Somador {
    int n;
    int numero;
    Scanner prompt = new Scanner(System.in);
    public void Somar(){
        System.out.println("Quantos numeros deseja somar?");
        n = prompt.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("digite o numero");
            numero += prompt.nextInt();

        }
        System.out.println("A soma é: " + numero);
    }
}