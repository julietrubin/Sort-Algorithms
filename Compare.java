
public class Compare {
	public enum type {
		LESSTHAN, GREATERTHAN
	}

	Compare.type sign;


	public Compare(Compare.type sign){
		this.sign = sign;
	}

	public boolean compareto(int a, int b){

		switch(sign){
		case LESSTHAN:
			return a<b;
		case GREATERTHAN:
			return	a>b;
		default:
			return true;
		}
	}


}
