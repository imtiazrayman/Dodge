
import java.util.Random;
public class Spawn 
{
	
        private Handler handler;
        
        private HUD hud;
        
        private Random r = new Random();
        
        private int scoreKeep = 0;
        
        public Spawn(Handler handler, HUD hud)
        {
                this.handler = handler;
                this.hud = hud;
        }
        
        public void tick()
        {
	        scoreKeep++; 
	        
	        // DIFFIFuLTY SETTING 
	        // EASY
		    if(scoreKeep >= 500)
		    {
		        scoreKeep = 0;
		        hud.setLevel(hud.getLevel() + 1);
		        
		        if(hud.getLevel() == 2)
		        {
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 3){
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 4){
		        handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
		        }
		        else if(hud.getLevel() == 5)
		        {
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        }      
		    } 
		    
		    // Normal Mode     
		    /*
		    if(scoreKeep >= 500)
		    {
		        scoreKeep = 0;
		        hud.setLevel(hud.getLevel() + 1);
		        
		        if(hud.getLevel() == 2)
		        {
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 3){
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 4){
		        handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
		        }
		        else if(hud.getLevel() == 5)
		        {
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        }      
		    } 
		    */
		    
		    // HARD MODE
		    /*if(hard mode)
		    if(scoreKeep >= 500)
		    {
		        scoreKeep = 0;
		        hud.setLevel(hud.getLevel() + 1);
		        
		        if(hud.getLevel() == 2)
		        {
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 3){
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 4){
		        handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
		        }
		        else if(hud.getLevel() == 5)
		        {
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
		        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        }      
		    } */     
		    
        }      
}