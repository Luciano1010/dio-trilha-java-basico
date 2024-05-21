package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    private List<Livro> livroList;

    public CatalagoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo.trim(), autor.trim(), anoPublicacao));
    }

    public void exibirLivros(){
        for(Livro livro : livroList){
            System.out.println(livro);
        }
    }

    public List<Livro> atualizarPorTitulo(String tituloAtual, String novoTitulo){
        List<Livro> livrosAtualizados = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if(livro.getTitulo().equalsIgnoreCase(tituloAtual)){
                    livro.setTitulo(novoTitulo);
                }
                livrosAtualizados.add(livro);
            }
        }
        return livrosAtualizados;
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor.trim())){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPoTitulo(String Livro){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(Livro)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivro catalagoLivro = new CatalagoLivro();

        catalagoLivro.adicionarLivro("Livro 1", "Autor 1", 2020);

        catalagoLivro.adicionarLivro("Livro 2", "Autor 2 ", 2021);

        catalagoLivro.adicionarLivro("Livro 2", "Autor 2 ", 2019);

        catalagoLivro.adicionarLivro("Livro 3", "Autor 3", 1994);

        System.out.println(catalagoLivro.pesquisarPorAutor("Autor 2"));
        
        catalagoLivro.atualizarPorTitulo("Biblia", "Livro 4");
        
        catalagoLivro.exibirLivros();
        
        System.out.println(catalagoLivro.pesquisarPorIntervaloDeAno(1990, 2000));
        
        System.out.println(catalagoLivro.pesquisarPoTitulo("livro 2"));


        

        
    }
}
