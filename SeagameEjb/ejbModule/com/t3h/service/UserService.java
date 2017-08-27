package com.t3h.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.t3h.util.AppUtils;

@Stateless
@LocalBean
public class UserService implements UserServiceRemote, UserServiceLocal {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.t3h.service.UserServiceRemote#checkLogin(java.lang.String,
	 * java.lang.String)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.t3h.service.UserServiceLocal#checkLogin(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean checkLogin(String username, String password) {
		return AppUtils.checkLogin(username, password);
	}
}
