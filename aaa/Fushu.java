package aaa;

public class Fushu {
	public String Fushu(int fs, int shu){
	
	int a;//�����
	String t = null;
	
	if(fs == 1){  //����1�������ɸ���
		a=(int) (Math.random()*shu); //����������ŵ�a,b
		t = a+"";
	}
	else if(fs == 2) { //����2�����ɸ���
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
		
		if(fs2 == 1){  //����1�������ɸ��� 
			b=(int)(Math.random()*shu);//����������ŵ�a,b
			r = b+"";
			if(b == 0)
				b = b+1;
		}
		else if(fs2 == 2) { //����2�����ɸ���
	         b=(int)(Math.random()*shu*(Math.random()>0.5?1:-1));
	         if(b == 0)
	        	 b = b+1;
	         
	         if(b<0)  //������������
	             r = "(" + b + ")";
	           
	         else 
	        	 r = b+"";
		}return r;
		}
	}

