public class Ingresso {
    private String nome;
    private int cpf;
    private Evento evento;

    public Ingresso(String nome, int cpf, Evento evento) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
    }

    public void mostrarResumo() {
        System.out.println("Dono do Ingresso: " + getNome());
        System.out.println("CPF do dono do Ingresso: " + getCpf());
        System.out.println("Dados do evento: " + getEvento());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
