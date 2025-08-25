package exercicios.estrutura_de_controle;
import java.util.Scanner;

public class EstruturasDeControle {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Tabuada());
        System.out.println(IMC());
        System.out.println(IntervaloParesImpares());
        System.out.println(processarEntradas());

        sc.close();
    }

    public static String Tabuada(){
        System.out.print("Escolha um número para mostrar seus multiplos até 10: ");
        int fator = Integer.parseInt(sc.nextLine());

        String tabuada = "";

        for(int i = 1; i <= 10; i++){
            tabuada += String.format("%d x %d = %d\n", fator, i, fator*i);
        }

        return tabuada;
    }

    public static String IMC(){
        System.out.print("Digite sua altura: ");
        double altura = Double.parseDouble(sc.nextLine());

        System.out.print("Digite seu peso: ");
        double peso = Double.parseDouble(sc.nextLine());

        double imc = peso/(altura*altura);
        
        if(imc <= 18.5){
            return "Abaixo do peso";
        } else if(imc <= 24.9 ){
            return "Peso ideal";
        } else if(imc <= 29.9){
            return "Levemente acima do peso";
        } else if(imc <= 34.9){
            return "Obesidade Grau I";
        } else if(imc <= 39.9){
            return "Obesidade Grau II (Severa)";
        } else {
            return "Obesidade Grau III (Mórbida)";
        }

    }

    public static String IntervaloParesImpares(){
        System.out.print("Digite um número: ");
        double num1 = Double.parseDouble(sc.nextLine());
        System.out.print("Digite um número maior que o anterior: ");
        double num2 = Double.parseDouble(sc.nextLine());

        if(num1 > num2){
            System.out.println("O primeiro número deve ser maior que o segundo, tente novamente");
            return IntervaloParesImpares();
        }

        System.out.print("Escolha par (p) ou impar (i): ");
        String opcao = sc.nextLine();

        String listaDeValores = "";

        for(double i = num2; i >= num1 ; i--){
            if(opcao.equals("p") && i % 2 == 0 ){
                listaDeValores += i + " ";

            } else if (opcao.equals("i") && i % 2 != 0 ){
                listaDeValores += i + " ";
            }
        }

        return listaDeValores;
    }

    public static String processarEntradas(){
        System.out.println("Número inicial: ");
        double numIni = sc.nextDouble();

        while(true){
            double nums = sc.nextDouble();
            if(nums > numIni && nums % numIni != 0) break;
        }
        
        return "Fim!";
    }
}
