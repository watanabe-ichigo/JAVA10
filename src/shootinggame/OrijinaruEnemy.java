package shootinggame;

public class OrijinaruEnemy extends Enemy{

	public OrijinaruEnemy(double x, double y, double vx, double vy) {
		super(x, y, vx, vy);
		life=1+GameWorld.stage;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	public void move() {
		super.move();
		
		if(x<=100) {
			
				 vx++;
			
		   
			
		}else {
				vx--;
			
			
		}
		
			
		
	}
	public void draw(MyFrame f) {
		f.setColor(0, 0, 0);
		f.fillRect(x, y, 5, 5);
		f.setColor(0,0,0);
		f.fillRect(x+25, y, 5, 5);
		f.setColor(0, 0, 0);
		f.fillRect(x,y+25,5,5);
		f.setColor(0, 0, 0);
		f.fillRect(x+25,y+25,5,5);
		f.setColor(0, 0, 0);
		f.fillOval(x+5, y+5, 20, 20);
		
	}

}
