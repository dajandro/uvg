package astargui;

/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
*/

/**
 *
 * @author Pablo
 */
public abstract class Map {
     final int width;
     final int height;
     
     public Map(int width, int height) {
          assert width > 0;
          assert height > 0;
          
          this.width = width;
          this.height = height;
     }
     
     public abstract boolean isWalkable(int x, int y);
}