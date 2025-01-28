import java.util.ArrayList;
import java.util.List;

/**
 * Administra una lista de tareas, permitiendo la adición, eliminación y
 * listado.
 */
public class TaskManager {
    /** Lista de tareas administradas. */
    private final List<String> tasks = new ArrayList<>();

    /**
     * Añade una nueva tarea a la lista.
     *
     * @param task La tarea a ser añadida.
     */
    public void addTask(final String task) {
        if (task == null || task.trim().isEmpty()) {
            System.out.println("Tarea inválida.");
            return;
        }
        tasks.add(task);
        System.out.println("Tarea añadida: " + task);
    }

    /**
     * Lista todas las tareas.
     */
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Sin tareas disponibles.");
            return;
        }

        int index = 1;
        for (String task : tasks) {
            System.out.println("Tarea " + index + ": " + task);
            index++;
        }
    }

    /**
     * Remueve una tarea en base a su índice.
     *
     * @param id El índice de la tarea (base 1).
     */
    public void removeTask(final int id) {
        if (id < 1 || id > tasks.size()) {
            System.out.println("ID inválido. Ingresa un id de tarea válido.");
            return;
        }
        String removedTask = tasks.remove(id - 1);
        System.out.println("Tarea removida: " + removedTask);
    }
}
