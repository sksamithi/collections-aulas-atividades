package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem = item.getPreco()*item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public void exibirItens(){
        System.out.println(itemList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("ovo", 1, 12);
        carrinhoDeCompras.adicionarItem("ovo", 1, 15);
        carrinhoDeCompras.adicionarItem("leite", 7, 12);
        
        //carrinhoDeCompras.removerItem("ovo");

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é " + carrinhoDeCompras.calcularValorTotal());
        
    }
}
