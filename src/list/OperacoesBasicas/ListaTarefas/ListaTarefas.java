package list.OperacoesBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t : listaTarefas) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
            listaTarefas.removeAll(tarefasRemover);
        }
    }
    public int obterTotalTarefas() {
        return listaTarefas.size();
    }
    public void obterDescricoesTarefas() {
        System.out.println(listaTarefas);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
