package paqueteEjemplo1;


/**
 * Esta clase hace sumas, restas...
 * @author ProfVespertino
 * 
 */
public class Calculadra {
	
	private int x, y;
	private String nombre= "Javier2";

	/**
	 * 
	 * @param x primer operador
	 * @param y segundo operador
	 */
	public Calculadra(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void suma() {
		System.out.println(this.getX()+this.getY()); 
	}
	
	public void resta() {
		System.out.println("hola");
		System.out.println(this.getX()-this.getY()); 
	}

}