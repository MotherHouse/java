import java.io.*;
public class StreamTest{
	public static void main (String []args)throws IOException
	{
		byte [] b = new byte[255];
		int i=0;
		System.out.println("开始输入");
		while(true){
			i=System.in.read(b);
			System.out.println("包含回车,换行总共输入了"+i+"个字符，具体字符为:");
			for(int j=0;j<i;j++){
				System.out.print((char)b[j]);
				
			}
			if((char)b[i-3]=='#'){break;}
			
		}
		System.out.println("输入完毕！");
	}

}
