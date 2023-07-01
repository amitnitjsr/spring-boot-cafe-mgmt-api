package com.cafe.Cafe.Management.System.JWT;

import com.cafe.Cafe.Management.System.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
@Slf4j
public class CustomerUserDetailsService implements UserDetailsService {


    @Autowired
    UserDao userDao;

    private com.cafe.Cafe.Management.System.POJO.User userDetails;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        userDetails = userDao.findByEmailId(username);
        if(!Objects.isNull(userDetails)){
            return new User(userDetails.getEmail(), userDetails.getPassword(), new ArrayList<>());
        }
        else {
            throw new UsernameNotFoundException("User not found");
        }
    }

    public com.cafe.Cafe.Management.System.POJO.User getUserDetails(){
//        com.cafe.Cafe.Management.System.POJO.User user = userDetails;
//        user.setPassword(null);
        return userDetails;
    }
}
