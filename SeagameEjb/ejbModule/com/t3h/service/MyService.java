package com.t3h.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class MyService
 */
@Stateless
@LocalBean
public class MyService implements MyServiceRemote, MyServiceLocal {

	/**
	 * Default constructor.
	 */
	public MyService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("*******************************DO SOME THING *****************************");
		
	}

}
