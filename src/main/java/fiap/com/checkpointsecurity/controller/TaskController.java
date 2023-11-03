package fiap.com.checkpointsecurity.controller;

import fiap.com.checkpointsecurity.entity.Task;
import fiap.com.checkpointsecurity.services.ManagerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ManagerTask managerTask;

    @PostMapping
    public void createTask(Task task){
        managerTask.createTask(task);
    }

    @GetMapping
    public Task findTask(int id){
        return managerTask.findTask(id);
    }

    @PutMapping
    public Task updateTask(Task task){
        return managerTask.updateTask(task);
    }

    @DeleteMapping
    public void deleteTask(int id){
        managerTask.deleteTask(id);
    }
}
