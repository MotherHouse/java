class fatherclass {
		int x;
}
		class sonclass extends fatherclass {
			int y;
			char ch;
			
			
		}

public class fatherchangeson {
	public static void main(String [] args ){
		fatherclass sp, sp_ref;
		sonclass sb,sb_ref;
		
		sp=new fatherclass();
		sb=new sonclass();
		sb.x=1; 
		sb.y=2;
		sp_ref=sb;
		sb_ref=(sonclass)sp_ref;
		System.out.println("父类引用可以指向子类对象"+sp_ref.x);
		sb.x=10;
		System.out.println("父类引用可以指向子类对象"+sb_ref.x);
		System.out.println("父类引用可以转化成子类引用"+sb_ref.y);
		
	}

}
