import java.text.SimpleDateFormat;
import java.util.Date;

public class Emprestimo {
    private Livro livro;
    private Membro membro;
    private Date dataEmprestimo;

    // Construtor do empréstimo
    public Emprestimo(Livro livro, Membro membro, Date dataEmprestimo) {
        // Verifica se algum dos parâmetros é nulo e lança uma exceção caso seja
        if (livro == null || membro == null || dataEmprestimo == null) {
            throw new IllegalArgumentException("Livro, Membro e Data de Empréstimo não podem ser nulos.");
        }
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    // Getter para o livro
    public Livro getLivro() {
        return livro;
    }

    // Getter para o membro
    public Membro getMembro() {
        return membro;
    }

    // Getter para a data do empréstimo
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        // Usa SimpleDateFormat para formatar a data de maneira legível
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Emprestimo{livro=%s, membro=%s, dataEmprestimo=%s}",
                livro, membro, formatter.format(dataEmprestimo));
    }
}
