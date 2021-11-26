
package repository.crud;

import java.util.Optional;
import model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author NerdKing
 */
public interface UserCrudRepository extends CrudRepository <User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String Password);
}
