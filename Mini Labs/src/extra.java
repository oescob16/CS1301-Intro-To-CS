import java.util.Scanner;

public class extra{
public static void main(String[]args){

int n = 2;
int c = 0;

for(int i = 0; i < n; i++){
	for(int j = 1; j < (i + 1); j++){
		c -= 2;
		}
		for(int j = n - i; j > 0; j--){
			c += 3;
		}
	}
	System.out.print("c = " + c);
}
}
			