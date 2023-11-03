package fiap.com.checkpointsecurity.repositories;

import fiap.com.checkpointsecurity.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Usuario,Integer> {
    Usuario findByUsername(String username);
}
