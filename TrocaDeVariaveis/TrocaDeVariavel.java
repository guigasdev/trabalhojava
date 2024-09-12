package TrocaDeVariaveis;

public class TrocaDeVariavel{
    int a = 10, b = 20, aux;
    public void TrocaDeValores(){
        System.out.println("valor a:"+a);
        System.out.println("valor b:"+b);
        System.out.println("valor aux:"+aux);
        aux = a;
        a = b;
        b = aux;
        System.out.println("valor a:"+a);
        System.out.println("valor b:"+b);
        System.out.println("valor aux:"+aux);
    }
}