package projetoFacisaModulo2;
import java.util.Scanner;
import java.util.ArrayList;

public class projeto1Biblioteca {
    public static void main(String[] args) {
        ArrayList<String> listaAutores = new ArrayList<>();
        ArrayList<String> nomeLivros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int opcaoPrincipal;
        String nomeLivro;
        String autorLivro;
        System.out.println("Seja bem-vindo à biblioteca Lubrias!\n");


        while (true) {
            System.out.println("Digite o número que corresponde à opção que você deseja:\n" +
                    "1 - Adicionar novo Livro.\n" +
                    "2 - Pesquisar Livro por Título.\n" +
                    "3 - Excluir Livro pelo Título.\n" +
                    "4 - Listar todos os Livros.\n" +
                    "5 - Sair do sistema.\n");
            System.out.println("A minha opção é: ");
            opcaoPrincipal = scan.nextInt();
            scan.nextLine();

            if (opcaoPrincipal == 1) {
                System.out.println("Você entrou na Aba 'Adicionar novo Livro'!\n");
                System.out.println("Digite o nome do livro: ");
                nomeLivro = scan.nextLine();
                nomeLivros.add(nomeLivro);

                System.out.println("Quem escreveu esse livro?: ");
                autorLivro = scan.nextLine();
                listaAutores.add(autorLivro);

                System.out.println("Novo Livro cadastrado com sucesso");


            } else if (opcaoPrincipal == 2) {
                String nomeLivroPesquisa;
                System.out.println("Você entrou na Aba 'Pesquisar Livro por Título'!\n");
                System.out.println("Digite o nome do livro que você deseja encontrar: ");
                nomeLivroPesquisa = scan.nextLine();

                boolean encontrado = false;

                for (String titulo : nomeLivros) {
                    if (titulo.equalsIgnoreCase(nomeLivroPesquisa)) {
                        int index = nomeLivros.indexOf(titulo);
                        System.out.println("Livro encontrado!");
                        System.out.println("Título: " + titulo);
                        System.out.println("Autor: " + listaAutores.get(index));
                        encontrado = true;
                        break;
                    }

                }
                if (!encontrado) {
                    System.out.println("Livro não encontrado");
                }

            } else if (opcaoPrincipal == 3) {
                String scannerExclusao;

                System.out.println("Você entrou na Aba 'Excluir Livro por Título'!");

                System.out.println("Digite o título do Livro que você deseja excluir: ");
                scannerExclusao = scan.nextLine();
                nomeLivros.remove(scannerExclusao);

                int index = -1;
                for (int i = 0; i < nomeLivros.size(); i++) {
                    if (nomeLivros.get(i).equalsIgnoreCase(scannerExclusao)) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    nomeLivros.remove(index);
                    listaAutores.remove(index);
                    System.out.println("Livro removido com sucesso!");
                } else {
                    System.out.println("Livro não encontrado.");
                }

            } else if (opcaoPrincipal == 5) {
                int opcaoEntrarOuSair;

                System.out.println("Você entrou na Aba 'Sair do Sistema'!");
                System.out.println("Deseja mesmo sair do Sistema? (Digite 1 para sair, e 2 para continuar no sistema): ");
                opcaoEntrarOuSair = scan.nextInt();
                scan.nextLine();

                if (opcaoEntrarOuSair == 1) {
                    System.out.println("Tranquilo! Obrigado, volte sempre");
                } else if (opcaoEntrarOuSair == 2) {
                        System.out.println("Tranquilo! De volta ao sistema.");
                } else {
                    System.out.println("Dígito inválido, digite novamente");
                    }
                }
            }
        }
}
