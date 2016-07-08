package game;

public class GameGenerator {

	static int generateNumber(int length){
		String result = "";
		int random;
		while(true){
			random  = (int) ((Math.random() * (10 )));
			if(result.length() == 0 && random == 0){//when parsed this insures that the number doesn't start with 0
				random+=1;
				result+=random;
			}
			else if(!result.contains(Integer.toString(random))){//if my result doesn't contain the new generated digit then I add it to the result
				result+=Integer.toString(random);
			}
			if(result.length()>=length){//when i reach the number of digits desired i break out of the loop and return the final result
				break;
			}
		}

		return Integer.parseInt(result);
	}

	public String comparNumbers(int a, int b){

		String result = "";
		String as =  Integer.toString(a);
		String bs = Integer.toString(b);
		if(as.length() != bs.length()){
			System.out.println("Not the same length");
			return null;
		}
		for(int i = 0; i<as.length(); i++){
			for(int j = 0; j<bs.length(); j++){
				if(as.charAt(i) == bs.charAt(j) && i == j){
					result+="1";
				}
				else{
					if(as.charAt(i) == bs.charAt(j) && i != j){
						result+="0";
					}
					
					}
				}
			}
		return result;

		}
	
	
	}
