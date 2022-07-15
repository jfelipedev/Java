package entities;

public class Endereco {

    private int id;
    private String numero;
    private String rua;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco(int id, String numero, String rua, String cidade, String estado) {
        this.id = id;
        this.numero = numero;
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco {" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", rua='" + rua + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
