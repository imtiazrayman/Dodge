
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class shootingEnemy extends GameObject{
    private boolean shouldShoot;
    private Handler handler;
    public shootingEnemy(int x, int y, ID id, Handler handler, boolean shouldShoot){
        super(x,y,id);
        this.handler = handler;
        velX = 5;
        velY = 5;
        this.shouldShoot = shouldShoot;
    }
    public Rectangle getBounds(){
        return new Rectangle((int) x,(int) y, 16, 16);
    }
    public void tick(){
        x += velX;
        y += velY;
        if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
        
        handler.addObject(new Trail((int)x,(int) y, ID.Trail, Color.blue, 16, 16, 0.02f,handler));
        if(this.shouldShoot){
            this.shouldShoot = false;
            handler.addObject(new Trail((int)x + velX,(int) y + velY, ID.Trail, Color.PINK, 16, 16, 0.02f,handler));
        }
        else {
            this.shouldShoot = true;
        }
    }
    public void render(Graphics g){
        g.setColor(Color.PINK);
        g.fillRect((int)x,(int)y,16,16);
    }
}