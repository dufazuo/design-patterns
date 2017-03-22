package org.fzdu.design.patterns.create.factory_method.normal;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("this is sms sender");
	}

}
