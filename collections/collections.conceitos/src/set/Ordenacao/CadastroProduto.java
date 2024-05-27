package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class CadastroProduto {
    
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }
    
    public void adicionarProduto(String nomeProduto, double precoProduto, long codigoProduto, int quantidade ){
        produtoSet.add(new Produto(nomeProduto, precoProduto, codigoProduto, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    
    public Set<Produto> exibiPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        System.out.println(cadastroProduto.produtoSet);

        cadastroProduto.adicionarProduto("PC", 2000d, 124, 100);
        cadastroProduto.adicionarProduto("Mouse", 250d, 130, 100);
        cadastroProduto.adicionarProduto("Tela", 900d, 120, 100);
        cadastroProduto.adicionarProduto("Teclado", 300d, 230, 100);

        //System.out.println(cadastroProduto.produtoSet);
       // System.out.println("Procurando produto por nome "+cadastroProduto.exibiProdutosPorNome());

        System.out.println(cadastroProduto.exibiPorPreco());




    }
    
}
