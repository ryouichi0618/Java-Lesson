package exday2;

public class Ambulance extends Car {
	private int number = 119;
	public Ambulance() {
		System.out.println("Ambulanceオブジェクト生成");
	}
	public void sevePeople() {
		System.out.println("救命救急活動");
		System.out.println("呼び出しは" + number + "番");
	}
}
