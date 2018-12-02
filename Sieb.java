
public class Sieb {

	public static void main(String[] args) {
		int inputFromUser = Integer.parseInt(args[0]);
		int n = 30; //OUR LIMIT
		
		boolean[] prime = buildSiebArray(n); 
          
        // Print all prime numbers from 2 to limit
        
        	while(true) {
        		int counter = 0;
                for(int i = 2; i <= n; i++) 
                { 
                	
                    if(prime[i] == true) {
                        System.out.println(i); 
                    	counter++;
                    	
                    	
                    	
                    	if(counter == inputFromUser) {
                    		break;
                    	}
                    	
                    }
                    
                   
                    
                } 
                if (counter < inputFromUser) {
                	System.out.println("Grenze soll erhoeht werden!");
                	n = n+10;
                	System.out.println("neue Grenze: " + n);
                	counter =0;
                	prime = buildSiebArray(n);
                }
                else {
                	break;
                }
        	}
            
        
        
        
         

	}

	//CREATE ARRAY WITH ALL PRIME NUMBERS WITH LIMIT N
	private static boolean[] buildSiebArray(int n) {
		boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        }
		return prime;
	}
	
	

}
