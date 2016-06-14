
public class ExtendsExaml {
	public static void main(String []args){
		subclass e = new  subclass ();
		e.x=1;
		e.z="winmine";
		e.setA();
		System.out.println("调用方法getX()的结果:" + e.getX());
		System.out.println("调用方法getZ()的结果:" + e.getZ());
		System.out.println("调用方法getA()的结果:" + e.getA());
	}

}
class superclass{
	public int x;
	private float y;
	String z;
	int getX()
	{
		return(x);
	}
	String getZ() {
		return (z);
		
	}
 }
class subclass extends superclass{
	private int a;
	void setA() {
		a=2;
	}
	int getA(){
		return (a);
	

		
	}
}
