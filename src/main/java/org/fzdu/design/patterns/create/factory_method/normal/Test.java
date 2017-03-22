package org.fzdu.design.patterns.create.factory_method.normal;

public class Test {

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}

}
