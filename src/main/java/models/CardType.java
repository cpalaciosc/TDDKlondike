package models;

public enum CardType {
	SPADE(0),
	HEART(1),
	CLUB(2),
	DIAMONDS(3);
	
	private int integerType;
	
	private CardType(int integerType){
		this.integerType=integerType;
	}

	public int getIntegerType() {
		return integerType;
	}
}
