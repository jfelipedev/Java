import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome, data;
    private double valorUnico;
    private int capacidadeMaxima;

    private List<Ingresso> ingressos;

    public Evento(String nome, String data, double valorUnico, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
        this.ingressos = new ArrayList<Ingresso>();
    }

    public Evento() {

    }
    public void mostrarIngressosVendidos (){
        System.out.println("Total de ingressos vendidos: " + ingressos.size());
    }

    public void venderIngresso(Ingresso ingresso) {
        if (ingresso.getEvento().getCapacidadeMaxima() > ingressos.size()) {
            ingressos.add(ingresso);
        } else {
            System.out.println("CAPACIDADE MÁXIMA ALCANÇADA!");
        }
    }
    public void imprime() {
        System.out.println("Evento: " + this.nome);
        System.out.println("Data: " + this.data);
        System.out.println("Valor base: " + this.valorUnico);
        System.out.println("Capacidade: " + this.capacidadeMaxima);

        for (int i = 0; i < ingressos.size(); i++) {
            String participantes = ingressos.get(i).getNome();
            System.out.println("Participantes: " + participantes);
        }
    }

    //      getters and setters
    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", data: " + data;

    }
}
