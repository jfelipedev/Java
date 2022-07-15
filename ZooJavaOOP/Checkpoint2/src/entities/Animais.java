package entities;

public class Animais {

    private int id;
    private String raca;
    private double tamanho;
    private String sexo;

    public Animais() {
    }

    public Animais(int id, String raca, double tamanho, String sexo) {
        this.id = id;
        this.raca = raca;
        this.tamanho = tamanho;
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void cadastroAnimal(){
        System.out.println("O animal da raça " + getRaca() + " foi cadastrado!");
    }


    @Override
    public String toString() {
        return "Animais{" +
                "id=" + id +
                ", raca='" + raca + '\'' +
                ", tamanho=" + tamanho +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
