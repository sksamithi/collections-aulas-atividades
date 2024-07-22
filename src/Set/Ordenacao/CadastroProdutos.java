package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, quantidade, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        
        cadastroProdutos.adicionarProduto("Smartphone", 1L, 1800d, 10);
        cadastroProdutos.adicionarProduto("Notebook", 2L, 3500d, 5);
        cadastroProdutos.adicionarProduto("Mouse", 3L, 80d, 20);
        cadastroProdutos.adicionarProduto("Teclado", 4L, 102d, 15);
    
        System.out.println(cadastroProdutos.produtoSet);
    
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    
        System.out.println(cadastroProdutos.exibirPorPreco());
      }
}
