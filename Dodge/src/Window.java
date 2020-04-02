
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;
public class Window extends Canvas {
        private static final long serialVersionUID = -240840600533728354L;
        
        public Window(int width,int height, String title, Game game)
        {
        	
                JFrame frame = new JFrame(title);
                
                frame.setPreferredSize(new Dimension(width,height));
                
                frame.setMaximumSize(new Dimension(width,height));
                
                frame.setMinimumSize(new Dimension(width,height));  
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this code mean u activate the x button
                
                frame.setResizable(false); // this is to make the screen bigger or smaller
                
                frame.setLocationRelativeTo(null);
                
                frame.add(game);
                
                frame.setVisible(true);
                
                game.start();
        }
}