package listas;

import itens.Produto;
import menu.MenuInicial;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista implements FiltrarProduto, EditarProduto, ApagarProduto, AdicionarProduto {

    private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
    private ArrayList<Produto> filtroDeProdutos = new ArrayList<Produto>();
    private Scanner input = new Scanner(System.in);

    public Lista() {
    }

    public void setProdutos(Produto objeto) {
        listaDeProdutos.add(objeto);

    }

    public ArrayList<Produto> getProdutos() {
        return listaDeProdutos;
    }

    @Override
    public String toString() {
        return "Listas [listaDeProdutos=" + listaDeProdutos + "]";
    }


    @Override
    public void filtroDeProdutoPorCategoria() {
        System.out.println("Digite uma das opções abaixo: \n 1. Filtrar por Mercado \n 2. Filtrar por Livro \n 3. Filtrar por Informatica \n 4. Voltar");
        int escolha = Integer.parseInt(input.nextLine());

        switch (escolha) {
            case 1 -> {
                String atributo = "Mercado";
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (atributo.equals(listaDeProdutos.get(i).getCategoria())) {
                        filtroDeProdutos.add(listaDeProdutos.get(i));
                    }
                }
            }
            case 2 -> {
                String atributo = "Livro";
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (atributo.equals(listaDeProdutos.get(i).getCategoria())) {
                        filtroDeProdutos.add(listaDeProdutos.get(i));
                    }
                }
            }
            case 3 -> {
                String atributo = "Informatica";
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (atributo.equals(listaDeProdutos.get(i).getCategoria())) {
                        filtroDeProdutos.add(listaDeProdutos.get(i));
                    }
                }
            }
            case 4 -> {
                MenuInicial.acaoRetornarMenuUsuario();
            }
        }
    }
    public void filtroDeProdutoPorMarca() {
        System.out.println("Digite uma das opções abaixo: \n 1. Filtrar por Mercado \n 2. Filtrar por Livro \n 3. Filtrar por Informática \n 4. Voltar");
        int escolha = Integer.parseInt(input.nextLine());

        switch (escolha) {
            case 1 -> {
                String atributo = "Mercado";
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getMarca().equals(atributo)) {
                        filtroDeProdutos.add(listaDeProdutos.get(i));
                    }
                }
            }
            case 2 -> {
                String atributo = "Livro";
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getMarca().equals(atributo)) {
                        filtroDeProdutos.add(listaDeProdutos.get(i));
                    }
                }
            }
            case 3 -> {
                String atributo = "Informatica";
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getMarca().equals(atributo)) {
                        filtroDeProdutos.add(listaDeProdutos.get(i));
                    }
                }
            }
            case 4 -> {
                MenuInicial.acaoRetornarMenuUsuario();
            }
        }
    }

    public void printFiltro() {
        for (Produto produto : filtroDeProdutos) {
            System.out.println(produto);
        }
    }

    @Override
    public void editorDeProduto() {
        System.out.println("Digite uma das opções abaixo: \n 1. Editar Nome \n 2. Editar Categoria \n 3. Editar Marca \n 4. Editar Marca \n 5. Voltar");
        int editor = Integer.parseInt(input.nextLine());

        switch (editor) {
            case 1 -> {
                System.out.println("Digite o nome do produto que será alterado: ");
                String nome = input.nextLine();
                System.out.println("Digite o novo nome:");
                String nomeAlterado = input.nextLine();
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getNome().equals(nome)) {
                        listaDeProdutos.get(i).setNome(nomeAlterado);

                    }
                }
            }
            case 2 -> {
                System.out.println("Digite o nome do produto que será alterado: ");
                String nome = input.nextLine();
                System.out.println("Digite a nova categoria: ");
                String categoriaAlterada = input.nextLine();
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getNome().equals(nome)) {
                        listaDeProdutos.get(i).setCategoria(categoriaAlterada);
                    }
                }
            }
            case 3 -> {
                System.out.println("Digite o nome do produto que será alterado: ");
                String nome = input.nextLine();
                System.out.println("Digite a nova marca: ");
                String marcaAlterada = input.nextLine();
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getNome().equals(nome)) {
                        listaDeProdutos.get(i).setMarca(marcaAlterada);
                    }
                }
            }
            case 4 -> {
                System.out.println("Digite o nome do produto que será alterado: ");
                String nome = input.nextLine();
                System.out.println("Digite o novo valor: ");
                double precoAlterado = input.nextDouble();
                for (int i = 0; i < listaDeProdutos.size(); i++) {
                    if (listaDeProdutos.get(i).getNome().equals(nome)) {
                        listaDeProdutos.get(i).setPreco(precoAlterado);
                    }
                }
            }
        }
    }

    @Override
    public void excluirProduto() {
        System.out.println("Digite o nome do produto que será deletado: ");
        String nome = input.nextLine();
        System.out.println("Digite a marca do produto a ser deletado: ");
        String marca = input.nextLine();
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            if (listaDeProdutos.get(i).getNome().equals(nome) && listaDeProdutos.get(i).getMarca().equals(marca)) {
                listaDeProdutos.remove(i);

            }
        }
    }

    @Override
    public void adicionarProduto() {
        Produto produto = new Produto();
        System.out.println("Digite o Nome do Produto: ");
        String nome = input.nextLine();
        produto.setNome(nome);
        System.out.println("Digite a categoria do Produto: ");
        String categoria = input.nextLine();
        produto.setCategoria(categoria);
        System.out.println("Digite a marca ou editora do Produto: ");
        String marca = input.nextLine();
        produto.setMarca(marca);
        System.out.println("Digite o valor do produto: ");
        Double preco = input.nextDouble();
        produto.setPreco(preco);
        System.out.println();

        System.out.println("Seu novo produto cadastrado é um(a) " + nome + " da Categoria: " + categoria + ", Marca: " + marca + " e o valor: R$ " + preco);
        setProdutos(produto);
    }
}

