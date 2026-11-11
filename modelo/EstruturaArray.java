package modelo;
public class EstruturaArray {
    // Tamanho maximo do estoque
    public Produto[] estoque = new Produto[500];
    // contador
    public int contador = 0;

    public void adicionar(Produto p){
        if(contador < estoque.length){
            estoque[contador] = p;
            contador++;
            System.out.println("Produto Adicionado. ");
        }
        else{
            System.out.println("Estoque cheio. ");
        }
    }
    public void remover(int indice){
        if(indice >= 0 && indice < contador){
            for(int i = indice; i < contador; i++){
                estoque[i] = estoque[i+1];
            }
            estoque[contador-1] = null;
            contador--;
            System.out.println("Produto removido. ");
        }
        else{
            System.out.println("Indice invalido. ");
        }
    }
}
