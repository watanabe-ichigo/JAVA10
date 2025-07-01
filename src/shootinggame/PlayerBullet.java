package shootinggame;

public class PlayerBullet extends Character {

	public PlayerBullet(double x, double y, double vx, double vy) {
		//Characterクラスのコンストラクタ呼び出し(8章)
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillRect(x+10, y, 5, 5);
	}
    public void move() {
    //右斜め
      x=x+1;
	  x+=vx;
	  y+=vy;
    }

    }
