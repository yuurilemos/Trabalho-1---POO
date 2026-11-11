package modelo;
import java.util.ArrayList;
import java.util.List;

public class EstruturaList {
    public List<Produto> estoque = new ArrayList<>();

    public void adicionar(Produto p){
        estoque.add(p);
        System.out.println("Produto adicionado. ");
    }

    public void remover(int indice){
        if(indice >= 0 && indice < estoque.size()){
            estoque.remove(indice);
            System.out.println("Produto removido. ");
        }
        else{
            System.out.println("Produto invalido. ");
        }
    }
    public void listarProdutos(){
        System.out.println("Lista de Produtos: ");
        if(estoque.size() == 0){
            System.out.println("Nenhum produto cadastrado. ");
        }
        else{
            for(int i = 0; i < estoque.size(); i++){
                Produto p = estoque.get(i);
                 System.out.println((i + 1) + " - " + p.nome + " | Quantidade: " + p.quantidade + " | Preco: " + p.valor);
            }
        }
    }
    public void atualizar(int indice, String nome, int quantidade, float valor){
        if(indice >= 0 && indice < estoque.size()){
            Produto p = estoque.get(indice);
            p.nome = nome;
            p.quantidade = quantidade;
            p.valor = valor;
            System.out.println("Produto atualizado. ");
        }
        else{
            System.out.println("Indice invalido. ");
        }
    }
}
