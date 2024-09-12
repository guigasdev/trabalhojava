package Ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {

    private int[] vetor;

    public void ordenar() {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Quantos números terá seu vetor?");
        int n = scanner.nextInt();
        vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("O vetor original: " + Arrays.toString(vetor));

        // Ordenação usando o algoritmo de ordenação por bolha
        bubbleSort(vetor);

        System.out.println("O vetor organizado em ordem crescente: " + Arrays.toString(vetor));

        scanner.close();
    }

    private void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Se não houve troca, o array já está ordenado
        }
    }

    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        ordenacao.ordenar();
    }
}
