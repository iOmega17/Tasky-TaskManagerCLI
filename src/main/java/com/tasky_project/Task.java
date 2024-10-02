package com.tasky_project;

import java.time.LocalDateTime;

/**
 * Represents a task with an ID, description, status, creation time, and update time.
 */
public class Task {
    private final int id;
    private String description;
    private String status;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Constructs a new Task.
     *
     * @param id          the ID of the task
     * @param description the description of the task
     * @param status      the status of the task
     * @param createdAt   the creation time of the task
     * @param updatedAt   the last update time of the task
     */
    public Task(int id, String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Gets the ID of the task.
     *
     * @return the ID of the task
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the status of the task.
     *
     * @return the status of the task
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the description of the task.
     *
     * @param description the new description of the task
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the status of the task.
     *
     * @param status the new status of the task
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Sets the last update time of the task.
     *
     * @param updatedAt the new update time of the task
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Returns a string representation of the task.
     *
     * @return a string representation of the task
     */
    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}