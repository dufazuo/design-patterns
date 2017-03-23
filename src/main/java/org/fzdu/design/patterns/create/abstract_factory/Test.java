package org.fzdu.design.patterns.create.abstract_factory;

public class Test {

	public static void main(String[] args) {
		Provider provider = new MailSenderFactory();
		Sender sender = provider.produce();
		sender.send();
	}

}
