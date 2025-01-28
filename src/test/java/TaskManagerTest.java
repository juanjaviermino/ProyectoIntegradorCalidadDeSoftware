import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    private TaskManager taskManager;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        taskManager = new TaskManager();
        System.setOut(new PrintStream(outputStream)); // Redirigir la salida de consola para pruebas
    }

    @Test
    void testAddTask() {
        taskManager.addTask("Nueva tarea");
        assertTrue(outputStream.toString().contains("Tarea añadida: Nueva tarea"));
    }

    @Test
    void testAddInvalidTask() {
        taskManager.addTask("");
        taskManager.addTask("   ");
        taskManager.addTask(null);
        String output = outputStream.toString();
        assertTrue(output.contains("Tarea inválida"));
    }

    @Test
    void testListTasksEmpty() {
        taskManager.listTasks();
        assertTrue(outputStream.toString().contains("Sin tareas disponibles."));
    }

    @Test
    void testListTasks() {
        taskManager.addTask("Tarea 1");
        taskManager.addTask("Tarea 2");
        outputStream.reset(); // Limpiar el buffer antes de listar
        taskManager.listTasks();
        String output = outputStream.toString();
        assertTrue(output.contains("Tarea 1: Tarea 1"));
        assertTrue(output.contains("Tarea 2: Tarea 2"));
    }

    @Test
    void testRemoveTask() {
        taskManager.addTask("Tarea 1");
        taskManager.addTask("Tarea 2");
        outputStream.reset(); // Limpiar el buffer antes de remover
        taskManager.removeTask(1);
        assertTrue(outputStream.toString().contains("Tarea removida: Tarea 1"));
    }

    @Test
    void testRemoveInvalidTask() {
        taskManager.removeTask(0);
        taskManager.removeTask(5);
        String output = outputStream.toString();
        assertTrue(output.contains("ID inválido. Ingresa un id de tarea válido."));
    }
}
