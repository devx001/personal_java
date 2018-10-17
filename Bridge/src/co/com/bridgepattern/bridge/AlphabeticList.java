package co.com.bridgepattern.bridge;

public class AlphabeticList extends BaseList {
	
	public static final String LOWER_CASE  = "LOWER_CASE";
	public static final String UPPER_CASE  = "UPPER_CASE";
	
	private String[] lowerAlph = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","u","v","w","x","y","z"};
	private String[] upperAlph = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","U","V","W","X","Y","Z"}; 
	private String typeCase;
	
	public AlphabeticList(String typeCase) {
		this.typeCase = typeCase;
	}
	
	@Override
	public String getItem(Integer index) {
		if(LOWER_CASE.equals(typeCase)) {
			return lowerAlph[index]+". " + super.getItem(index);
		}
		return upperAlph[index]+". " + super.getItem(index);
	}

}
