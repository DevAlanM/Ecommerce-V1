package Menu;
import java.util.Scanner;

import Itens.Estoque;
import Itens.IEstoque;
import Itens.Produto;

public class MenuInicial{
    public static void escolhaMenuUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá seja bem vindo a Americanas, o que deseja fazer? ");
        System.out.println("Digite uma das opções abaixo: \n 1. Visualizar lista de produtos \n 2. Filtrar por categoria \n 3. Filtrar por marca \n 4. Ordenar por nome (ordem crescente e decrescente) \n 5. Ordernar por preço (ordem crescente e decrescente) \n 6. Sair");
        int escolhaUsuario = input.nextInt();
        switch (escolhaUsuario) {
            case 1 -> {
                Estoque.listarProdutos();
                acaoRetornarMenuUsuario();
            }
            case 2 -> {
                System.out.println("OPÇÃO EM MANUTENÇÃO");
                acaoRetornarMenuUsuario();
            }
            case 3 -> {
                System.out.println("OPÇÃO EM MANUTENÇÃO");
                acaoRetornarMenuUsuario();
            }
            case 4 -> {
                Produto.verProdutosOrdenados();
                System.out.println("OPÇÃO EM MANUTENÇÃO");
                acaoRetornarMenuUsuario();
            }
            case 5 -> {
                System.out.println("OPÇÃO EM MANUTENÇÃO");
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
        System.out.println("Olá seja bem vindo a Americanas, o que deseja fazer? ");
        System.out.println("Digite uma das opções abaixo: \n 1. Adicionar Produto \n 2. Visualizar Lista de Produtos \n 3. Editar Produto \n 4. Remover Produto \n 5. Sair");
        int escolhaUsuario = input.nextInt();
        switch (escolhaUsuario) {
            case 1:
                Produto produto = new Produto();
                produto.adicionarProduto(); ;
                System.out.println();
                acaoRetornarMenuAdmin();
                break;
            case 2:
                Estoque.listarProdutos();
                acaoRetornarMenuAdmin();
                break;                
            case 3:
                System.out.println("OPÇÃO EM DESENVOLVIMENTO");

                Estoque.EditarProduto();
                acaoRetornarMenuAdmin();
                break;
            case 4:
                Estoque.RemoverProduto();
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