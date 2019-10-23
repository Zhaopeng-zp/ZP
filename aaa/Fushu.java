package aaa;

public class Fushu {
	public String Fushu(int fs, int shu){
	
	int a;//随机数
	String t = null;
	
	if(fs == 1){  //输入1，不生成负数
		a=(int) (Math.random()*shu); //生成随机数放到a,b
		t = a+"";
	}
	else if(fs == 2) { //输入2，生成负数
        a=(int)(Math.random()*shu*(Math.random()>0.5?1:-1));
         if(a<0){
        	 t = "(" + a + ")" ;
         }
         else{
        	 t = a+"";
         }
		}
	return t;
}
	
	public String Fushu2(int fs2, int shu){
		
		Shu sh = new Shu();
		
		int i, b;
		String r = null;
		
		if(fs2 == 1){  //输入1，不生成负数 
			b=(int)(Math.random()*shu);//生成随机数放到a,b
			r = b+"";
			if(b == 0)
				b = b+1;
		}
		else if(fs2 == 2) { //输入2，生成负数
	         b=(int)(Math.random()*shu*(Math.random()>0.5?1:-1));
	         if(b == 0)
	        	 b = b+1;
	         
	         if(b<0)  //给负数加括号
	             r = "(" + b + ")";
	           
	         else 
	        	 r = b+"";
		}return r;
		}
	}

