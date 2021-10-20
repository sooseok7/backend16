package monthsago.travel16.Repository;

import monthsago.travel16.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}