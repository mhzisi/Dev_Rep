public class Services {
	public boolean premier(int x) {
		boolean ver = true;
		for(int i = 2; i<= x/2; i++) {
			
			if(x % i == 0) {
				ver = false;
				break;
				
			}
		}
		
		if(x == 1) 
			return false;
		else
			return ver;
	}
	
	public String display_premier_nbr(int x) {
		String ch = "";
		for(int i = 1; i<= x; i++) {
			if(this.premier(i) == true) {
				ch = ch + " " + Integer.toString(i);   	
			}
		}
		
		return ch;
	}
}
