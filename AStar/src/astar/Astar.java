package astar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Astar {
	 
	private Grafo grafo;
	
	private Nodo start;
	private Nodo finish;
	
	public Astar() {
		this.grafo = new Grafo(4, 4);
		this.start = new Nodo(0, 0, grafo);
		this.finish = new Nodo(3, 3, grafo);
		
		
	}
	
	public void calculate() {
		ArrayList<Nodo> open = new ArrayList<>();
                ArrayList<Nodo> closed =new ArrayList<>();
                
		start.setFuncionG(0);
	
		open.add(start);
		
		Nodo current = null;
		
		while (!open.isEmpty()) {
			current = open.get(0);
			if (current.equals(finish)) {
				reconstructPath(current);
                                break;
			}
			open.remove(current);
			closed.add(current);
			for (Nodo n : current.getNodosAdyacente()) {
                        System.out.println(n.getX() + "-" +n.getY());
                        System.out.println(current.getX() +"," + current.getY());
				boolean neighborIsBetter;
				if (closed.contains(n))
					continue;
				if (!n.isIsObstaculo()) {
					double neighborDistanceFromStart = current.getFuncionG() + getDistanceBetween(current, n);
					if (!open.contains(n)) {
						open.add(n);
						Collections.sort(open);
						neighborIsBetter = true;
					}
					else if (neighborDistanceFromStart < current.getFuncionG())
						neighborIsBetter = true;
					else
						neighborIsBetter = false;
					if (neighborIsBetter) {
						n.setRaiz(current); 
						n.setFuncionG(neighborDistanceFromStart);
                                                n.setFuncionHeursitica(getEstimatedDistanceToGoal(n, finish));
						
					}
				}
				
			}
		}
		
			
	}
	
	public void reconstructPath(Nodo node) {
          
           List<String> path = new ArrayList<>();
        
		while (!(node.getRaiz() == null)) {
            path.add("("+node.getX() +"," + node.getY()+")");
			node = node.getRaiz();
		}
        path.add("("+node.getX() +"," + node.getY()+")");
        Collections.reverse(path);
        System.out.println("");
        System.out.println(path.toString() + " ->Camino más corto");
        

	}
	
	private double getDistanceBetween(Nodo n1, Nodo n2) {
		if ((n1.getX() == n2.getX() ) || (n1.getY() == n2.getY()))
			return 1;
		else
			return 1.9;
	}
	
	private double getEstimatedDistanceToGoal(Nodo start, Nodo finish) {
		
		//Closest heuristic
		//		double dx = finish.x - start.x;
		//		double dy = finish.y - start.y;
		//		return (dx + dx) * (dy + dy);
		
		//Diagonal heuristic
		double h_diagonal = Math.min(Math.abs(start.getX()- finish.getX()), Math.abs(start.getY() - finish.getY()));
		double h_straight = Math.abs(start.getX() - finish.getX()) + Math.abs(start.getY() - finish.getY());
		double h_result = Math.sqrt(2) * h_diagonal + (h_straight - 2 * h_diagonal);
		
		//breaking ties
		double p = 1 / 10000;
		h_result *= (1.0 + p);
		return h_result;
	}
	
}
