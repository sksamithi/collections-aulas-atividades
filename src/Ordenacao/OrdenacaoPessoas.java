package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);//Estou pegando a lista de pessoas e estou colocando dentro de pessoasPorIdade, mas essa lista neste momento não está ordenada
        Collections.sort(pessoasPorIdade);//Sort entende q ele vai ter q ordenar pessoasPorIdade através do Comparable.
        return pessoasPorIdade;
    }

    public List<Pessoa>ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    public static void main(String[] args) {
          OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
 
          ordenacaoPessoas.adicionarPessoa("Thais", 28, 1.59);
          ordenacaoPessoas.adicionarPessoa("Robson", 59, 1.90);
          ordenacaoPessoas.adicionarPessoa("Debora", 52, 1.60);
          ordenacaoPessoas.adicionarPessoa("Emma", 6, 1.29);

          System.out.println(ordenacaoPessoas.pessoaList);

          System.out.println(ordenacaoPessoas.ordenarPorIdade());

          System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }
}
