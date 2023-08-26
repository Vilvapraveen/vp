package morethen;

public class billReceipt {

	public static void main(String[] args){
			int apple = 45,
			banana    = 30,
			cake      = 50,
			dosa      = 75;

		int a,b,c,d,w,x,y,z;
		System.out.println("product 	Quantity	Unit Price	Total"
				+"\n-----------------------------------------------------"
				+ "\napple"	+"		"+(a=(2))+"		"+apple+"		"+(w=(a*apple))
				+ "\nbanana"+"		"+(b=(7))+"		"+banana+"	   	"+(x=(b*banana))
				+ "\ncake"+"		"+(c=(3))+"		"+cake+"		"+(y=(c*cake))
				+ "\ndosa"+"		"+(d=(2))+"		"+dosa+"		"+(z=(d*dosa))
				+"\n				subtotal"+"	"+						(w+x+y+z)
				+"\n\nthank for coming back!");
		
		
		
	}

}