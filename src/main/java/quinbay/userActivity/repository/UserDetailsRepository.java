package quinbay.userActivity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import quinbay.userActivity.dataModels.UserActivity;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserActivity, Long> {
    public UserActivity findByUsername(String username);
    public void deleteByUsername(String username);
}
