package Game;
public class player1 {
	private String name;
	private String weapon;
	private int health;
	public player1(String name, String weapon, int health) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.health = health;
	}
	public void damageByGun1() {
		this.health-=30;
		if(this.health<=0) {
			this.health=0;
		}
		System.out.println("got hit by Gun1.healyh is reduced by 30 .new healh is " +this.health);
		if(this.health==0) {
			System.out.println( getName() + " is dead");
		}
	}
		public void damageByGun2() {
			this.health-=50;
			if(this.health<=0) {
				this.health=0;
			}
			System.out.println("got hit by Gun2.healyh is reduced by 50 .new healh is " +this.health);
			if(this.health==0) {
				System.out.println( getName() + " is dead");
			}
			
			
		
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

}
