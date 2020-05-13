
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
	        
	       
	        if(Game.difficulty == gameDifficultyId.NORMAL) {
			    if(scoreKeep >= 500)
			    {
			        scoreKeep = 0;
			        hud.setLevel(hud.getLevel() + 1);
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
			
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
			        if(hud.getLevel() == 6) {
			        	Game.state = gameState.WIN;
			        	//if(Game.running == false) {
			        		
			        	//}
			        }

			    } 
	        }

		    // Hard Mode     

	        if(Game.difficulty == gameDifficultyId.HARD) {
		    if(scoreKeep >= 500)
		    {
		        scoreKeep = 0;
		        hud.setLevel(hud.getLevel() + 1);
	        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
	        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
	        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
	        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        
		        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        
		        if(hud.getLevel() == 2)
		        {
		        	handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        	handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        	handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 3){
		        	handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));

		        	handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
		        }
		        else if(hud.getLevel() == 4){

		        	handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
		        	handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
		        	handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));

		        }
		        else if(hud.getLevel() == 5)
		        {
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        }
		        
		      /*if(hud.getLevel() == 10) {
		        	Game.running = false;
		        	if(Game.running == false) {
		        		
		        	}
		        }*/// this something that stops the game. It will stop the game on 10 now we gotta make it resume the game. 
		        
		        if(hud.getLevel() == 6) {
		        	Game.state = gameState.WIN;
		        	//if(Game.running == false) {
		        		
		        	//}
		        }
		        
		        
		        
		        
		        
		    }
	        }

		           
		    
	        	    

		 
	        // YOU WILL NOT SURVIVE LOL
		     if(Game.difficulty == gameDifficultyId.INSANE) {
			    if(scoreKeep >= 500)
			    {
			        scoreKeep = 0;
			        hud.setLevel(hud.getLevel() + 1);
			        
			        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
			        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
			        
			        if(hud.getLevel() == 2)
			        {
				        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
				        handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));
			        }
			        else if(hud.getLevel() == 3){
			        	 handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
					     handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
					     handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
		                 handler.addObject(new shootingEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.shootingEnemy, handler , true)); // THIS STARTS OUT WITH OUR BASIC ENEMY
		                 handler.addObject(new angleEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.angleEnemy, handler)); // THIS STARTS OUT WITH OUR BASIC ENEMY
		                 handler.addObject(new shootingEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.shootingEnemy, handler , true)); // THIS STARTS OUT WITH OUR BASIC ENEMY
			        }
			        else if(hud.getLevel() == 4){
				        handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
				        handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			        	handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			        	handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler));
			        }
			        else if(hud.getLevel() == 5)
			        {
				        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
				        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
				        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
				        handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler));
			        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 150), r.nextInt(Game.HEIGHT - 150), ID.SmartEnemy, handler));
			        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
			        	handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 250), r.nextInt(Game.HEIGHT - 250), ID.SmartEnemy, handler));
			        } 
			        if(hud.getLevel() == 6) {
			        	Game.state = gameState.WIN;
			        	//if(Game.running == false) {
			        		
			        	//}
			        }

			        
			        
			        
			        
			    } 
		     }
        }      
}