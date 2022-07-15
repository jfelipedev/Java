package entities.subclasses;

import entities.Animais;
import entities.Periculosidade;

public class Aves extends Animais implements Periculosidade {
    private boolean voo;

    public Aves(int id, String raca, double tamanho, String sexo, boolean voo) {
        super(id, raca, tamanho, sexo);
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Aves{" +
                "voo=" + voo +
                '}';
    }

    @Override
    public boolean periculosidade() {
        return false;
    }
}
