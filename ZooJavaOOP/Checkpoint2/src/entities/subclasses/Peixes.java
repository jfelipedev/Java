package entities.subclasses;

import entities.Animais;
import entities.Periculosidade;

public class Peixes extends Animais implements Periculosidade {
    private String tipoDeAgua;

    public Peixes(int id, String raca, double tamanho, String sexo, String tipoDeAgua) {
        super(id, raca, tamanho, sexo);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public String toString() {
        return "Peixes{" +
                "tipoDeAgua='" + tipoDeAgua + '\'' +
                '}';
    }

    @Override
    public boolean periculosidade() {
        return false;
    }
}
