package tedu.java.core.lesson15;

public class Student {
	private int maSv;
	private String name;
	private String address;
	private float diemTb;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getDiemTb() {
		return diemTb;
	}
	public void setDiemTb(float diemTb) {
		this.diemTb = diemTb;
	}
	public Student() {
		
	}
	public Student(int maSv, String name, String address, float diemTb) {
		super();
		this.maSv = maSv;
		this.name = name;
		this.address = address;
		this.diemTb = diemTb;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaSv(int maSv) {
		this.maSv = maSv;
	}
	public int getMaSv() {
		return this.maSv;
	}
	
}
