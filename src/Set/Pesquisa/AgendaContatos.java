package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
    
        agendaContatos.exibirContato();
    
        agendaContatos.adicionarContato("Julia", 478889531);
        agendaContatos.adicionarContato("Julia Karnopp", 125352128);
        agendaContatos.adicionarContato("Julia", 1235464331);
        agendaContatos.adicionarContato("Thais", 418895431);
        agendaContatos.adicionarContato("Robson", 154413213);
        agendaContatos.adicionarContato("Emma", 15354351);
    
        agendaContatos.exibirContato();
    
        System.out.println(agendaContatos.pesquisarPorNome("Julia"));
    
        Contato contatoAtualizado = agendaContatos.atualizarContato("Thais", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);
    
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContato();
      }
}
