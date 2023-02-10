import ValidaPessoa.*;

public class Programa {
    public Programa() {
    }
    public static void main(String[] args) 
    {
        
        ObterPessoa.obterPessoa();
        
    }
}





        //ArrayList<Produto> produtos = new ArrayList<Produto>();
        // Administrador administrador = new Administrador("admin", "senhaadmin", produtos);
        // UsuarioComum usuario1 = new UsuarioComum("usuario1", "senha1", ArrayList<produtos>);
        // UsuarioComum usuario2 = new UsuarioComum("usuario2", "senha2", ArrayList<produtos>);

      

//         Usuario usuarioAutenticado = autenticarUsuario(nome, senha, administrador, usuario1, usuario2);
//         if (usuarioAutenticado == null) {
//             System.out.println("Usuário ou senha incorretos");
//         } else {
//             System.out.println("Usuário autenticado: " + usuarioAutenticado.getNome());
//             if (usuarioAutenticado.getPerfil().equals("admin")) {
//                 // realizar ações específicas para administradores aqui
//                 System.out.println("Ações específicas para administradores:");
//                 administrador.criarProduto();
//             } else {
//                 // realizar ações específicas para usuários comuns aqui
//                 System.out.println("Ações específicas para usuários comuns:");
//                 usuarioAutenticado.verProdutos();
//                 usuarioAutenticado.verProdutosOrdenados();
//             }
//         }
//     }

//     public static Usuario autenticarUsuario(String nome, String senha, Usuario ... usuarios) {
//         for(Usuario usuario: usuarios){
//             if(usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)){
//                 return usuario;
//             }
//         }
//         return null;
//     }
// }

// class Usuario {
//     protected String nome;
//     protected String senha;
//     protected ArrayList<Produto> produtos;
//     protected String perfil;

//     public Usuario(String nome, String senha, ArrayList<Produto> produtos) {
//         this.nome = nome;
//         this.senha = senha;
//         this.produtos = produtos;
//     }

//     public Usuario(String nome2, String senha2, String string) {
//     }

//     public String getNome() {
//         return nome;
//     }

//     public String getSenha() {
//         return senha;
//     }

//     public ArrayList<Produto> getProdutos() {
//         return produtos;
//     }

//     public String getPerfil() {
//         return perfil;
//     }

//     public void verProdutos() {
//         for (Produto produto : produtos) {
//             System.out.println(produto.getNome());
//         }
//     }

//     public void verProdutosOrdenados() {
//         ArrayList<Produto> produtosOrdenados = (ArrayList<Produto>) produtos.clone();
//         Collections.sort(produtosOrdenados);
//         for (Produto produto : produtosOrdenados) {
//             System.out.println(produto.getNome());
//         }
//     }
// }

// class Administrador extends Usuario {
//     public Administrador(String nome, String senha, ArrayList<Produto> produtos) {
//         super(nome, senha, produtos);
//         this.perfil = "admin";
//     }

//     public void criarProduto() {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Insira o nome do produto: ");
//         String nome = scan.nextLine();
//         System.out.print("Insira a descrição do produto: ");
//         String descricao = scan.nextLine();
//         Produto produto = new Produto(nome, descricao);
//         this.produtos.add(produto);
//         System.out.println("Produto " + nome + " criado com sucesso!");
//     }
// }

// class UsuarioComum extends Usuario {
//     public UsuarioComum(String nome, String senha, ArrayList<Produto> produtos) {
//         super(nome, senha, produtos);
//         this.perfil = "usuario";
//     }
// }

// class Produto implements Comparable<Produto> {
//     private String nome;
//     private String descricao;

//     public Produto(String nome, String descricao) {
//         this.nome = nome;
//         this.descricao = descricao;
//     }

//     public String getNome() {
//         return nome;
//     }

//     public String getDescricao() {
//         return descricao;
//     }

//     @Override
//     public int compareTo(Produto outroProduto) {
//         return this.nome.compareTo(outroProduto.getNome());
//     }
//}

