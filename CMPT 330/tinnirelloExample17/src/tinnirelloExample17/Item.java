package tinnirelloExample17;

public class Item 
{
	private String my1;
	private String my2;
	private String my3;
	
	
	public Item() {
		my1 = "one";
		my2 = "two";
		my3 = "three";
	}
	public Item(String my1, String my2, String my3) {
		super();
		this.my1 = my1;
		this.my2 = my2;
		this.my3 = my3;
	}
	public String getMy1() {
		return my1;
	}
	public void setMy1(String my1) {
		this.my1 = my1;
	}
	public String getMy2() {
		return my2;
	}
	public void setMy2(String my2) {
		this.my2 = my2;
	}
	public String getMy3() {
		return my3;
	}
	public void setMy3(String my3) {
		this.my3 = my3;
	}
	@Override
	public String toString() {
		return "Item [my1=" + my1 + ", my2=" + my2 + ", my3=" + my3 + "]";
	}
	
}
