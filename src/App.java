public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agendacontatos = new AgendaContatos();
        agendacontatos.AdicionarContato("Ramon", 741741741);
        agendacontatos.AdicionarContato("Luana", 1235487);
        agendacontatos.AdicionarContato("Kaleb", 987654321);
        agendacontatos.AdicionarContato("Dalila", 456456456);
        agendacontatos.AdicionarContato("Pai", 123123123);
        agendacontatos.AdicionarContato("Mae", 789789789);
        System.out.println("-------------------Exibir contatos--------------");
        agendacontatos.ExibirContatos();
        System.out.println("-------------------remover contatos--------------");
        agendacontatos.RemoverContato("Ramon");
        System.out.println("-------------------Exibir contatos--------------");
        agendacontatos.ExibirContatos();
        System.out.println("-------------------Procurar contato--------------");
        System.out.println(agendacontatos.PesquisarPorNome("Dalila"));

    }
}
