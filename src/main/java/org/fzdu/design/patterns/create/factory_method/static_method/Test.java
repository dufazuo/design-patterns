package org.fzdu.design.patterns.create.factory_method.static_method;

import org.fzdu.design.patterns.create.factory_method.Sender;

public class Test {

	public static void main(String[] args) {
		Sender sender = SenderFactory.produceSmsSender();
		sender.send();
	}

}
