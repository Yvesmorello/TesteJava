import java.util.ArrayList;
import java.util.List;

public class Tarefa {

    List lista = new ArrayList();

    private String nome;
    private String descricao;

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String adicionar(Tarefa tarefa) {
        tarefa = (Tarefa) lista;
        return null;
    }

    public List getLista() {
        return lista;
    }


}
