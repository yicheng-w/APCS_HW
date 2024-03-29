import java.util.Random;

public class Driver{

	public static void main(String[] args) {
		//Sarray<String> SAS = new Sarray<String>();
		Sarray<Integer> SAI = new Sarray<Integer>();
		Sarray<Integer> SAI2 = new Sarray<Integer>();
		Sarray<Integer> SAI3 = new Sarray<Integer>();
		Sarray<Integer> SAI4 = new Sarray<Integer>();

		Random randgen = new Random();

		for (int i = 0 ; i < Integer.parseInt(args[0]) ; i++) {
			int newVal = randgen.nextInt(Integer.parseInt(args[1]));
			SAI.add(newVal);
			SAI2.add(newVal);
			SAI3.add(newVal);
			SAI4.add(newVal);
		}

		//System.out.println(SAI.toString());

		long isortBegin = System.currentTimeMillis();
		SAI.isort();
		long isortEnd = System.currentTimeMillis();
		//System.out.println(SAI.toString());
		System.out.println("Time used for insertion sort:" + (isortEnd-isortBegin));

		long ssortBegin = System.currentTimeMillis();
		SAI2.ssort();
		long ssortEnd = System.currentTimeMillis();
		//System.out.println(SAI2.toString());
		System.out.println("Time used for selection sort:" + (ssortEnd-ssortBegin));

		long dsortBegin = System.currentTimeMillis();
		SAI3.dsort();
		long dsortEnd = System.currentTimeMillis();
		//System.out.println(SAI3.toString());
		System.out.println("Time used for default sort:" + (dsortEnd - dsortBegin));

		long bsortBegin = System.currentTimeMillis();
		SAI4.bsort();
		long bsortEnd = System.currentTimeMillis();
		//System.out.println(SAI4.toString());
		System.out.println("Time used for bubble sort:" + (bsortEnd - bsortBegin));

		//Sarray<Double> SAD = new Sarray<Double>();
/*
		SAS.add("hello");
		SAS.add("alpha");
		SAS.add("beta");
		System.out.println(SAS.toString());
		SAS.remove(0);
		System.out.println(SAS.toString());
		SAS.add("gamma");
		System.out.println(SAS.toString());
		SAS.add(0,"NEW");
		SAS.add(1,"ONE");
		System.out.println(SAS.toString());
		SAS.isort();
		System.out.println(SAS.toString());
		
		//Random randgen = new Random();
		//for (int i = 0 ; i < Integer.parseInt(args[0]) ; i++) {
		//	SAI.add(randgen.nextInt(Integer.parseInt(args[1])));
		//}

		SAI.add(20);
		SAI.add(10);
		SAI.add(5);
		SAI.add(7);
		SAI.add(6);

		System.out.println(SAI.toString());
		//SAI.isort();
		SAI.ssort();
		System.out.println(SAI.toString());
		
		SAD.add(10.1);
		SAD.add(10.3);
		SAD.add(10.4);
		System.out.println(SAD.toString());
		
		OrderedSarray<Integer> OSAI = new OrderedSarray<Integer>();

		OSAI.add(10);
		OSAI.add(5);
		OSAI.add(18);
		OSAI.add(13);
		System.out.println(OSAI.toString());
		OSAI.remove(2);
		System.out.println(OSAI.toString());
		OSAI.remove(0);
		System.out.println(OSAI.toString());
		OSAI.add(50);
		OSAI.add(0,30);
		System.out.println(OSAI.toString());



		OrderedSarray<String> OSAS = new OrderedSarray<String>();

		OSAS.add("Alpha");
		OSAS.add("Beta");
		OSAS.add("Charlie");
		OSAS.add("Alice");
		OSAS.add("Bob");
		OSAS.add("cake");
		System.out.println(OSAS.toString());

		OrderedSarray<Double> OSAD = new OrderedSarray<Double>();

		OSAD.add(10.2);
		OSAD.add(9.5);
		OSAD.add(10.234);
		OSAD.add(4.0);
		System.out.println(OSAD.toString());
*/
		}
}
