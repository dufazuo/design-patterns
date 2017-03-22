package org.fzdu.design.patterns.create.factory_method.static_method;

import org.fzdu.design.patterns.create.factory_method.MailSender;
import org.fzdu.design.patterns.create.factory_method.SmsSender;

public class SenderFactory {

	public static SmsSender produceSmsSender(){
		return new SmsSender();
	}
	
	public static MailSender produceMailSender(){
		return new MailSender();
	}
}
