public class Quitandinha{
    public static void main(String[] args) {
        ControleDeEstoque controleDeEstoque = new ControleDeEstoque();

        Produto produto1 = new Produto();
        produto1.setCodigo("0001");
        produto1.setNome("abcd");
        produto1.setQuantidadeEmEstoque(10);

        Produto produto2 = new Produto();
        produto2.setCodigo("0002");
        produto2.setNome("dcba");
        produto2.setQuantidadeEmEstoque(15);

        controleDeEstoque.adicionarProduto(produto1);
        controleDeEstoque.adicionarProduto(produto2);

        System.out.println("Produtos no estoque após adição:");
        controleDeEstoque.listarProdutos();

        controleDeEstoque.atualizarQuantidade("0001", 8);

        System.out.println("\nProdutos no estoque após atualização:");
        controleDeEstoque.listarProdutos();

        Produto buscado = controleDeEstoque.buscarProduto("0002");
        if (buscado != null) {
            System.out.println("\nProduto buscado: " + buscado);
        } else {
            System.out.println("\nProduto não encontrado.");
        }

        controleDeEstoque.removerProduto("0002");

        System.out.println("\nProdutos no estoque após remoção:");
        controleDeEstoque.listarProdutos();
    }
}
