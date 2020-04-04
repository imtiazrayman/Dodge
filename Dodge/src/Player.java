
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
public class Player extends GameObject{
        Random r = new Random();
        Handler handler;
        
        
        public Player(int x,int y, ID id, Handler handler){
                super(x, y, id);
                this.handler = handler;
        }
        public Rectangle getBounds(){
                return new Rectangle((int) x,(int) y, 32, 32);
        }
        public void tick(){
                x += velX;
                y += velY;     
                x = Game.clamp(x, 0, Game.WIDTH -37);                          
                y = Game.clamp(y, 0, Game.HEIGHT - 60);
                
                
               // handler.addObject(new Trail( x, y, ID.Trail, Color.white, 32, 32, 0.05f,handler)); // this id adds a trail to the player 
                collision();
        }
        private void collision(){
                for(int i = 0; i < handler.object.size(); i++){
                GameObject tempObject = handler.object.get(i); 
                // these are the new objects that our player touches 
                if(tempObject.getId() == ID.BasicEnemy || tempObject.getId()==ID.FastEnemy||tempObject.getId()== ID.SmartEnemy
                		|| tempObject.getId() == ID.angleEnemy || tempObject.getId() == ID.shootingEnemy ){ // maybe later on we could have the different enemies be worth a different amount of hits
                   
                	if(getBounds().intersects(tempObject.getBounds())){
                      HUD.HEALTH -= 2; // the health bar is subtracted by 2 for all enemies, but we can make variable different damage points for hitting the enemy,
                      if(HUD.HEALTH == 0) { // this is if the player health drops to 0 // 
                    	  Game.state = gameState.LOSE;
                      }
                      }
                   }
                }
        }
        public void render(Graphics g){
        	
                g.setColor(Color.white); // so far our player is a white block but we can make a sprite for the player. 
                g.fillRect((int)x,(int)y,32,32);       
        }
}
