package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    
    private String nomeProduto;
    private double precoProduto;
    private long codigoProduto;
    private int quantidade;
    
    public Produto(String nomeProduto, double precoProduto, long codigoProduto, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.codigoProduto = codigoProduto;
        this.quantidade = quantidade;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPrecoProduto() {
        return precoProduto;
    }
    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
    public long getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        return  "Produto = "+ nomeProduto + "," + " Preço= " + precoProduto + " Código do produto=  "+ codigoProduto +" QTD=  "+ quantidade;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigoProduto ^ (codigoProduto >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigoProduto != other.codigoProduto)
            return false;
        return true;
    }
    @Override
    public int compareTo(Produto p) {
        return nomeProduto.compareToIgnoreCase(p.getNomeProduto());
    }   
    
}
class ComparetorPorPreco implements Comparator<Produto>{
    @Override
public int compare(Produto p1, Produto p2) {
    return Double.compare(p1.getPrecoProduto(), p2.getPrecoProduto());
}
}

