
public class Extend {
	public static void main (String [] args){
		Son son =new Son();
		
	}

}
class Father{
	public Father (){
		System.out.println("创建父类");
		
	}
	/*public Father(String name)
	  {System.out.println("创建父类，名字为"+name）；
	  }*/
}class Son extends Father {
	public Son (){
		//super ("Tom")
		System.out.println("创建子类");
		
	}
}
	
	  
	  
	 
	 
}

