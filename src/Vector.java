
public class Vector {
	public double x, y;
	
	
	
	public Vector(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Vector add(Vector v){
		return new Vector(x+v.x, y+v.y);
	}
	public Vector subtract(Vector v){
		return new Vector(x-v.x, y-v.y);
	}
	
	public Vector multiply(double s){
		return new Vector(x*s, y*s);
	}
	
	public Vector divide(double s){
		return multiply(1.0/s);
	}
	
	public double dot(Vector v){
		return x*v.x + y*v.y;
	}
	
	public double lengthSquare(){
		return 
	}s
	
	public Vector normalize(){
		
	}
}