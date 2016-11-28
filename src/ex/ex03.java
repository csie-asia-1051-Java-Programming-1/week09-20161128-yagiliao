package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean val=false;
		for(int i=2;i<n;i++){
			int sum=n%i;
			if(sum==0){
				System.out.print(i+" ");
				val=true;
			}
		}
		System.out.println();
		if(val==false){
			System.out.print("是質數");
		}else
			if(val==true){
				System.out.print("不是質數");
			}
	}

}
