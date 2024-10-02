package com.tasky_project;

/**
 * Main class for Tasky CLI application.
 */
public class Tasky {

    /**
     * Main method to process command line arguments.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        if (args.length < 1) {
            System.out.println("No arguments provided");
            return;
        }

        String command = args[0];
        switch (command) {
            case "add":
                if (args.length < 2) {
                    System.out.println("Description not provided");
                    return;
                }
                taskManager.addTask(args[1]);
                break;

            case "update":
                if (args.length < 3) {
                    System.out.println("Id and description not provided");
                    return;
                }
                taskManager.updateTask(Integer.parseInt(args[1]), args[2]);
                break;

            case "delete":
                if (args.length < 2) {
                    System.out.println("Id not provided");
                    return;
                }
                taskManager.deleteTask(Integer.parseInt(args[1]));
                break;

            case "mark":
                if (args.length < 3) {
                    System.out.println("Id and status not provided");
                    return;
                }
                taskManager.markStatus(Integer.parseInt(args[1]), args[2]);
                break;

            case "list":
                switch (args.length) {
                    case 1:
                        taskManager.listTasks();
                        break;
                    case 2:
                        taskManager.listTasksByStatus(args[1]);
                        break;
                    default:
                        System.out.println("Invalid command");
                        break;
                }
                break;

            default:
                System.out.println("Invalid command");
        }
    }
}
