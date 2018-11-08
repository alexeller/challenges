package bike;

public class Test 
{ 
	public static void main(String args[]) 
	{ 
		int i = 3;

        for(int j = 0; j < i; i++){
		    MountainBike mb = new MountainBike(i, 100, j); 
		    System.out.println(mb.toString());
		}	
	} 
} 

