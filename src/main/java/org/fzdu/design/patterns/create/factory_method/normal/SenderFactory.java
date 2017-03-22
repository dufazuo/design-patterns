package org.fzdu.design.patterns.create.factory_method.normal;

import org.fzdu.design.patterns.create.factory_method.MailSender;
import org.fzdu.design.patterns.create.factory_method.Sender;
import org.fzdu.design.patterns.create.factory_method.SmsSender;

public class SenderFactory {

	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
