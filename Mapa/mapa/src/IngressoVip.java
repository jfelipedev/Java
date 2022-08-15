public class IngressoVip extends Ingresso{

    private int couter = 0;
    private double vip;

    public IngressoVip(String nome, int cpf, Evento evento) {
        super(nome, cpf, evento);
    }
    public double calcularValorIngresso(double valor){
        vip = valor * 1.3;
        couter++;
        return vip;
    }

    public void imprimirValor(){
        System.out.println("Tipo do ingresso: VIP" + "\n" + "Valor do ingresso R$" + vip);
    }

    public double getVip() {
        return vip;
    }

    public void setVip(double vip) {
        this.vip = vip;
    }

    public int getCouter() {
        return couter;
    }

    public void setCouter(int couter) {
        this.couter = couter;
    }
}
