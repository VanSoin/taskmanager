package com.vanshika.taskmanager;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
    public Task updateTask(Long id, Task updatedTask) {
    Task existing = taskRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    existing.setTitle(updatedTask.getTitle());
    existing.setDescription(updatedTask.getDescription());
    existing.setCompleted(updatedTask.isCompleted());
    return taskRepository.save(existing);
    }

    public void deleteTask(Long id) {
    taskRepository.deleteById(id);
   }
}
