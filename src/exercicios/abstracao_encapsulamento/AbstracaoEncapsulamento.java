package exercicios.abstracao_encapsulamento;
import java.util.Scanner;

public class AbstracaoEncapsulamento {
    private final static Scanner sc = new Scanner(System.in);

    private final static PetWash petMachine = new PetWash();
    public static void main(String[] args) throws Exception {

        int option;

        do {

            System.out.println("==== Escolha uma opção ====");
            System.out.println("1. Dar banho no pet");
            System.out.println("2. Abastecer com água;");
            System.out.println("3. Abastecer com shampoo;");
            System.out.println("4. verificar nivel de água;");
            System.out.println("5. verificar nivel de shampoo;");
            System.out.println("6. verificar se tem pet no banho;");
            System.out.println("7. colocar pet na maquina;");
            System.out.println("8. retirar pet da máquina;");
            System.out.println("9. limpar maquina.");
            System.out.println("0. Terminar processo");

            System.out.print("\n\tEscolha uma opção: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> checkIfHasPetInMachine();
                case 7 -> setPetInPetMachine();
                case 8 -> petMachine.removePet();
                case 9 -> petMachine.washMachine();
                case 0 -> System.exit(0);
            }

        } while (true);
    }

    public static void setWater(){
        System.out.println("Colocando agua...");
        petMachine.addWater();
        System.out.println("\n");

    }

    public static void setShampoo(){
        System.out.println("Colocando shampoo..." );
        petMachine.addShampoo();
        System.out.println("\n");
    }

    public static void checkIfHasPetInMachine(){
        var hasPet = petMachine.hasPet();
        System.out.println(!hasPet ? "Não há um pet na maquina" + "\n" : "Há um pet na maquina" + "\n");
        
    }

    public static void verifyShampoo(){
        var amount = petMachine.getShampooLevel();
        System.out.println("A maquina esta no momento com " + amount + " litro(s) de shampoo" + "\n");
    }

    public static void verifyWater(){
        var amount = petMachine.getWaterLevel();
        System.out.println("A maquina esta no momento com " + amount + " litro(s) de água" + "\n");
    }

    public static void setPetInPetMachine(){
        String name = "";

        while(name == null || name.isEmpty()){
            System.out.println("Informe o nome do pet");
            name = sc.next();
        }

        Pet pet = new Pet(name);
        petMachine.setPet(pet);

        System.out.println("O pet " + pet.getName() + " foi colocado na maquina" + "\n");
    }
}
