package quinbay.userActivity.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quinbay.userActivity.dataModels.UserActivity;
import quinbay.userActivity.repository.UserDetailsRepository;
import quinbay.userActivity.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public UserActivity save(UserActivity userActivity) {
        return userDetailsRepository.save(userActivity);
    }

    @Override
    public UserActivity findByUsername(String username) {
        return userDetailsRepository.findByUsername(username);
    }

    @Override
    public void deleteByUserName(String username) {
        userDetailsRepository.deleteByUsername(username);
    }
}
