package Itens;

public class Livro extends Produto implements IProdutos, IEstoque {

    public Livro(){
    }
    public Livro(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }
}
