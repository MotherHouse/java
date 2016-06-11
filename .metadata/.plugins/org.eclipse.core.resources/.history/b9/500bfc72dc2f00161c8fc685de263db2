import java.util.Date;
 class TVset {
	private static int number;
	private  int tvnumber ;
	private final String manufacturer;
	private final String brandname;
	private int size;
	private String switchstate="关闭";
	public TVset(int size){
		this.size=size;
		setNumber();
		tvnumber=number;
		System.out.print("由"+manufacturer+"制造的"＋brandname＋size＋"英寸电视已被制造");
		System.out.println("该电视的编号为"＋tvnumber);
	}
	private static void setNumber( ){    
		  String datenumber;
		  Date d=new Date( ); 
		  String day=Integer.toString(d.getDate( ));
		  //获取当前日期
		  String month=(d.getMonth()<9)?"0"+Integer.toString(d.getMonth()+1);
				  Integer.toString (d.getMonth( )+1); 
		  String year=Integer.toString(d.getYear ( )+1900);
		  datenumber=year+month+day; 
		  number= (number==0)?Integer.parseInt(datenumber+"01"):number+1; 
		    }
	       public void openTv( ){ 

	    	   switchstate="打开"; 
	    	   System.out.println("电视已被打开");
	    	   }  public void closeTv ( ){ 
	    		      switchstate="关闭";
	    		      System.out.println("电视已被关闭");
	    		      }  public void changeChannel (String s){ 
	    		 
	    		    	  System.out.println("电视已被切换到"+s+"频道");
	    		    	  }  public void heightenVolume ( ){ 
	    		    	
	    		    		  System.out.println("电视音量被提高"); 
	    		    		  }  public void lowerVolume ( ){ 
	    		   
	    		    			  System.out.println("电视音量被降低"); 
	    		    			  }  public int getSize ( ){   
	    		    	
	    		    				  return size; 
	    		    				  }  public String getSwitch ( ){  
	    		
	    		    					  return switchstate; 
	    		    					  }  public int getTvnumber ( ){
	    		    					 
	    		    						  return tvnumber;   }  }  class Test{         
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
			
	
	

}
