//package mypackage.tvset; 
//定义包
//mypackage.tvset;
import java.util.Date;
//引入java.util.Date类，用于获得当前日期 
public class TvSet{        private static int number; 
//电视机编号 
private int tvnumber; 
private final String manufacturer="职业学院设备厂";
//生产厂家 

 private final String brandname="学院牌";   
 //电视机品牌名
 private int size; 
 //电视机尺寸  
 private String switchstate="关闭"; 
 //电视开关状态 
 public TvSet (int size){ 
	 //构造函数 
	 this.size=size; 
	 setNumber ( ); 
	 tvnumber=number;
	 System.out.print("由"+manufacturer+"制造的"+brandname+size+"吋电视已被制造。"); 
	 System.out.println("该电视的编号为"+tvnumber);
	 }  private static void setNumber( ){ 
		 //设置电视机编号 
		 String datenumber;
		 Date d=new Date( );    
		 String day=Integer.toString(d.getDate( )); 
		 //获取当前日期 
		 String month=(d.getMonth()<9)?"0"+Integer.toString(d.getMonth()+1):Integer.toString (d.getMonth( )+1); 
		 String year=Integer.toString(d.getYear ( )+1900);
		 datenumber=year+month+day;
		 number= (number==0)?Integer.parseInt(datenumber+"01"):number+1;  
		 //生成电视机编号 
		 }  public void openTv( ){  
			 //打开电视 
			 switchstate="打开"; 
			 System.out.println("电视已被打开"); 
			 }  public void closeTv ( ){ 
				 //关闭电视 
				 switchstate="关闭"; 
				 System.out.println("电视已被关闭"); 
				 }  public void changeChannel (String s){ 
					 //更换频道 
					 System.out.println("电视已被切换到"+s+"频道");
					 }  public void heightenVolume ( ){ 
						 //增大音量 
						 System.out.println("电视音量被提高");
						 }  public void lowerVolume ( ){  
							 //降低音量 
							 System.out.println("电视音量被降低");
							 }  public int getSize ( ){ 
								 //获取电视机尺寸 
								 return size;
								 }  public String getSwitch ( ){  
									 //获取电视机开关状态 
									 return switchstate; 
									 }  public int getTvnumber ( ){   
										 //获取电视机编号  
										 return tvnumber; 
										 }  }  class Test{    
											 //运行测试 
											 public static void main(String [ ] args){  TvSet tv1=new TvSet (24); 
											 TvSet tv2=new TvSet (29);
											 TvSet tv3=new TvSet (34); 
 tv1.openTv ( );
 tv1.changeChannel ("CCTV5");
 tv1.heightenVolume ( );
 System.out.println ("tv1处于"+tv1.getSwitch ( )+"状态");
 System.out.println ("tv2处于"+tv2.getSwitch ( )+"状态");
 System.out.println ("tv2的大小为"+tv2.getSize ( )+"吋");
 System.out.println ("tv2的编号为"+tv2.getTvnumber ( )); 
 System.out.println ("tv3的编号为"+tv3.getTvnumber ( ));
 } }