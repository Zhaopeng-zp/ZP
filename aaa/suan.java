package aaa;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class suan {
	Scanner reader = new Scanner(System.in);
	public void r(){
	try{
			System.out.println("����������");
			int ti = reader.nextInt();
		}catch(Exception e){
				System.out.println("��������ȷ��ȡֵ��Χ");
				r();
			}
	}
	public void u(){
		try{
			System.out.println("�����������Χ��");
			int shu = reader.nextInt();
		}catch(Exception e){
			System.out.println("��������ȷ��ȡֵ��Χ");
			u();
			}
		//return shu ;
	}
	public void y(){
		System.out.println("�Ƿ�����˳���(��1����2)��");
		int fu = reader.nextInt();
	}
	public void j(){
		System.out.println("ǰ�������Ƿ������������1����2����");
		int fs = reader.nextInt();//�����Ƿ��������
		System.out.println("��������Ƿ������������1����2����");
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

