package br.com.estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.setNome("Caneta");
        e.setQtdAtual(10);
        e.setQtdMinimo(5);
        System.out.println(e.mostra());

        Estoque e1= new Estoque(1,"Caderno",20,1);
        e1.darBaixa(10);
        System.out.println("Estoque atual: "+ e1.getQtdAtual());
        e1.darBaixa(100);
        System.out.println(e1.precisaRepor());

    }
}
