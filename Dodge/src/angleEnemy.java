
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class angleEnemy extends GameObject{
    private Handler handler;
    public angleEnemy(int x, int y, ID id, Handler handler){
        super(x,y,id);
        this.handler = handler;
        velX = 5;
        velY = 5;
    }
    public Rectangle getBounds(){
        return new Rectangle((int) x,(int) y, 16, 16);
    }
    public void tick(){
        x += velX;
        y += velY;
        if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
        if(x <= (Game.WIDTH - 16) / 2) {
            x += velX * .5;
        }
        else {
            x -= velX * .5;
        }
        if(y <= (Game.HEIGHT - 32) / 2) {
            y-= velY *.5;
        }
        else {
            y+= velY*.5;
        }
        handler.addObject(new Trail((int)x,(int) y, ID.Trail, Color.yellow, 16, 16, 0.02f,handler));
    }
    public void render(Graphics g){
        g.setColor(Color.yellow);
        g.fillRect((int)x,(int)y,16,16);
    }
}