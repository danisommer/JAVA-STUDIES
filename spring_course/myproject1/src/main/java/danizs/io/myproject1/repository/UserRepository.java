package danizs.io.myproject1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import danizs.io.myproject1.entity.User;
 
public interface UserRepository extends JpaRepository<User,Long>{

}
