package org.fzdu.design.patterns.create.abstract_factory;

public class SmsSenderFactory implements Provider {

	public Sender produce() {
		return new SmsSender();
	}

}
