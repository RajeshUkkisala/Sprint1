package com.OnlineShoppingDao;

import com.entities.Login;

public interface Logindao {
	Login getLoginById(int loginId);
    void updateLogin(int loginid,String email,String password);
    void insertLogin(Login loginobj);
}
