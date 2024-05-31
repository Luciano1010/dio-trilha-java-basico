package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProduto(){
        System.out.println(estoqueProdutosMap);
    }
    
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.exibirProduto();

        estoque.adicionarProduto(1L, "Notebook", 10, 300);
        estoque.adicionarProduto(2L, "Cadeira Gamer", 20, 100);
        estoque.adicionarProduto(3L, "Celular", 10, 250);
        estoque.adicionarProduto(4L, "Pc", 15, 150);
        
        System.out.println(estoque.calcularValorTotalEstoque());

        System.out.println("Produto mais Caro = " +estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais Barato = " +estoque.obterProdutoMaisBarato());


    }

}
