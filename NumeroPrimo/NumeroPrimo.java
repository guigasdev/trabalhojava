package NumeroPrimo;

import java.util.Scanner;

public class NumeroPrimo{
    Scanner prompt = new Scanner(System.in);
    int a;
    public void verificarNumeroPrimo(){
        System.out.println("Digite um numero: ");
        a = prompt.nextInt();
        if(a != 1){
            if(a%2 != 0 || a == 2){
                if(a%1==0){
                    if(a%a==0){
                        System.out.println("O número " + a + " é primo");
                    }
                }
            }else{
                System.out.println("O número " + a + " não é primo");
            }
        }else{
            System.out.println("O número " + a + " não é primo");
        }
    }

}