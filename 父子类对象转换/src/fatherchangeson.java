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
		System.out.println("�������ÿ���ָ���������"+sp_ref.x);
		sb.x=10;
		System.out.println("�������ÿ���ָ���������"+sb_ref.x);
		System.out.println("�������ÿ���ת������������"+sb_ref.y);
		
	}

}
