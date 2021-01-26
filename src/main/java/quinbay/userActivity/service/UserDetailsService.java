package quinbay.userActivity.service;

import quinbay.userActivity.dataModels.UserActivity;

public interface UserDetailsService {
    UserActivity save(UserActivity userActivity);
    UserActivity findByUsername(String username);
    void deleteByUserName(String username);
}

