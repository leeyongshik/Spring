package sample04;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String phone;
	private Outputter outputter;

	public void setOutputter(Outputter outputter) {
		System.out.println("setOutputter(Outputter outputter)");
		this.outputter = outputter;
	}

	public void setPhone(String phone) {
		System.out.println("setPhone(String phone)");
		this.phone = phone;
	}

	public MessageBeanImpl(String name) {
		System.out.println("MessageBeanImpl(String name)");
		this.name = name;
	}

	@Override
	public void helloCall() {
		System.out.println("helloCall()");
		outputter.output(name + "\t" + phone);
		
	}

}
