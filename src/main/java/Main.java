public class Main {
  public static void main(String[] args) {
    System.out.println("Task Manager System Started");

    TaskManager tm = new TaskManager();
    tm.addTask("Complete project");
    tm.listTasks();
    tm.removeTask(1);
  }
}