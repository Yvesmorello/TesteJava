import org.junit.Test;
import static org.junit.Assert.*;

public class TarefaTest{

    @Test
    public void testAdicionarTarefa() {
        ToDoList lista = new ToDoList();
        Tarefa tarefa = new Tarefa("Comprar leite", "Ir ao mercado para comprar leite");
        lista.adicionarTarefa(tarefa);
        assertTrue(lista.contemTarefa(tarefa));
    }

    @Test
    public void testMarcarTarefaComoConcluida() {
        Tarefa tarefa = new Tarefa("Comprar leite", "Ir ao mercado para comprar leite");
        assertFalse(tarefa.estaConcluida());
        tarefa.marcarComoConcluida();
        assertTrue(tarefa.estaConcluida());
    }

    @Test
    public void testDesmarcarTarefaComoConcluida() {
        Tarefa tarefa = new Tarefa("Comprar leite", "Ir ao mercado para comprar leite");
        tarefa.marcarComoConcluida();
        assertTrue(tarefa.estaConcluida());

        tarefa.desmarcarComoConcluida();
        assertFalse(tarefa.estaConcluida());
    }

    @Test
    public void testEditarNomeTarefa() {
        Tarefa tarefa = new Tarefa("Comprar leite", "Ir ao mercado para comprar leite");
        assertEquals("Comprar leite", tarefa.getNome());

        tarefa.setNome("Comprar pão");
        assertEquals("Comprar pão", tarefa.getNome());
    }

    @Test
    public void testEditarDescricaoTarefa() {
        Tarefa tarefa = new Tarefa("Comprar leite", "Ir ao mercado para comprar leite");
        assertEquals("Ir ao mercado para comprar leite", tarefa.getDescricao());

        tarefa.setDescricao("Ir à padaria para comprar pão");
        assertEquals("Ir à padaria para comprar pão", tarefa.getDescricao());
    }

    @Test
    public void testExcluirTarefa() {
        ToDoList lista = new ToDoList();
        Tarefa tarefa1 = new Tarefa("Comprar leite", "Ir ao mercado para comprar leite");
        Tarefa tarefa2 = new Tarefa("Pagar contas", "Pagar as contas de luz e água");

        lista.adicionarTarefa(tarefa1);
        lista.adicionarTarefa(tarefa2);

        assertTrue(lista.contemTarefa(tarefa1));
        assertTrue(lista.contemTarefa(tarefa2));

        lista.excluirTarefa(tarefa1);

        assertFalse(lista.contemTarefa(tarefa1));
        assertTrue(lista.contemTarefa(tarefa2));
    }
}
