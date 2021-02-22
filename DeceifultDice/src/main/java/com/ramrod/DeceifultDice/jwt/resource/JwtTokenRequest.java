package com.ramrod.DeceifultDice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//        "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTYxMzI3Mzg0MiwiaWF0IjoxNjEyNjY5MDQyfQ.Es8NdTjMC5_Ri0IiQNS0cD9CdVCkwd1JdaQG4plJV34VZh_dVqW4RJOQ3UBKqwFAO4Mc7MA5yCQuyVxRMeQkSw"
//    }


    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

