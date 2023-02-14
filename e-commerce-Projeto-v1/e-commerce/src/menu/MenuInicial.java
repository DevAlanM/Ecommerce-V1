package menu;

import itens.*;
import listas.*;
import ordenadores.*;

import java.util.Collections;
import java.util.Scanner;

public class MenuInicial {
    public static void escolhaMenuUsuario() {
        Lista produtos = new Lista();
        produtos.setProdutos(new Produto("Macarrao", "Mercado", "Gostoso", 4.79));
        produtos.setProdutos(new Produto("Monitor", "Informatica", "LG", 1000.00));

        Scanner input = new Scanner(System.in);
        System.out.println("Olá seja bem vindo a Americanas, o que deseja fazer? ");
        System.out.println("Digite uma das opções abaixo: \n 1. Visualizar lista de produtos \n 2. Filtrar por categoria \n 3. Filtrar por marca \n 4. Ordenar por nome (ordem crescente e decrescente) \n 5. Ordernar por preço (ordem crescente e decrescente) \n 6. Sair");
        int escolhaUsuario = input.nextInt();
        switch (escolhaUsuario) {
            case 1 -> {
                for (Produto ListaDeProdutos : produtos.getProdutos()) {
                    System.out.println(ListaDeProdutos.toString());
                }
                acaoRetornarMenuUsuario();
            }
            case 2 -> {
                produtos.filtroDeProdutoPorCategoria();
                acaoRetornarMenuUsuario();
            }
            case 3 -> {
                produtos.filtroDeProdutoPorMarca();
                acaoRetornarMenuUsuario();
            }
            case 4 -> {
                System.out.println("Lista crescente ordenada por nome");
                Collections.sort(produtos.getProdutos(), new OrdenarNomeCrescente());
                for (Produto listas : produtos.getProdutos()) {
                    System.out.println(listas.toString());
                }
                System.out.println("Lista decrescente ordenada por nome");
                Collections.sort(produtos.getProdutos(), new OrdenarNomeDecrescente());
                for (Produto listas : produtos.getProdutos()) {
                    System.out.println(listas.toString());
                }
                acaoRetornarMenuUsuario();
            }
            case 5 -> {
                System.out.println("Lista crescente ordenada por preço");
                Collections.sort(produtos.getProdutos(), new OrdenarPrecoCrescente());
                for (Produto listas : produtos.getProdutos()) {
                    System.out.println(listas.toString());
                }
                System.out.println("Lista decrescente ordenada por preço");
                Collections.sort(produtos.getProdutos(), new OrdenarPrecoDecrescente());
                for (Produto listas : produtos.getProdutos()) {
                    System.out.println(listas.toString());
                }
                acaoRetornarMenuUsuario();
            }
            case 6 -> {
                System.out.println("Obrigado pela preferencia.");
                System.exit(0);
            }
            default -> throw new IllegalArgumentException("Valor inválido, tente novamente");
        }
    }

    public static void acaoRetornarMenuUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja voltar para o menu ? S/N");
        String acaoMenu = input.next();
        if (acaoMenu.equalsIgnoreCase("S")) {
            escolhaMenuUsuario();
        } else {
            if (!acaoMenu.equalsIgnoreCase("N")) {
                throw new IllegalArgumentException();
            }

            System.exit(0);
        }

    }

    public static void escolhaMenuAdmin() {
        Scanner input = new Scanner(System.in);
        Lista produtoList = new Lista();
        System.out.println("Olá seja bem vindo a Americanas, o que deseja fazer? ");
        System.out.println("Digite uma das opções abaixo: \n 1. Adicionar Produto \n 2. Visualizar Lista de Produtos \n 3. Editar Produto \n 4. Remover Produto \n 5. Sair");
        int escolhaUsuario = input.nextInt();
        switch (escolhaUsuario) {
            case 1:
                produtoList.adicionarProduto();
                System.out.println();
                acaoRetornarMenuAdmin();
                break;
            case 2:
                produtoList.getProdutos();
                acaoRetornarMenuAdmin();
                break;
            case 3:
                produtoList.editorDeProduto();
                acaoRetornarMenuAdmin();
                break;
            case 4:
                produtoList.excluirProduto();
                acaoRetornarMenuAdmin();
                break;
            case 5:
                System.out.println("Obrigado pela preferencia.");
                System.exit(0);
                break;
            default:
                throw new IllegalArgumentException("Valor inválido, tente novamente");
        }

    }

    public static void acaoRetornarMenuAdmin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja voltar para o menu ? S/N");
        String acaoMenu = input.next();
        if (acaoMenu.equalsIgnoreCase("S")) {
            escolhaMenuAdmin();
        } else {
            if (!acaoMenu.equalsIgnoreCase("N")) {
                throw new IllegalArgumentException();
            }

            System.exit(0);
        }

    }


}