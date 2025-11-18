package numberBaseConversion;

public class MyNumber {
	private String bitString; //renamed to bitString for HW2
	private int base;
	private boolean isValid;
	private int value; //new variable, stores decimal value of the number
	
	public MyNumber(String bitString, int base) {
		if (bitString == null) {
			this.bitString = null;
		}
		else {
			this.bitString = bitString.trim(); //avoids spaces being seen as invalid chars
		}
		this.base = base;
		
		this.isValid = validate();
		if (isValid == true) {
			//original toDecimal code (moved here)
			//converting to base10
			//first convert each character to an int
			int decimal = 0;
		    for (int i=0; i<this.bitString.length(); i++) {
		    	//goes through each digit (num) and converts to an int which is then
		    	//added to the decimal times the base till it has gone through all of bitString
		    	//to convert the bitString to the base10 value
		    	int num = Character.getNumericValue(this.bitString.charAt(i));
		    	decimal = (decimal*base)+num;
		    }
		    //finding the sum of all the values
			this.value = decimal;
		}
		else {
			this.value = -1;
		}
	}
	
	public boolean isValid(){
		return isValid;
	}
	
	private boolean validate() {
		if (this.bitString == null || this.bitString.isEmpty() || base<2) {
			return false;
		}
		for (int i=0; i<this.bitString.length(); i++) {
			char c = this.bitString.charAt(i);
			int charInt = Character.getNumericValue(c);
			if (charInt<0 || charInt>=base) {
				return false;
			}
		}
		return true;
	}
	
	public String convertToBase(int newBase) {
		//converting to different base from base10
		
		//checking validity
		if (newBase<2 || isValid==false) {
			return "ERROR";
		}		
		
		int decimal = toDecimal();
		String strResult = "";
		
		if (decimal == 0) {
			return "0";
		}
		
		if (newBase == 10) {
			strResult = Integer.toString(decimal);
		}
		
		if (newBase >= 2) {
			while(decimal > 0) {
				char result;
				int rem = decimal%newBase; //finding remainder (long division method of converting bases)
				if (rem<10) { 
					result = (char) ('0'+rem); //specifically for numbers (converting decimal to char)
				}
				else {
					result = (char) ('A'+ (rem-10)); //for letters, converting decimal to char
				}
				strResult = result + strResult; //adding result to back of the string
				decimal /= newBase;
			}
		}
		return strResult;
	}
	
	public int getBase() {
		if (isValid == false) {
			return -1;
		}
		else {
			return base;
		}
	}
		
	public int toDecimal() {
		if (isValid == false) {
			return -1;
		}
		return value;
	}
	
	
	//HW 2 updates:
	
	public int value() {
		if (isValid == false) {
			return -1;
		}
		return value;
	}
	
	public String getValue() {
		if (isValid == false) {
			return "ERROR";
		}
		return bitString;
	}	
	
	public static MyNumber add(MyNumber num1, MyNumber num2, int targetBase) {
		//ex: 83 + 3108 = 3919 in decimal = BOC in base 17
		
		//validity check:
		if (num1 == null || num2 == null || targetBase<2 || num1.isValid == false || num2.isValid == false) {
			return new MyNumber("ERROR", 1);
		}

		int sum = num1.value() + num2.value();
		
		//converting to base:
		char result = 0;
		String strResult = "";
		
		if (sum == 0) {
			strResult = "0";
		}
		else if (targetBase == 10) {
			strResult = Integer.toString(sum);
		}
		else if (targetBase >= 2) {
			while(sum > 0) {
				int rem = sum%targetBase; //finding remainder (long division method of converting bases)
				if (rem<10) { 
					result = (char) ('0'+rem); //specifically for numbers (converting decimal to char)
				}
				else {
					result = (char) ('A'+ (rem-10)); //for letters, converting decimal to char
				}
				strResult = result + strResult; //adding result to back of the string
				sum /= targetBase;
			}
		}
		return new MyNumber(strResult, targetBase);

	}
	
	//bonus challenge:
	public static MyNumber multiply(MyNumber num1, MyNumber num2, int targetBase) {
		//validity check:
		if (num1 == null || num2 == null || targetBase<2 || num1.isValid == false || num2.isValid == false) {
			return new MyNumber("ERROR", 1);
		}

		int sum = num1.value() * num2.value();
		
		//converting to base:
		char result = 0;
		String strResult = "";
		
		if (sum == 0) {
			strResult = "0";
		}
		else if (targetBase == 10) {
			strResult = Integer.toString(sum);
		}
		else if (targetBase >= 2) {
			while(sum > 0) {
				int rem = sum%targetBase; //finding remainder (long division method of converting bases)
				if (rem<10) { 
					result = (char) ('0'+rem); //specifically for numbers (converting decimal to char)
				}
				else {
					result = (char) ('A'+ (rem-10)); //for letters, converting decimal to char
				}
				strResult = result + strResult; //adding result to back of the string
				sum /= targetBase;
			}
		}
		return new MyNumber(strResult, targetBase);
	}
	
}
	
	
	
	////old code that resulted in errors (i restarted a bunch of the code):
	////ignore this:

//	public MyNumber(String bitString, int base) {
//	    this.value = (bitString == null) ? null : bitString.trim();
//	    this.base = base;
//
//	    if (this.value == null || this.value.isEmpty() || this.base < 2) {
//	        this.isValid = false;
//	        this.intValue = -1;
//	        return;
//	    }
//
//	    for (int i = 0; i < this.value.length(); i++) {
//	        int digit = Character.getNumericValue(this.value.charAt(i));
//	        if (digit < 0 || digit >= this.base) {
//	            this.isValid = false;
//	            this.intValue = -1;
//	            return;
//	        }
//	    }
//
//	    this.isValid = true;
//	    int result = 0;
//	    for (int i = 0; i < this.value.length(); i++) {
//	        int digit = Character.getNumericValue(this.value.charAt(i));
//	        result = result * this.base + digit;
//	    }
//	    this.intValue = result;
//	}
//
//	
////	public MyNumber(String bitString, int base) {
////		this.value = bitString;
////		this.base = base;
////		this.isValid = true;
////		this.intValue = toDecimal();
////	}	
//	
//	public boolean isValid(){
//		if (value == null || value.isEmpty()) {
//			isValid = false;
//		}
//		if (base < 2) {
//			isValid = false;
//		}
//		for (int i=0; i<value.length(); i++) {
//			char c = value.charAt(i);
//			int charInt = Character.getNumericValue(c);
//			if (charInt<0 || charInt>23) {
//				isValid = false;
//				break;
//			}
//			if (base == 8 && (c == '8' || c == '9')) {
//				isValid = false;
//			}
//			if (base == 2 && c!='0' && c!='1') {
//				isValid = false;
//			}
//			if (base == 10 && c>='A') {
//				isValid  = false;
//			}
//		}
//		return isValid;
//	}
//	
//	public String convertToBase(int newBase) {
//		//converting to different base from base10
//		int decimal = toDecimal();
//		char result = 0;
//		String strResult = "";
//		
//		if (newBase<2 || isValid==false) {
//			return "ERROR";
//		}		
//		
//		if (decimal == 0) {
//			return "0";
//		}
//		
//		if (newBase == 10) {
//			strResult = Integer.toString(decimal);
//		}
//		
//		if (newBase >= 2) {
//			//works for base 2, 8, 16
//			while(decimal > 0) {
//				int rem = decimal%newBase; //finding remainder (long division method of converting bases)
//				if (rem<10) { 
//					result = (char) ('0'+rem); //specifically for numbers (converting decimal to char)
//				}
//				else {
//					result = (char) ('A'+ (rem-10)); //for letters, converting decimal to char
//				}
//				strResult = result + strResult; //adding result to back of the string
//				decimal /= newBase;
//			}
//		}
//		return strResult;
//	}
//	
//	public int getBase() {
//		if (isValid == false) {
//			return -1;
//		}
//		else {
//			return base;
//		}
//	}
//	
//	public String getValue() {
//		if (isValid == false) {
//			return "ERROR";
//		}
//		else {
//			return value;
//		}
//	}
//	
//	public int toDecimal() {
//		//converting to base10
//		//first convert each character to an int
//		int decimal = 0;
//		if (isValid==false) {
//			return -1;
//		}
//		//create an array with each index being the value
//		//1 or 0 x 2^(whatever power) for base 2, altered for more bases
//		//find the sum
//		int[] arr = new int[4];
//	    for (int i=0; i<value.length(); i++) {
//	    	int power = (value.length()-1)-i;  //power= last index - i (the power decreases as i increases)
//			int num = (int) Math.pow(base, power);
//			char c = value.charAt(i);
//			int charInt = Character.getNumericValue(c);
//	    	arr[i] = charInt*num;
//	    }
//	    //finding the sum of all the values
//	    for (int i=0; i<arr.length; i++) {
//	    	decimal += arr[i];
//	    }
//		return decimal;
//
//	}
//	
//
//	
//	//HW2 updates:
//	public int getIntValue() {
//		if (isValid == false) {
//			return -1;
//		}
//		else {
//			return intValue;
//		}
//	}
//	
//	
//	public int intValue() {
//		if (isValid == false) {
//			return -1;
//		}
//		return intValue;
//	}
//	
//	public static MyNumber add(MyNumber num1, MyNumber num2, int targetBase) {
//		//return MyNumber in base provided
//		if (targetBase<2 || num1.isValid == false || num2.isValid == false) {
//			return new MyNumber("ERROR", 1);
//		}
//		
//		long sumL = (long) (num1.intValue + num2.intValue);
//		if (sumL>Integer.MAX_VALUE) { //check if its invalid by checking for overflow
//			return new MyNumber("ERROR",1);
//		}
//		
//		int sum = (int) sumL;
//		String sumString = decimalToBase(sum, targetBase);
//		MyNumber result = new MyNumber(sumString, targetBase);
//		return result;
//	}
//	
//	
	//original lab8:
	
	
//	public String convertToBase(int newBase) {
//		//converting to different base from base10
////		int decimal = toDecimal();
//		String strResult = "";
//		
//		if (newBase<2 || isValid==false) {
//			return "ERROR";
//		}		
//		
//		if (intValue == 0) {
//			return "0";
//		}
//		
//		while (intValue > 0) {
//			int rem = intValue % newBase;
//			char result = 0;
//
//			if (rem<10) { 
//				result = (char) ('0'+rem); //specifically for numbers (converting decimal to char)
//			}
//			else {
//				result = (char) ('A'+ (rem-10)); //for letters, converting decimal to char
//			}
//			strResult = result + strResult; //adding result to back of the string
//			intValue /= newBase;
//		}
//		return strResult;
//	}
//	
//	public int getBase() {
//		if (isValid == false) {
//			return -1;
//		}
//		else {
//			return base;
//		}
//	}
//	
//	public String getValue() {
//		if (isValid == false) {
//			return "ERROR";
//		}
//		else {
//			return value;
//		}
//	}
//	
//	private static String decimalToBase(int decimalValue, int base) {
//	    char c;
//		if (base < 2) {
//	    	return "ERROR";
//	    }
//	    if (decimalValue == 0) {
//	    	return "0";
//	    }
//	    
//	    String result = "";
//	    while (decimalValue > 0) {
//	        int rem = decimalValue % base;
//			if (rem<10) { 
//				c = (char) ('0'+rem); //specifically for numbers (converting decimal to char)
//			}
//			else {
//				c = (char) ('A'+ (rem-10)); //for letters, converting decimal to char
//			}
//			result = c + result;
//	        decimalValue /= base;
//	    }
//	    return result;
//	}
//	
//	public int toDecimal() {
//		if (isValid == true) {
//			return intValue;
//		}
//		else {
//			return -1;
//		}
//		
//		//converting to base10
//		//first convert each character to an int
//		int decimal = 0;
//		if (isValid==false) {
//			return -1;
//		}
//		//create an array with each index being the value
//		//1 or 0 x 2^(whatever power) for base 2, altered for more bases
//		//find the sum
//		int[] arr = new int[4];
//	    for (int i=0; i<value.length(); i++) {
//	    	int power = (value.length()-1)-i;  //power= last index - i (the power decreases as i increases)
//			int num = (int) Math.pow(base, power);
//			char c = value.charAt(i);
//			int charInt = Character.getNumericValue(c);
//	    	arr[i] = charInt*num;
//	    }
//	    //finding the sum of all the values
//		    for (int i=0; i<arr.length; i++) {
//		    	decimal += arr[i];
//		    }
//			return decimal;
//
//		}
