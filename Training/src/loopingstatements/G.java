package loopingstatements;				//System.exit

public class G {
	
	public static void main(String[] args){
		
		for(int i = 0; i < 10; i++){
			if(i == 3){
				System.exit(i);
			}
			System.out.println(i);
		}
	}
}	
