package com.t3h.service;

import javax.ejb.Local;

@Local
public interface UserServiceLocal {

	/* (non-Javadoc)
	 * @see com.t3h.service.UserServiceRemote#checkLogin(java.lang.String, java.lang.String)
	 */
	boolean checkLogin(String username, String password);

}