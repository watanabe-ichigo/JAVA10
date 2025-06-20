package shootinggame;

import java.util.Vector;

public class GameFrame extends MyFrame {
	public void run() {
		GameWorld.player= new Player(100,300,0,0);
		addKeyListener(GameWorld.player);//イベントリスナー登録(9章)
		GameWorld.playerBullets=new Vector<PlayerBullet>();
		GameWorld.playerBullets2=new Vector<PlayerBullet2>();
		GameWorld.playerBullets3=new Vector<PlayerBullet3>();
		while(true) {
			clear();
			GameWorld.player.draw(this);
			GameWorld.player.move();
			int i=0;
			while(i<GameWorld.playerBullets.size()) {
				PlayerBullet b=GameWorld.playerBullets.get(i);
				b.draw(this);
				b.move();
				if (b.y<0) {
					GameWorld.playerBullets.remove(i);
				} else {
					i++;
				}
				
			}
			
			i=0;
			while(i<GameWorld.playerBullets2.size()) {
				PlayerBullet2 b=GameWorld.playerBullets2.get(i);
				b.draw(this);
				b.move();
				if (b.y<0) {
					GameWorld.playerBullets2.remove(i);
				} else {
					i++;
				}
				
			}
			
			i=0;
			while(i<GameWorld.playerBullets3.size()) {
				PlayerBullet3 b=GameWorld.playerBullets3.get(i);
				b.draw(this);
				b.move();
				if (b.y<0) {
					GameWorld.playerBullets3.remove(i);
				} else {
					i++;
				}
				
			}
			sleep(0.03);
		}
	}
	public void movePlayerBullets() {
		int i =0;
		while(i<GameWorld.playerBullets.size()) {
			PlayerBullet b=GameWorld.playerBullets.get(i);
			b.draw(this);
			b.move();
			if(b.y<0) {
				GameWorld.playerBullets.remove(i);
			}else {
				i++;
			}
			
		}
     }
	
}
