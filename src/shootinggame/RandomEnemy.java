package shootinggame;

public class RandomEnemy extends Enemy {

	public RandomEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life=+GameWorld.stage;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void move() {
		super.move();
		vx=Math.random()*(GameWorld.stage+15)-(7+GameWorld.stage);
		
	}
	public void draw(MyFrame f) {
		f.setColor(0, 117, 107);
		f.fillRect(x-10,y+10,10,20);
		f.setColor(0, 117, 107);
		f.fillRect(x,y,10,10);
		f.setColor(0, 117, 107);
		f.fillRect(x+10,y+10,10,20);
	}

}
