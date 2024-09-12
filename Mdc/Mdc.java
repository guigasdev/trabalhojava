package Mdc;

import java.util.Scanner;
public class Mdc {
    int a, b, mdc;
    Scanner nA = new Scanner(System.in);
    Scanner nB = new Scanner(System.in);
    public void CalcularMdc() {
        System.out.println("digite o primeiro numero: ");
        a = nA.nextInt();
        System.out.println("digite o segundo numero: ");
        b = nB.nextInt();

        if(a % b == 0 || b % a == 0){
            if(a > b){
                System.out.println("o mdc é: " + a);
            }else{
                System.out.println("o mdc é: " + b);
            }
        }else{
            mdc = a * b;
            System.out.println("o mdc é: " + mdc);
        }
    }

}