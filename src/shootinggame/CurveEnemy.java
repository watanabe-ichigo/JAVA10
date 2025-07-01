package shootinggame;

public class CurveEnemy extends Enemy{

	public CurveEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life=3+GameWorld.stage;
		// TODO 自動生成されたコンストラクター・スタブ
	}
public void move() {
	super.move();
	if (x<GameWorld.player.x) {
		//自分がプレイヤーより左にいたら
		x++;
		vx=+GameWorld.stage;
	}
	if (x>GameWorld.player.x) {
		//自分がプレイヤーより右にいた
		x--;//左に移動する
		vx=-GameWorld.stage;
		
	}
}
public void draw(MyFrame f) {
	f.setColor(0,0,0);
	f.fillOval(x, y, 30, 30);
	f.setColor(255,255,255);
	f.fillOval(x+5,y,20,30);
}
}
