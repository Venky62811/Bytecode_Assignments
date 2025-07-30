package LoopSatemnts;

public class PrintCharacters {

	public static void main(String[] args) {
		for(char c='A';c<='E';c++) 
			switch(c) {
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			case 'C':
				System.out.println("C");
				break;
			default:  
			System.out.println("D,E");
				
		}
			
	}

}
