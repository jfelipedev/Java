public class IngressoPista extends Ingresso{

    private double pista;

    private int couter = 0;


    public IngressoPista(String nome, int cpf, Evento evento) {
        super(nome, cpf, evento);
    }

    public double calcularValorIngresso(double valor){
        pista = valor;
        couter++;
        return pista;
    }

    public void imprimirValor(){
         System.out.println("Tipo do ingresso: PISTA" + "\n" + "Valor do ingresso R$" + pista);
    }

    public double getPista() {
        return pista;
    }

    public void setPista(double pista) {
        this.pista = pista;
    }

    public int getCouter() {
        return couter;
    }

    public void setCouter(int couter) {
        this.couter = couter;
    }
}
