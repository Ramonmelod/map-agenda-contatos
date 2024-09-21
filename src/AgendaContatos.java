
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();

    }

    public void AdicionarContato(String nome, Integer numero) {
        agendaContatosMap.put(nome, numero);
    }

    public void RemoverContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void ExibirContatos() {
        if (!agendaContatosMap.isEmpty()) {
            System.out.println(agendaContatosMap);
        }
    }

    public Integer PesquisarPorNome(String nome) {
        Integer numero = null;
        if (!agendaContatosMap.isEmpty()) {
            numero = agendaContatosMap.get(nome);
        }
        return numero;
    }

}
