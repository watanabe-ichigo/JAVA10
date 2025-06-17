package shootinggame;

public class PlayerBullet3 extends Character {

	public PlayerBullet3(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillOval(x+10, y, 10, 30);
	}
    public void move() {
    //左斜め	
      x=x-3;	
	  x+=vx;
	  y+=vy;
    }

}
