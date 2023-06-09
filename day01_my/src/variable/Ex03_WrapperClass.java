package variable;

public class Ex03_WrapperClass {
	
	public static void main(String[] args) {
		
		// Wrapper Class : 비 객체형 primitive type의 데이터를 객체형 데이터로 처리하기 위한 자료형
		// primitive type과 1:1 대응되며, 클래스이므로 첫글자는 대문자로 처리한다
		
			
		boolean bo1 = true;
		byte by1 = 1;
		short sh1 = 2;
		char ch1 = 'A';
		int n1 = 10;
		long ln1 = 20L;
		float fl1 = 1.2F;
		double db1 = 12.56;
		
		Boolean bo2 = bo1;		//Boolean	boolean
		Byte by2 = by1;			//Byte		byte
		Short sh2 = sh1;		//Short		short
		Character ch2 = ch1;	//Character	char
		Integer n2 = n1;		//Integer	int
		Long ln2 = ln1;			//Long		long
		Float fl2 = fl1;		//Float		float
		Double db2 = db1;		//Double	double
		
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + " ~" + Short.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE + " ~ "+ Double.MAX_VALUE);
		
		int t1 = ln2.intValue();			//ln2에 담긴 값을 int 형태로 반환한다
		int t2 = Integer.valueOf("2468");	//문자열 "2468" 을 Integer형태의 값으로 반환한다
		int t3 = Integer.parseInt("1357");	//문자열 "1357" 을 int 형태의 값으로 반환한다.
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		// wrapper class는 호환되는 primitive와 1:1 대응만 가능하다
		// 같은 정수라고해도, Byte와  Short은 서로 호환되지 않는다
		
		Byte by3 = 12;
//		Short sh3 = by3;	//Type mismatch: cannot convert from Byte to Short
//		Short sh3 = (Short)by3;	//Cannot cast from Byte to Short
		
		// 1) wrapper Class의 메서드를 활용하여 변환
		Short sh3 = by3.shortValue();
		
		// 2) Short <-> short <-> byte <-> Byte
		Short sh32 = (short)(byte)by3;	// 변수이름에 가까운 형변환부터 수행한다


		
		byte by4 = 12;
		short sh4 = by4;	// primitive 끼리는 서로 정수라면 대입이 가능하다
		System.out.println(sh4);
		
	}

}
