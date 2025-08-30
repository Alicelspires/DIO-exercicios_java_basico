package exercicios.abstracao_encapsulamento;

public class PetWash {
    private Pet pet;
    private boolean clean = true;
    private double water = 0;
    private double shampoo = 0;
    
    public boolean takeAShower(){
        if(getWaterLevel() < 10 || getShampooLevel() < 2){

            System.out.println("Não há recursos suficiente para lavar o pet. Coloque 10 litros de água e 2 litro de shampoo no minímo");

        }
        if(!hasPet()){
            System.out.println("Coloque o pet para começar a lavagem");
            return false;
        }

        this.water -= 10;
        this.shampoo -= 2;
        this.pet.setClean(true);
        System.out.println("O pet esta limpo!, retire o pet da maquina");
        return true ;
    }

    public void addWater(){
        if(getWaterLevel() == 30){
            System.out.println("A capacidade de agua esta no máximo");
            return;
        }

        this.water += 2;
    }

    public void addShampoo(){
        if(getShampooLevel() == 10){
            System.out.println("A capacidade de shampoo esta no máximo");
            return;
        }

        this.shampoo += 2;
    }

    public double getWaterLevel(){
        return this.water;
    }

    public double getShampooLevel(){
        return this.shampoo;
    }

    public boolean hasPet(){
        return this.pet != null;
    }

    public void setPet(Pet pet){
        if(!this.clean){
            System.out.println("A maquina esta suja, para colocar um pet é necessário limpa-la");
            return;
        }
        if(hasPet()){
            System.out.println("O pet" + this.pet.getName() + " já esta sendo lavado");
            return;
        } 
        this.pet = pet;
    }

    public void removePet(){
        if(!hasPet()){
            System.out.println("Não há pet na maquina");
            return;
        }

        this.clean = !this.pet.isClean();
        this.pet = null;
    }

    public void washMachine(){
        if(getWaterLevel() < 3 || getShampooLevel() < 1){

            System.out.println("Não há recursos suficiente para lavar a maquina. Coloque 3 litros de água e 1 litro de shampoo no minímo");

        } else {
            
            this.water -= 3;
            this.shampoo -= 1;
            this.clean = true;
            System.out.println("A maquina foi limpa");
        }
    }
}