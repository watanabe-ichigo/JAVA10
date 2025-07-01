package shootinggame;

public class PlayerBullet2 extends Character {

	public PlayerBullet2(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillOval(x+10, y, 5, 5);
	}
    public void move() {
    if(x<=0) {
    	vx++;
    }else if(x>=400){
    	vx--;
    }
	  x+=vx;
	  y+=vy;
    }

}
