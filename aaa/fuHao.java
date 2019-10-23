package aaa;
import java.util.Random;
import java.util.Scanner;

public class fuHao {
	
	public char getFu(int fu){
	
	char[] operator = new char[]{'+','-','*','/'};

		Random random=new Random();
		if(fu == 1){
		    return operator[random.nextInt(4)];
		}
		else{
			return operator[random.nextInt(2)];
		}
		
	}
	
	}
