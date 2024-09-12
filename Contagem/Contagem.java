package Contagem;
import java.util.Scanner;

public class Contagem{
    Scanner prompt = new Scanner(System.in);
    int n, nota, cont = 0, i = 0;
    public void Contar(){
        System.out.println("Quantidade de alunos:");
        n = prompt.nextInt();
        while(i < n){
            System.out.println("Nota do aluno:");
            nota = prompt.nextInt();
            if(nota < 50){
                cont = cont +0;
            }else{
                cont = cont +1;
            }
            i++;
        }
        System.out.println("São " + n + " alunos");
        System.out.println("São " + cont + " aprovados");
    }
}