public class IngressoCamarote extends Ingresso{

    private double camarote;
    private int couter = 0;

    public IngressoCamarote(String nome, int cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    public double calcularValorIngresso(double valor){
        camarote = valor * 1.6;
        couter++;
        return camarote;
    }

    public void imprimirValor(){
        System.out.println("Tipo do ingresso: CAMAROTE" + "\n" + "Valor do ingresso R$" + camarote);
    }

    public double getCamarote() {
        return camarote;
    }

    public void setCamarote(double camarote) {
        this.camarote = camarote;
    }

    public int getCouter() {
        return couter;
    }

    public void setCouter(int couter) {
        this.couter = couter;
    }
}
