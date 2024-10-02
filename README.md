
# Tasky CLI - Task Tracker Command Line Interface

Tasky is a simple, command-line interface (CLI) application designed to help you manage your tasks. Using Tasky, you can add, update, and track tasks easily from the terminal. This project leverages Java, Maven, and JSON to store tasks locally in a file. 

## Features

- **Add Tasks:** Create tasks with a short description.
- **Update Tasks:** Modify existing tasks.
- **Delete Tasks:** Remove tasks that are no longer needed.
- **Mark Tasks:** Set tasks as `In Progress` or `Done`.
- **List Tasks:** View all tasks or filter by status (`todo`, `in-progress`, `done`).
- **Persistent Storage:** Tasks are stored in a JSON file so that they persist across sessions.

## Requirements

- **Java:** Ensure you have [Java 8+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed.
- **Maven:** Install [Apache Maven](https://maven.apache.org/install.html) to handle dependencies and build the project.

## Getting Started

### 1. Clone the repository

First, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/tasky-cli.git
cd tasky-cli
```

### 2. Build the project

Use Maven to build the project and resolve all dependencies:

```bash
mvn clean install
```

### 3. Running the application

After building the project, you can run the JAR file generated in the `target/` folder:

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar <command> [args...]
```

## Usage

Tasky supports several commands to manage tasks. Below are the available commands and their usage:

### Add a Task

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar add "Buy groceries"
# Output: Task added successfully (ID: 1)
```

### Update a Task

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar update 1 "Buy groceries and cook dinner"
# Output: Task updated successfully
```

### Delete a Task

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar delete 1
# Output: Task deleted successfully
```

### Mark Task as In Progress

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar mark-in-progress 1
# Output: Task marked as in-progress
```

### Mark Task as Done

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar mark-done 1
# Output: Task marked as done
```

### List All Tasks

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar list
# Output: 
# ID: 1 - Buy groceries [TODO]
# ID: 2 - Finish report [IN PROGRESS]
# ID: 3 - Workout [DONE]
```

### List Tasks by Status

#### List All Done Tasks:

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar list done
```

#### List All To-Do Tasks:

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar list todo
```

#### List All In-Progress Tasks:

```bash
java -jar target/tasky_cli-1.0-SNAPSHOT-jar-with-dependencies.jar list in-progress
```

## Task Properties

Each task in Tasky has the following properties:

- `id`: A unique identifier for the task.
- `description`: A short description of the task.
- `status`: The current status of the task (`todo`, `in-progress`, `done`).
- `createdAt`: The date and time when the task was created.
- `updatedAt`: The date and time when the task was last updated.

These properties are stored in the `tasks.json` file and are updated whenever a task is added, modified, or marked.

## Project Structure

```
tasky-cli/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/tasky_project/
│   │   │   │   ├── Tasky.java         # Main entry point
│   │   │   │   ├── TaskManager.java   # Logic for task management
│   │   │   │   ├── Task.java          # Task model
│   │   │   │   ├── JsonUtils.java     # JSON utility class
│   │   └── resources/
│   │       └── tasks.json             # JSON file to store tasks
│
├── pom.xml                            # Maven configuration
└── README.md                          # Project documentation
```

## Contributing

Feel free to contribute to this project by submitting a pull request. To contribute:

1. Fork the project.
2. Create a new branch for your feature (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -m 'Add a feature'`).
4. Push the branch to GitHub (`git push origin feature-branch`).
5. Open a pull request on GitHub.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy task tracking! 🎯
```
