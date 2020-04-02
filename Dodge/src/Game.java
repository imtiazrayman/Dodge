

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable { 
	
        private static final long serialVersionUID = 1550691097823471818L; // i am not too sure what this means
        
        public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9; // this allows us to maintain a specific game aspect ratio
        
        private Thread thread; // different threads to run different parts of the game, efficency
        
        private boolean running = false;  // this boolean gets set to true if its running
        
        private Random r; // random number 
        
        private Handler handler;
        
        private HUD hud; // instance of our heads up display which displays our health bar.
        
        private Spawn spawner; // creates an instance of our spawn class which spawns the different characters
        
        public static gameState state = gameState.MENU;
        
        public menu menu;
        
        public Game(){ // gui manager, game map, 
        	
                handler = new Handler();
                menu = new menu();
                this.addKeyListener(new KeyInput(handler)); // key input 
                 
                this.addMouseListener(new MouseInput()); // mouse input 
                
                new Window(WIDTH,HEIGHT,"DODGE", this);
                
                hud = new HUD(); 
                
                spawner = new Spawn(handler, hud); 
                
                r = new Random(); 
                //menu = new menu();
                handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler)); // this creates our main player  
                
                // WE ALSO CAN ADD A SECOND PLAYER INTO THE GAME HERE.
                handler.addObject(new Player(WIDTH/2-32 + 100, HEIGHT/2-32 + 100, ID.Player2, handler)); // this creates our main player  
                
                handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH), r.nextInt(Game.HEIGHT), ID.BasicEnemy, handler)); // THIS STARTS OUT WITH OUR BASIC ENEMY
                
                
        }
        
        public synchronized void start(){ // if we start the game we create a thread for the game
                thread = new Thread(this);
                thread.start(); // we then start the thread up.
                running = true; // our instance variable running gets set to true, which means that we just started the game. 
        }
        
        
        public synchronized void stop(){ // stopping the game 
                try{
                        thread.join(); 
                        running = false; // set running to false 
                }catch(Exception e){
                        e.printStackTrace();
                }  
        }
        public void run(){ // this is essentially the game loop. 
                this.requestFocus();
                long lastTime = System.nanoTime();
                double amountOfTicks = 60.0;
                double ns = 1000000000 / amountOfTicks;
                double delta = 0;
                long timer = System.currentTimeMillis();
                int frames = 0; 
                while(running){
                        long now = System.nanoTime();
                        delta += (now - lastTime) / ns;
                        lastTime = now;
                        while(delta >= 1){
                                tick();
                                delta--;
                        }
                        if(running)
                                render();
                        frames++;
                        if(System.currentTimeMillis() - timer > 1000){
                                timer += 1000;
                               //System.out.println("FPS: " + frames);
                                frames = 0;
                        }
                }
                stop();
                
        }
        
        private void tick()
        {
        	if(state == gameState.GAME) {
                handler.tick();
                hud.tick();
                spawner.tick();
        	}
        	
        }
        
        private void render(){
                BufferStrategy bs = this.getBufferStrategy();
                if(bs == null){
                        this.createBufferStrategy(3);
                        return;
                }      
                
                Graphics g = bs.getDrawGraphics();
                
               // g.drawImage( /Dodge/Dodge/src/backgroundstars.jpg  ,0, 0 , this );
                
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, WIDTH, HEIGHT);
                
                if(state == gameState.GAME) {
                	// change background would be here. for Menu screen. 
                	handler.render(g);
                	hud.render(g); // hud gets displayed here . I need to make 2 of the hud bars
                	
                }
                else if(state == gameState.MENU) {
                	menu.render(g);
                }
                
                g.dispose();
                bs.show();
                
        }
        
        public static gameState getgameState() {
        	return state;
        }
        
        
        
        public static float clamp(float var, float min, float max){
                if(var >= max)
                        return var = max;
                else if(var < min)
                        return var = min;
                else
                        return var;
                
        }
        public static void main(String args[]){  // start the game
                        new Game();
        }
}
