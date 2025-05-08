package code;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora1FacisaJava {
    public static void main(String[] args) {
        ArrayList<String> listaFilmes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int opcaoScannerPrincipal;


        while(true) {
            System.out.println("Bem vindo à locadora Lubrias. Veja as opções:");
            System.out.println("1 - Adicionar um novo filme na sua lista.\n" +
                    "2 - Remover um filme da sua lista.\n" +
                    "3 - Buscar um filme pelo nome\n" +
                    "4 - Exibir a lista completa.\n" +
                    "5 - Esvaziar a sua lista.\n" +
                    "6 - Sair.");
            System.out.println("------------------------\n");
            System.out.println("Digite uma opção para continuar: ");
            opcaoScannerPrincipal = scan.nextInt();
            scan.nextLine();


            if (opcaoScannerPrincipal == 1) {
                String opcaoUm;
                System.out.println("\n---------------");
                System.out.println("Você entrou na aba Adicionar novo filme.");
                System.out.println("Digite o nome do filme que você deseja adicionar: ");
                opcaoUm = scan.nextLine();

                listaFilmes.add(opcaoUm);

                System.out.println("Filme adicionado. Digite 4 para exibir a lista completa com seu novo filme adicionado.");
            } else if(opcaoScannerPrincipal == 2) {
                String opcaoRemover;
                System.out.println("------------------");
                System.out.println("Você entrou na aba Remover um filme.");
                System.out.println("Digite o nome do filme que você deseja remover: ");
                opcaoRemover = scan2.nextLine();

                if(listaFilmes.removeIf(filme -> filme.equalsIgnoreCase(opcaoRemover))) {
                    System.out.println("Filme " + "''"+ opcaoRemover+ "''" + " Removido da lista.");
                    listaFilmes.remove(opcaoRemover);
                } else {
                    System.out.println("Não há filme com esse nome.");
                }

            } else if(opcaoScannerPrincipal == 3) {
                String nomeBusca;
                System.out.println("-------------------");
                System.out.println("Você entrou na aba Buscar um filme pelo nome.");
                System.out.println("Digite o nome do filme que você deseja encontrar: ");
                nomeBusca = scan2.nextLine();
                boolean encontrado = false;

                for(String filme: listaFilmes) {
                    if (filme.equalsIgnoreCase(nomeBusca)) {
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    System.out.println("Filme encontrado na lista!");
                } else {
                    System.out.println("Não há filme com esse nome na lista.");
                }
            } else if(opcaoScannerPrincipal == 4) {
                int tamanho;
                tamanho = listaFilmes.size();

                System.out.println("Você entrou na aba Exibir a lista completa.");
                System.out.println("Lista: ");

                if (tamanho > 0) {
                    for ( String tamanhoLista:listaFilmes) {
                        System.out.println(tamanhoLista);
                    }
                } else {
                    System.out.println("\nA lista está vazia\n");
                }
            } else if(opcaoScannerPrincipal == 5) {
                Scanner leitorOpcao5 = new Scanner(System.in);
                String leitorFeito;

                System.out.println("Você entrou na aba Esvaziar a Lista.");
                System.out.println("Tem certeza que deseja mesmo esvaziar toda a sua lista? Todos os itens serão excluídos.");
                System.out.println("Digite s(Sim)/ Ou n(Não): ");
                leitorFeito = leitorOpcao5.nextLine();

                if(leitorFeito.equalsIgnoreCase("s")) {
                    System.out.println("Tranquilo. Sua lista foi esvaziada. Valeu!");
                    listaFilmes.clear();

                } else if(leitorFeito.equalsIgnoreCase("n")) {
                    System.out.println("Beleza. Sua lista não vai ser esvaziada. Por pouco, hein!");

                } else {
                    System.out.println("Acho que você escreveu errado! ;/. É só 's' ou 'n', amigão!");
                }

            } else if(opcaoScannerPrincipal == 6) {
                System.out.println("Obrigado, mano. Volte sempre! TMJ");
                break;

            } else if(opcaoScannerPrincipal != 6) {
                System.out.println("Opção inválida.");
            }
        }
    }
}
