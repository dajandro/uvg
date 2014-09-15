/**
* Universidad del Valle de Guatemala
* Pablo Diaz 13203
*/

package astargui;

import javax.swing.JFrame;

/**
 *
 * @author Pablo
 */
public class AStarGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         JFrame window = new JFrame();
          
          window.setSize(900, 900);
          window.setLocationRelativeTo(null);
          window.setVisible(true);
          
          window.add(new Visualization());
    }

}
