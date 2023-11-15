import java.util.ArrayList;
import java.util.List;

public class ToDoList {

    private List<Tarefa> tarefas;

    public ToDoList() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public boolean contemTarefa(Tarefa tarefa) {
        return this.tarefas.contains(tarefa);
    }

    public void excluirTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }
}