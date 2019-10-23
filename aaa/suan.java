package aaa;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class suan {
	Scanner reader = new Scanner(System.in);
	public void r(){
	try{
			System.out.println("输入题数：");
			int ti = reader.nextInt();
		}catch(Exception e){
				System.out.println("请输入正确的取值范围");
				r();
			}
	}
	public void u(){
		try{
			System.out.println("输入操作数范围：");
			int shu = reader.nextInt();
		}catch(Exception e){
			System.out.println("请输入正确的取值范围");
			u();
			}
		//return shu ;
	}
	public void y(){
		System.out.println("是否包含乘除法(是1，否2)：");
		int fu = reader.nextInt();
	}
	public void j(){
		System.out.println("前操作数是否包含负数（否1，是2）：");
		int fs = reader.nextInt();//决定是否包含负数
		System.out.println("后操作数是否包含负数（否1，是2）：");
		int fs2 = reader.nextInt();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
	
		PrintStream pp=new PrintStream("D:\\gg\\result.txt"); 
		
		
		
		
		fuHao fuhao = new fuHao();
		Fushu fushu = new Fushu();
		
		int s = 0;
		for(int i = 0; i < s ; i++){
			int shu = 0;
			int fs = 0;
			String a = fushu.Fushu(fs, shu);
			int fu = 0;
			char b = fuhao.getFu(fu);
			int fs2 = 0;
			String c = fushu.Fushu2(fs2, shu);
			System.setOut(pp);
			System.out.println(a+""+b+""+c+"=");
		}
		}
	}	

