package ValidaPessoa;

import java.util.Scanner;

import Menu.MenuInicial;

public class ObterPessoa {
    public static void obterPessoa() {
        Scanner login = new Scanner(System.in);

        System.out.println("Deseja entrar como Usuário ou Administrador");
        System.out.println("Digite uma das opções abaixo: \n 1. Usuário \n 2. Administrador");
        int escolhaPessoa = login.nextInt();
    
        String nome;
        String senha;
    
        if (escolhaPessoa == 1) {
            System.out.println("Olá Usuário, digite seu nome");
            nome = login.next();
            System.out.println("Digite sua senha");
            senha = login.next();
            Validacao.validaUsuarioComum(nome, senha);
            System.out.println();
            MenuInicial.escolhaMenuUsuario();

            System.out.println();
        } else if (escolhaPessoa == 2) {
            System.out.println("Olá Administrador, digite seu nome");
            nome = login.next();
            System.out.println("Digite sua senha");
            senha = login.next();
            Validacao.validaAdministrador(nome, senha);
            System.out.println();
            MenuInicial.escolhaMenuAdmin();
        } else {
            System.out.println("Opção inválida");
        }
    
    }
}
    