package projetoFacisaModulo2;

import java.util.Scanner;

public class MenuProjeto1Biblioteca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MainProjetoBiblioteca1 biblioteca = new MainProjetoBiblioteca1();


        int opcaoPrincipal;

        while (true) {
            System.out.println("\nDigite o número que corresponde à opção que você deseja:\n" +
                    "1 - Adicionar novo Livro.\n" +
                    "2 - Pesquisar Livro por Título.\n" +
                    "3 - Excluir Livro pelo Título.\n" +
                    "4 - Listar todos os Livros.\n" +
                    "5 - Sair do sistema.\n");
            System.out.print("A minha opção é: ");
            opcaoPrincipal = scan.nextInt();
            scan.nextLine();

            switch (opcaoPrincipal) {
                case 1 -> biblioteca.adicionarLivro();
                case 2 -> biblioteca.pesquisarLivro();
                case 3 -> biblioteca.excluirLivro();
                case 4 -> biblioteca.listarLivros();
                case 5 -> {
                System.out.println("Saido do sistema... Obrigado por utilizar!");
                return;
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }



    }
}
