import java.io.*;
public class StreamTest{
	public static void main (String []args)throws IOException
	{
		byte [] b = new byte[255];
		int i=0;
		System.out.println("��ʼ����");
		while(true){
			i=System.in.read(b);
			System.out.println("�����س�,�����ܹ�������"+i+"���ַ��������ַ�Ϊ:");
			for(int j=0;j<i;j++){
				System.out.print((char)b[j]);
				
			}
			if((char)b[i-3]=='#'){break;}
			
		}
		System.out.println("������ϣ�");
	}

}
