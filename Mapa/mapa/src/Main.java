public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Rock in Rio", "12/11/22",249.99,50000);
        Ingresso ingresso1 = new Ingresso("Felipe", 555666, evento1);

        IngressoVip ingVip1 = new IngressoVip (ingresso1.getNome(),ingresso1.getCpf(),evento1);
        ingVip1.calcularValorIngresso(evento1.getValorUnico());

        Ingresso ingresso2 = new Ingresso("Mayara", 777333, evento1);

        IngressoCamarote ingCamarote1 = new IngressoCamarote (ingresso1.getNome(),ingresso1.getCpf(),evento1);
        ingCamarote1.calcularValorIngresso(evento1.getValorUnico());


        System.out.println("_______________");
        evento1.imprime();
        System.out.println("_______________");
        ingresso1.mostrarResumo();
        ingVip1.imprimirValor();
        System.out.println("_______________");
        evento1.venderIngresso(ingresso1);


        ingresso2.mostrarResumo();
        ingCamarote1.imprimirValor();
        System.out.println("_______________");
        evento1.venderIngresso(ingresso2);




        evento1.mostrarIngressosVendidos();
    }
}
