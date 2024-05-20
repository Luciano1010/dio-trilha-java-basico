package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CarrinhoDeCompras {
    
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removeritem(String nome){
        List<Item> itensRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensRemover.add(i);
                }
            }
            itemList.removeAll(itensRemover);
        }
        else{
            System.out.println("Lista esta vazia!");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }
        else{
            throw new RuntimeException(" A lista esta vazia!");
        }
    }

    public void exibirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }
        else{
            System.out.println("Lista Vazia!");
        }
    }
    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + itemList +
          '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

       

        carrinhoDeCompras.adicionarItem("Caderno", +  10d ,  2);
        carrinhoDeCompras.adicionarItem("Lapis", +  3d ,  1);
        carrinhoDeCompras.adicionarItem("Borracha", +  4d ,  4);
        carrinhoDeCompras.adicionarItem("Lapis", +  3d ,  1);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removeritem("Lapis");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total das compras é =" + carrinhoDeCompras.calcularValorTotal());
    }
}
