package numberBaseConversion;

public class Lab8ADriver {

	public static void main(String[] args) {
		MyNumber binary = new MyNumber("1101", 2);
		System.out.println(binary.isValid()); //true
		System.out.println(binary.toDecimal()); //13
		System.out.println(binary.convertToBase(16)); //"D"
		
		MyNumber invalid = new MyNumber("128", 8);
		System.out.println(invalid.isValid()); //false
		System.out.println(invalid.convertToBase(10)); //"ERROR"
		
		MyNumber badBase = new MyNumber("101", 1);
		System.out.println(badBase.isValid()); //false

		MyNumber base23 = new MyNumber("A5K", 23);
		System.out.println(base23.isValid()); //true
		System.out.println(base23.toDecimal()); //5425
		System.out.println(base23.convertToBase(16)); //"1531"
		
		System.out.println();
		
		// 123 in base 8 = 83 in decimal
		MyNumber num1 = new MyNumber ("123", 8) ;
		
		// 3108 in base 10 = 3108 in decimal
		MyNumber num2 = new MyNumber (" 3108 ", 10) ;
		
		// 83 + 3108 = 3191 in decimal = B0C in base 17
		MyNumber result = MyNumber . add ( num1 , num2 , 17) ;
		
		System.out.println(result.getValue()); // "B0C "
		System.out.println(result.getBase()); // 17
		System.out.println(result.value()); // 3191
		
		System.out.println();

		
		// Test Case 1: Binary + Octal = Hexadecimal
		MyNumber bin = new MyNumber(" 1101 ", 2) ; // 13 in decimal
		MyNumber oct = new MyNumber("17", 8) ; // 15 in decimal
		
		MyNumber sum1 = MyNumber.add(bin, oct , 16) ; // 28 = 1C in hex
		System.out.println("Binary 1101 + Octal 17 = Hex " + sum1 . getValue());
		System.out.println("Decimal verification : 13 + 15 = " + sum1.value());
		
		MyNumber product1 = MyNumber.multiply(bin, oct , 16) ; // 28 = 1C in hex
		System.out.println("Binary 1101 x Octal 17 = Hex " + product1 . getValue());
		System.out.println("Decimal verification : 13 x 15 = " + product1.value());
		
		System.out.println();

		
		// Test Case 2: Same base addition/multiplication
		MyNumber dec1 = new MyNumber ("100", 10) ;
		MyNumber dec2 = new MyNumber ("250", 10) ;
		
		MyNumber sum2 = MyNumber.add( dec1 , dec2 , 10) ;
		System.out.println("100 + 250 = " + sum2.getValue() + " (base 10)") ;
		
		MyNumber product2 = MyNumber.multiply( dec1 , dec2 , 10) ;
		System.out.println("100 x 250 = " + product2.getValue() + " (base 10)") ;

		System.out.println();

		
		// Test Case 3: Result in different base than inputs
		MyNumber base5 = new MyNumber (" 1234 ", 5) ; // 194 in decimal
		MyNumber base7 = new MyNumber ("456", 7) ; // 237 in decimal
		
		MyNumber sum3 = MyNumber.add( base5 , base7 , 12) ; // 431 = 2BB in base
		System.out.println("Base5 1234 + Base7 456 = Base12 " + sum3 . getValue()) ;
		
		MyNumber product3 = MyNumber.multiply( base5 , base7 , 12);
		System.out.println("Base5 1234 x Base7 456 = Base12 " + product3.getValue()) ;
		
		System.out.println();

		
		// Test Case 4: Invalid input handling
		MyNumber invalid2 = new MyNumber ("XYZ", 10) ;
		MyNumber valid = new MyNumber ("42", 10) ;
		
		MyNumber sum4 = MyNumber.add( invalid2 , valid , 10) ;
		System.out.println("Invalid + Valid : isValid = " + sum4 . isValid ());
		
		MyNumber product4 = MyNumber.multiply( invalid2 , valid , 10) ;
		System.out.println("Invalid x Valid : isValid = " + product4 . isValid ());
		
		System.out.println();

		
		// Test Case 5: Invalid target base
		MyNumber num3 = new MyNumber ("10", 2) ;
		MyNumber num4 = new MyNumber ("10", 2) ;
		
		MyNumber sum5 = MyNumber.add( num3 , num4 , 1) ; // base 1 is invalid
		System.out.println("Valid nums + invalid target : isValid = " + sum5.isValid () ) ;
		
		MyNumber product5 = MyNumber.multiply( num3 , num4 , 1) ; // base 1 is invalid
		System.out.println("Valid nums x invalid target : isValid = " + product5.isValid () ) ;
		
		System.out.println();
	}

}
