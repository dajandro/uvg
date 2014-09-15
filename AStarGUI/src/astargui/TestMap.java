/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

package astargui;

/**
 *
 * @author Pablo
 */

import java.util.Random;

public class TestMap extends Map {
     private static final int OBSTACLE_CHANCE = 1;
     
     private final boolean[][] obstacle;
     
     public TestMap(int w, int h) {
          super(w, h);
          
          obstacle = new boolean[w][h];
          
          Random rnd = new Random();
          for (int i = 0; i < w; i++) {
               for (int j = 0; j < h; j++) {
                    obstacle[i][j] = (Math.abs(rnd.nextInt(100)) < OBSTACLE_CHANCE) ? true : false;
               }
          }
     }
     
     @Override
     public boolean isWalkable(int x, int y) {
          return !obstacle[x][y];
     }
}