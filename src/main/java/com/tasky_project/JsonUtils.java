package com.tasky_project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;




/**
 * Utility class for handling JSON operations related to tasks.
 */
public class JsonUtils {
    private static final Gson GSON = new Gson();

    /**
     * Reads tasks from a JSON file.
     *
     * @param fileName the name of the file to read from
     * @return a list of tasks
     */
    public static List<Task> readTasks(String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            return GSON.fromJson(reader, new TypeToken<List<Task>>(){}.getType());
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    /**
     * Saves tasks to a JSON file.
     *
     * @param tasks the list of tasks to save
     * @param fileName the name of the file to save to
     */
    public static void saveTasks(List<Task> tasks, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            GSON.toJson(tasks, writer);
        } catch (IOException e) {

            System.out.println("An error occurred while saving tasks.");
        }
    }
}
