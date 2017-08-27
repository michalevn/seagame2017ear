package com.t3h.service;

import javax.ejb.Remote;

@Remote
public interface UserServiceRemote {

	boolean checkLogin(String username, String password);

}