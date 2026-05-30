package com.vanshika.taskmanager;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@Valid @RequestBody Task task) {
        return taskService.createTask(task);
    }
    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @Valid @RequestBody Task task) {
    return taskService.updateTask(id, task);
    }

@DeleteMapping("/{id}")
     public void deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
    }
    @GetMapping("/{id}")
public Task getTaskById(@PathVariable Long id) {
    return taskService.getTaskById(id);
}
}
