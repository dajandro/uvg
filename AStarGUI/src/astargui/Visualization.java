/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

package astargui;



/**
 *
 * @author Pablo
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visualization extends JPanel {
     private static final long serialVersionUID = 1L;
     
     private static final int WIDTH = 100;
     private static final int HEIGHT = 100;
     
     private static final int SCALE_X = 8;
     private static final int SCALE_Y = 8;
     
    
     
     private final Map map = new TestMap(WIDTH, HEIGHT);
     
     private final Deque<Integer> path;
     
     public Visualization() {
          AStar aStar = new AStar(map, 0, 0, map.width - 1, map.height - 1);
          path = aStar.findPath() ? aStar.getPath() : new LinkedList<Integer>();
          
          setSize(SCALE_X * WIDTH, SCALE_Y * HEIGHT);
          setVisible(true);
     }
     
     private void fillRect(Graphics graphics, int x, int y) {
          graphics.fillRect(SCALE_X * x, SCALE_Y * y, SCALE_X, SCALE_Y);
     }
     
     @Override
     public void paint(Graphics graphics) {
          graphics.setColor(Color.LIGHT_GRAY);
          graphics.fillRect(0, 0, SCALE_X * WIDTH, SCALE_Y * HEIGHT);
          
          paintObstacles(graphics);
          paintPath(graphics);
     }
     
     private void paintObstacles(Graphics graphics) {
          graphics.setColor(Color.DARK_GRAY);
          
          for (int x = 0; x < WIDTH; ++x) {
               for (int y = 0; y < HEIGHT; ++y) {
                    if (!map.isWalkable(x, y)) {
                         fillRect(graphics, x, y);
                    }
               }
          }
     }
     
     private void paintPath(Graphics graphics) {
          graphics.setColor(Color.GREEN);
          
          for (Iterator<Integer> i = path.iterator(); i.hasNext();) {
               int x = i.next(), y = i.next();
               fillRect(graphics, x, y);
          }
     }
}
