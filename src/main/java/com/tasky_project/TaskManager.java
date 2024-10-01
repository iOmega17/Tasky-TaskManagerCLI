package com.tasky_project;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Manages tasks including adding, updating, deleting, and listing tasks.
 */
public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();
    private static final String FILE_NAME = "tasks.json";

    /**
     * Adds a new task with the given description.
     *
     * @param description the description of the task
     */
    public void addTask(String description) {
        Task task = new Task(
                tasks.size() + 1,
                description,
                "To-Do",
                LocalDateTime.now(),
                LocalDateTime.now()
        );
        tasks.add(task);
        JsonUtils.saveTasks(tasks, FILE_NAME);
        System.out.println("Task added successfully");
    }

    /**
     * Updates the description of an existing task.
     *
     * @param id          the ID of the task to update
     * @param description the new description of the task
     */
    public void updateTask(int id, String description) {
        Task task = findTask(id);
        if (task != null) {
            task.setDescription(description);
            task.setUpdatedAt(LocalDateTime.now());
            JsonUtils.saveTasks(tasks, FILE_NAME);
            System.out.println("Task updated successfully");
        } else {
            System.out.println("Task not found");
        }
    }

    /**
     * Deletes a task by its ID.
     *
     * @param id the ID of the task to delete
     */
    public void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
        JsonUtils.saveTasks(tasks, FILE_NAME);
        System.out.println("Task deleted successfully");
    }

    /**
     * Marks the status of a task by its ID.
     *
     * @param id     the ID of the task to update
     * @param status the new status of the task
     */
    public void markStatus(int id, String status) {
        Task task = findTask(id);
        if (task != null) {
            task.setStatus(status);
            task.setUpdatedAt(LocalDateTime.now());
            JsonUtils.saveTasks(tasks, FILE_NAME);
            System.out.println("Task status updated successfully");
        } else {
            System.out.println("Task not found");
        }
    }

    /**
     * Lists all tasks.
     */
    public void listTasks() {
        tasks.forEach(System.out::println);
    }

    /**
     * Lists tasks by their status.
     *
     * @param status the status to filter tasks by
     */
    public void listTasksByStatus(String status) {
        tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .forEach(System.out::println);
    }

    /**
     * Finds a task by its ID.
     *
     * @param id the ID of the task to find
     * @return the task with the given ID, or null if not found
     */
    private Task findTask(int id) {
        return tasks.stream()
                .filter(task -> task.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
