package Itens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Produto extends Estoque implements Comparable<Produto>{
    
    protected String nome;
    protected String categoria;
    protected String marca;
    protected Double preco;  
    protected List<Produto> listarProdutos = new ArrayList<>();
    ArrayList<Produto> produtos = new ArrayList<>();
    public Produto(){

    }
    
    public Produto(String nome, String categoria, String marca, Double preco) {
        setNome(nome);
        setCategoria(categoria);
        setMarca(marca);
        setPreco(preco);
    }

      public void adicionarProduto() {
        Scanner input = new Scanner(System.in);
      
        System.out.println("Digite o Nome do Produto: ");
        this.nome = input.next();
        System.out.println("Digite a categoria do Produto: ");
        this.categoria = input.next();
        System.out.println("Digite a marca ou editora do Produto: ");
        this.marca = input.next();
        System.out.println("Digite o valor do produto: ");
        this.preco = input.nextDouble();
        System.out.println();
        Estoque.cadastrarProdutos(nome, categoria, marca, preco); 
     
        System.out.println("Seu novo produto cadastrado é um(a) " + nome + " da Categoria: " + categoria + ", Marca: " + marca + " e o valor: R$ " + preco);
    }


    
    public void ordenarProdutos(){
        Collections.sort(listarProdutos);
    }
     /* TO DO: AJUSTAR Ordenacao e referencias */

     public static void verProdutosOrdenados() {
             ArrayList<Produto> produtosOrdenados = (ArrayList<Produto>) produtos.clone();
             Collections.sort(produtosOrdenados);
            for (Produto produto : produtosOrdenados) {
           System.out.println(produto.getNome());
       }
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }




    @Override
    public int compareTo(Produto outroProduto) {
        if(this.preco > outroProduto.getPreco()){
            return -1;
        }
        if(this.preco < outroProduto.getPreco()){
            return +1;
        }
        else{
        return 0;
        }
    }


    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", categoria=" + categoria + ", marca=" + marca + ", preco=" + preco + "]";
    }
}