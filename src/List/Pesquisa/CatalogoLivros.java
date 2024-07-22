package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisar (int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;//É null, pois ainda não temos nenhum objeto do tipo livro a partir desse título.
        if (!livroList.isEmpty()) {//se a lista de livros não está vazia faz o for.
            for(Livro l : livroList){//Estou pegando o objeto l encontrado dentro do list
                if (l.getTitulo().equalsIgnoreCase(titulo)) {//se esse l for igual ao titulo faça:
                    livroPorTitulo = l;//estou atribuindo a referencia livrosPorTitulo.
                    break;//break para interromper o processo assim que encontrar o primeiro livro.
                }
            }
        }
        return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2001);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2000);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2002);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 4", 2003);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 5", 2004);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisar(2000, 2003));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
    }
}
