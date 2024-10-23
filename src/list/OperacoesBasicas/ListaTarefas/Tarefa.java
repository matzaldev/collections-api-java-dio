package list.OperacoesBasicas.ListaTarefas;

public class Tarefa {

    public String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public String getDescricao() {
        return descricao;


    }
}
