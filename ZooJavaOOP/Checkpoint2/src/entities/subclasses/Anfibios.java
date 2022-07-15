package entities.subclasses;

import entities.Animais;
import entities.Periculosidade;

public class Anfibios extends Animais implements Periculosidade {
    private String fase;

    public Anfibios(int id, String raca, double tamanho, String sexo, String fase) {
        super(id, raca, tamanho, sexo);
        this.fase = fase;
    }

    @Override
    public String toString() {
        return "Anfibios{" +
                "fase='" + fase + '\'' +
                '}';
    }

    @Override
    public boolean periculosidade() {
        return false;
    }
}
