package estruturadedadoss;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExFila {

	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		
		int opcao; 
		
		do {
			System.out.println("                    MENU:                      ");
			System.out.println("_____________________________________________");
			System.out.println("1- Adicionar Um Novo CLiente na Fila ");
			System.out.println("2- Listar Todos os Clientes na Fila ");
			System.out.println("3- Retirar Cliente da Fila ");
			System.out.println("0- Finalizar ");
			System.out.println("_____________________________________________");
			System.out.println("\n Digite uma das opções: ");
			
			opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			
				case 1: 
					System.out.println("Digite o nome do cliente: ");
					String NomeDoCliente = leia.nextLine();
                    clientes.add(NomeDoCliente);
                    System.out.println("Cliente adicionado com sucesso! ");
                    break;
                    
                case 2:
                    System.out.println("Lista de Clientes na fila:");
                    if (clientes.isEmpty()) {
                        System.out.println("A fila está vazia! \n");
                    } else {
                        for (String cliente : clientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                    
                case 3:
                    if (clientes.isEmpty()) {
                        System.out.println("A fila está vazia! \nNão é possível retirar um cliente.");
                    } else {
                        String clienteRemovido = clientes.poll();
                        System.out.println("Cliente retirado: " + clienteRemovido);
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