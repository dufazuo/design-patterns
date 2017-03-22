package org.fzdu.design.patterns.create.factory_method.multiple_method;

import org.fzdu.design.patterns.create.factory_method.MailSender;
import org.fzdu.design.patterns.create.factory_method.SmsSender;

public class SenderFactory {

	public SmsSender produceSmsSender(){
		return new SmsSender();
	}
	
	public MailSender produceMailSender(){
		return new MailSender();
	}
}
