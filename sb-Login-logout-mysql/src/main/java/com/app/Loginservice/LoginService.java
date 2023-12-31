package com.app.Loginservice;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Logindomain.Login;
import com.app.LoginRepository.LoginRepository;



@Service
public class LoginService {
    
    @Autowired
    private LoginRepository repo;
  
  public Login login(String username, String password) {
      Login user = repo.findByUsernameAndPassword(username, password);
      return user;
  }
    

}
