package com.t3h.service;

import javax.ejb.Remote;

@Remote
public interface MyServiceRemote {

	public void doSomething();

}
