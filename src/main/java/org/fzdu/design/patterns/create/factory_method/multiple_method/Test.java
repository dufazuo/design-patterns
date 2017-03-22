package org.fzdu.design.patterns.create.factory_method.multiple_method;

import org.fzdu.design.patterns.create.factory_method.Sender;

public class Test {

	public static void main(String[] args) {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produceSmsSender();
		sender.send();
	}

}
