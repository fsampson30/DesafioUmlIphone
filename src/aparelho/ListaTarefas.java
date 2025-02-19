package aparelho;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    List<String> listatTarefas = new ArrayList<>();

    public void removerItens(String descricao){
        listatTarefas.removeIf(tarefaAtual -> tarefaAtual.equalsIgnoreCase(descricao));
    }
}
