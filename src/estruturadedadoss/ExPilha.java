package estruturadedadoss;

import java.util.Stack;
import java.util.Scanner;

public class ExPilha {
	

	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		
		int opcao; 
		
		do {
			System.out.println("                    MENU:                      ");
			System.out.println("_____________________________________________");
			System.out.println("1- Adicionar Um Livro na Pilha ");
			System.out.println("2- Listar Todos os Livros ");
			System.out.println("3- Retirar Livro da Pilha ");
			System.out.println("0- Finalizar ");
			System.out.println("_____________________________________________");
			System.out.println("\n Entre com a opção desejada: ");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			
			case 1: 
				System.out.println("Digite o nome de um livro: ");
				String NomeDoLivro = leia.nextLine();
                livros.push(NomeDoLivro);
                System.out.println("Livro adicionado com sucesso! ");
                break;
                
            case 2:
                System.out.println("Lista de Livros na fila:");
                if (livros.isEmpty()) {
                    System.out.println("A fila está vazia! \n");
                } else {
                    for (String livro : livros) {
                        System.out.println(livro);
                    }
                }
                break;
                
            case 3:
                if (livros.isEmpty()) {
                    System.out.println("A fila está vazia! \nNão é possível retirar um livro.");
                } else {
                    String livroRemovido = livros.pop();
                    System.out.println("Livro retirado: " + livroRemovido);
                }
                break;
                
            case 0:
                System.out.println("Menu finalizado.\n");
                break;
            	default:
                System.out.println("Opção indisponível! Por favor, digite uma opção válida.\n");
                break;
        		}
    			} while (opcao != 0);

    leia.close();
}
}