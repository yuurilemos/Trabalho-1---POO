package app;
import java.util.Scanner;

import modelo.EstruturaList;
import modelo.Produto;

public class Main {
    public static void main(String[] args) {
        EstruturaList estoque_principal = new EstruturaList();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Bem vindo ao sistema de cadastro. Selecione uma das opções.");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("0 - Encerrar");
            System.out.println("Digite a opção: ");

            int opcao = sc.nextInt();
            if(opcao == 0){
                break;
            }
            switch (opcao) {
                case 1: 
                System.out.print("Digite o nome do produto: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.print("Digite a quantidade do produto: ");
                int quantidade = sc.nextInt();
                System.out.print("Digite o preço do produto");
                float valor = sc.nextFloat();
                Produto produto = new Produto(nome, quantidade, valor);
                estoque_principal.adicionar(produto);
                break;

                case 2: 
                estoque_principal.listarProdutos();
                break;
                
                case 3:
                estoque_principal.listarProdutos();
                System.out.print("Digite o numero do produto que deseja atualizar: ");
                int indiceAtualizar = sc.nextInt();
                System.out.print("Digite o novo nome do produto: ");
                sc.nextLine();
                String novoNome = sc.nextLine();
                System.out.print("Digite a nova quantidade do produto: ");
                int novaQuantidade = sc.nextInt();
                System.out.print("Digite o novo preco do produto: ");
                float novoValor = sc.nextFloat();
                if(novoNome.isEmpty() || novaQuantidade < 0 || novoValor <= 0){
                    System.out.println("Dados invalidos. ");
                }
                else{
                    estoque_principal.atualizar(indiceAtualizar - 1, novoNome, novaQuantidade, novoValor);
                }
                break;

                case 4:
                    estoque_principal.listarProdutos();
                    System.out.print("Digite o numero do produto que deseja remover: ");
                    int indiceRemover = sc.nextInt();
                    estoque_principal.remover(indiceRemover - 1);
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        }
        sc.close();
    }
}
