package fiap.com.checkpointsecurity.services;

import fiap.com.checkpointsecurity.entity.Task;
import fiap.com.checkpointsecurity.repositories.TaskRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ManagerTask {

    @Autowired
    private TaskRepository taskRepository;

    public void createTask(Task task){
        taskRepository.save(task);
    }

    public Task findTask(int id){
        return taskRepository.findById(id).orElseThrow(()->new
                EntityNotFoundException("Task não encontrada"));
    }

    public Task updateTask(Task task){
        Task tk = this.findTask(task.getId());
        tk.setTitle(task.getTitle());
        tk.setDescription(task.getDescription());
        tk.setStatus(tk.getStatus());
        tk.setDueDate(task.getDueDate());
        return taskRepository.save(tk);
    }

    public void deleteTask(int id){
        Task tk = this.findTask(id);
        taskRepository.delete(tk);
    }
}
