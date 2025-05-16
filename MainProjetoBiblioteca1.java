package projetoFacisaModulo2;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProjetoBiblioteca1 {
    private ArrayList<String> nomeLivros = new ArrayList<>();
    private ArrayList<String> listaAutores = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    public void adicionarLivro() {
        System.out.println("Você entrou na Aba 'Adicionar novo Livro'!\n");
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scan.nextLine();

        if (!nomeLivros.isEmpty())
            nomeLivros.add(nomeLivro);


        System.out.println("Quem escreveu esse livro?: ");
        String autorLivro = scan.nextLine();

        if (!autorLivro.isEmpty())
            listaAutores.add(autorLivro);

        System.out.println("Novo Livro cadastrado com sucesso");
    }

    public void pesquisarLivro() {
        System.out.println("Você entrou na Aba 'Pesquisar Livro por Título'!\n");
        System.out.println("Digite o nome do livro que você deseja encontrar: ");
        String nomeLivroPesquisa = scan.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nomeLivros.size(); i++) {
            if (nomeLivros.get(i).equalsIgnoreCase(nomeLivroPesquisa)) {
                System.out.println("Livro encontrado!");
                System.out.println("Título: " + nomeLivros.get(i));
                System.out.println("Autor: " + listaAutores.get(i));
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Livro não encontrado");
        }
    }

    public void excluirLivro() {
        System.out.println("Você entrou na Aba 'Excluir Livro por Título'!");
        System.out.println("Digite o título do Livro que você deseja excluir: ");
        String scannerExclusao = scan.nextLine();

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
    }

    public void listarLivros() {
        if (nomeLivros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Livros listados: ");
            for (int i = 0; i < nomeLivros.size(); i++) {
                System.out.println("Título: " + nomeLivros.get(i) + " | Autor: " + listaAutores.get(i));
            }
        }
    }
}
