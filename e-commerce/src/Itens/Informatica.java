package Itens;

public class Informatica extends Produto implements IProdutos, IEstoque {

    public Informatica(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }
}
