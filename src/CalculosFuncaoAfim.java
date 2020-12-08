import java.util.*;
public class CalculosFuncaoAfim {
    public static void main(String[] args) {
        double a, b, y;
        int opcao;
        Scanner variaveis = new Scanner(System.in);
        System.out.println("Digite 1 para calcular o zero da função ou 2 para calcular o x da função");
        opcao = variaveis.nextInt();
        //A opção 1 calculo o zero da função afim
        if(opcao == 1) {
            System.out.println("Digite o valor de a: ");
            a = variaveis.nextDouble();
            System.out.println("Digite o valor de b: ");
            b = variaveis.nextDouble();
            CalcularZeroDaFuncaoAfim calculo = new CalcularZeroDaFuncaoAfim(a, b);
        } // A opção 2 faz o calculo do valor de x
        else if (opcao == 2){
            System.out.println("Digite o valor de a: ");
            a = variaveis.nextDouble();
            System.out.println("Digite o valor de b: ");
            b = variaveis.nextDouble();
            System.out.println("Digite o valor de y: ");
            y = variaveis.nextDouble();
            CalcularValorDoX calculoDoX = new CalcularValorDoX(a,b,y);
        }


    }
}
