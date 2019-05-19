public class BinaryInteger
{	String number;
	int count=0;
	int result;
	
	
	public BinaryInteger (String s)
	{
		this.number = s;
		//Throw runtime exception if characters in string are something other than 0 or 1
		int result = Integer.parseInt(s);	
		
		//this is the Binary integer version.. do i need?
		this.result = result;
	}
	
	@Override
	public String toString()
	{
		return this.number;
		
	}
	
	public int length()
	{
		for (int i=0; i<this.number.length(); i++)
		{
			count++;	
		}
		
		return count;
	}
	
	
	
	public int not()
	{
		String test = "";
		
		for (int i=0; i<this.number.length(); i++)
		{
			if( this.number.charAt(i) =='0')
			{
				test += '1';
			}
			else if (this.number.charAt(i) =='1')
			{
				test+='0';
			}
		}

		int newbin = Integer.parseInt(test);
		return newbin;
	}
	
	public void xor(BinaryInteger b)
	{
		//array for a and array for b
		
		int[] arrayA = new int[this.number.length()]; //8
		int[] arrayB = new int[this.number.length()]; //8
		
		int A = Integer.parseInt(this.number,2);
		int B = Integer.parseInt(b.toString(),2);
		
		//System.out.println(A^B);
		int i = A^B;
		System.out.println(Integer.toBinaryString( i));
	
	}
	
	public int leadingZeros()
	{
		//parse int will ignore leading zeros... so when I parse int it will only 00001111 
		//will only show 1111, so.. (00001111.length) -(parseint 00001111) = 4
		int longest = this.number.length();
		
		
		int result = Integer.parseInt(this.number); //1111
		String shortest = Integer.toString(result); // '1111'
		int shortnum = shortest.length();
		int leadingzero = longest-shortnum;
		
		return leadingzero;
		
	}
	
	public boolean isGreaterThan(BinaryInteger b)
	{
		int A = Integer.parseInt(this.number,2);
		//System.out.println(A);
		int B = Integer.parseInt(b.toString(),2);
		//System.out.println(B);
		
		if (A>B)
		{
			return true;
		}
		
		//Even if they are equal the answer is false
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args)  
	{
		BinaryInteger a = new BinaryInteger("00011001");
		BinaryInteger b = new BinaryInteger("01010000");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("a.length()= " + a.length());
        System.out.println("a.not()= " + a.not());
        a.xor(b);
        //System.out.println("a.xor(b)         = " + a.xor(b));
        System.out.println("a.leadingZeros() = " + a.leadingZeros());
        System.out.println("a.isGreaterThan(b) = " + a.isGreaterThan(b));


//		
	}
	
	
	
	
	
//	BinaryInteger(String s)                 // construct binary integer from string
//	String toString()                         // string representation
//	int length()                              // number of bits
//	BinaryInteger not()                       // bitwise not of this binary integer
//	BinaryInteger xor(BinaryInteger b)        // bitwise xor of two binary integers
//	int leadingZeros()                        // number of leading zeros
//	boolean isGreaterThan(BinaryInteger b)    // is this binary integer > b?
}