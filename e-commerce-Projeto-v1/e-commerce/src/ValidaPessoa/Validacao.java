package ValidaPessoa;

import Pessoas.UsuarioComum;
import Pessoas.Administrador;

public class Validacao {
    public Validacao() {
    }

    public static void validaUsuarioComum(String nome, String senha) {
        UsuarioComum usuario1 = new UsuarioComum("usuario1", "senha1", "usuario");
     
        
        if (!nome.equals(usuario1.getNome()) || !senha.equals(usuario1.getSenha())) {
            System.out.println("Usuário ou senha incorreta, tente novamente mais tarde");
            System.exit(0);
        }
    }

    public static void validaAdministrador(String nome, String senha) {
        Administrador administrador = new Administrador("admin", "senhaadmin", "admin");
        
        if (!nome.equals(administrador.getNome()) || !senha.equals(administrador.getSenha())) {
                System.out.println("Usuário ou senha incorreta, tente novamente mais tarde");
                System.exit(0);
            }
    }
}