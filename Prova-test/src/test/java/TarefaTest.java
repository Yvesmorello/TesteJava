import org.junit.jupiter.api.Test;

public class TarefaTest {


    @Test
    public void adcionarTarefa(){
        Tarefa tarefa = new Tarefa("Fazer compras", "arroz, feijao");
        String resultado = tarefa.adicionar(tarefa);
        tarefa.getLista();
    }
}
