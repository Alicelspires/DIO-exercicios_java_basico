package exercicios.abstracao_encapsulamento;

public class Pet {
    private String name;
    private boolean clean;

    Pet(String name){
        this.name = name;
        this.clean = false;
    }

    public String getName(){
        return this.name;
    }

    public boolean isClean(){
        return clean;
    }

    public void setClean(boolean clean){
        this.clean = clean;
    }
}
