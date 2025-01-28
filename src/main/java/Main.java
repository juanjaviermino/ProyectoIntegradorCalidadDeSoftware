/**
 * Punto de entrada para la aplicación de manejo de tareas.
 */
public final class Main {
  /** Límite de tareas para demostración. */
  private static final int LIMITE_TAREAS = 10;

  /** Constructor privado para evitar instanciación. */
  private Main() {
    throw new UnsupportedOperationException("Clase Main no debe instanciarse.");
  }

  /**
   * Método principal de la aplicación.
   *
   * @param args Argumentos de la línea de comandos.
   */
  public static void main(final String[] args) {
    TaskManager taskManager = new TaskManager();

    taskManager.addTask("Completar proyecto");
    taskManager.addTask("");
    taskManager.listTasks();
    taskManager.removeTask(1);
    taskManager.removeTask(LIMITE_TAREAS);
  }
}
