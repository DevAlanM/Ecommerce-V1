package Itens;

public class Mercado extends Produto implements IProdutos, IEstoque {

    public Mercado(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }
    
}
