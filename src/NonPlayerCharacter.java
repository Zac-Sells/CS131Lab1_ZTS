import java.security.SecureRandom;
import java.util.*;
public class NonPlayerCharacter extends GameCharacter{
	

	/**
	 * This is our NonPlayer Character that inherits
	 * from GameCharacter it represent objects the game controls 
	 * (as opposed to objects a human player controls).
	 * @author 
	 * @version 1.3
	 * Lab1
	 * CS131ON
	 */
private boolean active;
private String intelligenceType;


public NonPlayerCharacter() {
	super();
	this.setActive (false);
	this.setIntelligenceType ("AVERAGE"); 
}
		
public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
	super(id, personality);
	this.setActive (active);
	this.setIntelligenceType (intelligenceType);
}

public String reportStructure() {
	StringBuilder NP = new StringBuilder();
	NP.append("Active: "+isActive()+"\n");
	NP.append("intelligenceType: "+getIntelligenceType()+"\n");
	NP.append("==================================\n");
	
	return super.reportStructure()+ NP.toString();
}

public String introduce() {
	return "Hello, my name is "+super.uniqueID +"\n"; 
}

public String exclaim(){
	String[] arr={"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
	Random r=new Random();        
	int ex=r.nextInt(arr.length);
	return (arr[ex]);
}

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}

public String getIntelligenceType() {
	return intelligenceType;
}

public void setIntelligenceType(String intelligenceType) {
	this.intelligenceType = intelligenceType;
}


}//end class

