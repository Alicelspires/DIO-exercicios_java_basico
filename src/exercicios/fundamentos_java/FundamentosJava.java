package exercicios.fundamentos_java;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class FundamentosJava {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println(NomeIdade());
        System.out.println(Quadrado());
        System.out.println(Retangulo());
        System.out.println(DiferencaIdade());

        sc.close();
    }

    public static String NomeIdade(){

        System.out.print("Escreva seu nome: ");
        String name = sc.nextLine() + "\n";
        System.out.print("Escreva seu ano de nascimento: ");
        int yearBirth = sc.nextInt();


        return String.format("Olá %s você tem %d anos", name, OffsetDateTime.now().getYear() - yearBirth);
    }

    public static String Quadrado(){

        System.out.print("Tamanho do lado do quadrado: ");
        double lado = sc.nextDouble();

        return String.format("O quadrado fornecido tem %.1f de área", lado*lado);
    }

    public static String Retangulo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho da base do retangulo: ");
        double base = sc.nextDouble();
        System.out.print("Tamanho da altura do retangulo: ");
        double altura = sc.nextDouble();

        return String.format("O Retangulo fornecido tem %.1f de área", base*altura);
    }

    public static String DiferencaIdade(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome (pessoa 1): ");
        String nome1 = sc.nextLine();
        System.out.print("Idade (pessoa 1): ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.println("====================");

        System.out.print("Nome (pessoa 2): ");
        String nome2 = sc.nextLine();
        System.out.print("Idade (pessoa 2): ");
        int idade2 = sc.nextInt();
        sc.nextLine();

        int diferenca = idade1 > idade2 ? idade1 - idade2 : idade2 - idade1;

        return String.format("A diferença entre as idades de: %s e %s fornecidas é de: %d anos", nome1, nome2, diferenca);
    }
}
