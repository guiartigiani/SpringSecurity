package fiap.com.checkpointsecurity.repositories;

import fiap.com.checkpointsecurity.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {

}
