package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b;

        System.out.println("Digite o primeiro valor");
        a = s.nextInt();

        System.out.println("Digite o segundo valor");
        b = s.nextInt();

        int dividir = dividir(a, b);

        System.out.println("somar "+ somar(a, b));
        System.out.println("divisao "+subtrair(a, b));
        System.out.println("subtração "+ dividir);
    }


    public static int somar (int a, int b){
        return a+b;
    }public static int subtrair (int a, int b){
        return a-b;
    }public static int dividir (int a, int b){
        return a/b;
    }
}
/*ctrl+alt+l organizar
ctrl+d duplicar linha
ctrl+y apagar linha
ctrl+shft+setas subir ou descer codigo
sfit+f6 renomear
ctrl+k abrir commit git
alt+ins opcoes construtor e se for no projeto class, package
ctrl+n procurar classe
ctrl+b entra na classe
* */