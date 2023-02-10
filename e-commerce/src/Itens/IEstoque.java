package Itens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface IEstoque {
    static final List<Produto> listaDeProdutos = new ArrayList();

    public static void cadastrarProdutos(String nome, String categoria, String marca, Double preco) {
        listaDeProdutos.add(new Produto(nome, categoria, marca, preco));
    }

    public static void listarProdutos() {
        listaDeProdutos.forEach(System.out::println);
    }

    public static void RemoverProduto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto que quer remover:");
        String nome = input.next();

        if (listaDeProdutos.contains(nome)) {
            System.out.println("Seu produto " + nome + " será removido!!");
            listaDeProdutos.remove(nome);
        } else {
            System.out.println("Desculpe, esse produto não está cadastrado, confira se digitou o nome corretamente");
        }
    }

    public static List<Produto> EditarProduto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do produto que quer remover:");

        String nome = input.next();
        if (listaDeProdutos.contains(nome)) {
            List<Produto> listaEditadaDeProdutos = new ArrayList();

            List<Produto> listaDeProdutos = listaEditadaDeProdutos;
            return listaDeProdutos;
        } else {
            System.out.println("Desculpe, esse produto não está cadastrado, confira se digitou o nome corretamente");
        }
        return listaDeProdutos;
    }
}
