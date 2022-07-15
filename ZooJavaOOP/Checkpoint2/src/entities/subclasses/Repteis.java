package entities.subclasses;

import entities.Animais;
import entities.Periculosidade;

public class Repteis extends Animais implements Periculosidade {
    private String ambiente;


    public Repteis(int id, String raca, double tamanho, String sexo, String ambiente) {
        super(id, raca, tamanho, sexo);
        this.ambiente = ambiente;
    }

    @Override
    public String toString() {
        return "Repteis{" +
                "ambiente=" + ambiente +
                '}';
    }

    @Override
    public boolean periculosidade() {
        return false;
    }
}
