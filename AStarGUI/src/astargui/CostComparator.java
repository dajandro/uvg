/**
* Universidad Del Valle 
* Pablo Díaz 13203
*/

package astargui;

import java.util.Comparator;

/**
 *
 * @author Pablo
 */
public class CostComparator implements Comparator<Node> {
      
          public int compare(AStar.Node nodeA, AStar.Node nodeB) {
               return (nodeA.gcost + nodeA.hcost) - (nodeB.gcost + nodeB.hcost);
          }

    @Override
    public int compare(Node o1, Node o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
