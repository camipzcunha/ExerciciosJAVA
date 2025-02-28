import java.io.*;
import java.util.*;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        // Cria uma instância do sistema da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criação de alguns livros e membros
        Livro livro1 = new Livro("Livro A", "Autor A", "12345");
        Livro livro2 = new Livro("Livro B", "Autor B", "67890");

        Membro membro1 = new Membro("Membro A", 1, "emailA@fiap.com.br");
        Membro membro2 = new Membro("Membro B", 2, "emailB@fiap.com.br");

        // Adiciona livros e membros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.registrarMembro(membro1);
        biblioteca.registrarMembro(membro2);

        // Registra o empréstimo de um livro
        biblioteca.registrarEmprestimo(livro1, membro1);

        try {
            // Salva os dados da biblioteca no arquivo
            biblioteca.salvarDadosEmArquivo("biblioteca.txt");
            // Carrega os dados da biblioteca a partir do arquivo
            biblioteca.carregarDadosDeArquivo("biblioteca.txt");
        } catch (IOException e) {
            // Caso ocorra erro no processo de I/O, imprime o erro
            System.err.println("Erro ao salvar ou carregar dados: " + e.getMessage());
            e.printStackTrace();
        }

        // Devolve o livro e remove um livro da biblioteca
        biblioteca.devolverLivro(new Emprestimo(livro1, membro1, new Date()));
        biblioteca.removerLivro(livro2);
    }
}
