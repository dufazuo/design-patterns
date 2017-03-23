package org.fzdu.design.patterns.create.abstract_factory;

public class SmsSender implements Sender {

	public void send() {
		System.out.println("this is sms sender");
	}

}
