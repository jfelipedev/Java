package entities.subclasses;

import entities.Animais;
import entities.Periculosidade;

public class Mamiferos extends Animais implements Periculosidade {
    private boolean gestante;

    public Mamiferos(int id, String raca, double tamanho, String sexo, boolean gestante) {
        super(id, raca, tamanho, sexo);
        this.gestante = gestante;
    }

    @Override
    public String toString() {
        return "Mamiferos{" +
                "gestante=" + gestante +
                '}';
    }

    @Override
    public boolean periculosidade() {
        return false;
    }
}
