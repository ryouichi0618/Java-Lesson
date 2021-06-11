package exday4;

public abstract class Weapon {
	
	private String name;
	//	武器の名前を設定
	public Weapon(String name) {
		this.name = name;
	}
	
	//	武器の名前を取得・
	public String getName() {
		return this.name;
	}
	
	public abstract void attack();
	
}
