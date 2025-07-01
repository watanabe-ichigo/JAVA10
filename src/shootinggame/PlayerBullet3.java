package shootinggame;

public class PlayerBullet3 extends Character {

	public PlayerBullet3(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillRect(x+10, y, 5, 5);
	}
    public void move() {
    //左斜め	
     
	
	  x+=vx;
	  y+=vy;
    }

}
