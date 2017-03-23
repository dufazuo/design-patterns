package org.fzdu.design.patterns.create.abstract_factory;

public class MailSenderFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
