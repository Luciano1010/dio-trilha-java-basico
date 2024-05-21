package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    
    private List<Pessoa> pessoaList;
    
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome.trim(), idade, altura));
    }

    public void exibirPessoas(){
        for (Pessoa pessoa : pessoaList) {
            System.out.println(pessoa);
        }
    }

    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        for(Pessoa p : pessoasPorIdade){
            System.out.println(p);
        }
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        for(Pessoa p : pessoasPorAltura){
            System.out.println(p);
        }
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Luciano 1", 30, 1.80d);
        ordenacaoPessoa.adicionarPessoa("Ivone 2", 24, 1.65d);
        ordenacaoPessoa.adicionarPessoa("Lucas 3", 17, 1.70d);
        ordenacaoPessoa.adicionarPessoa("Paulo 4", 44, 1.75d);
        ordenacaoPessoa.adicionarPessoa("Antonio 5", 10, 1.90d);

       
        System.out.println(ordenacaoPessoa.pessoaList);
       
      //  ordenacaoPessoa.ordenadoPorIdade();

      // ordenacaoPessoa.ordenarPorAltura();
    }



}
