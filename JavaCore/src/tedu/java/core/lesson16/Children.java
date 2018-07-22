package tedu.java.core.lesson16;

public class Children extends Parent{

	public Children(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void showInfo() {
		System.out.println(this.getName()+" "+this.getAge());
	}

}
