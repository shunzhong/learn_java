package algorithm;

public class Shape {
	private static  String a = "1";

    {
        System.out.println("????????????????");
    }
	protected  Shape() {
	    System.out.println("Shape class constructor");
    }

	static {
			System.out.println(a + "....................................");
	}


	static class  ShapeStatic {

	    static  {
            System.out.println("static inner class print, static code block");
        }

	    public static void main(String[] args) {
            System.out.println("static inner class print**************");
        }
    }
	public static void main(String[] args) {

        new Shape();
//		print1();
		System.out.println("___________________________________");
		/*print2();
		System.out.println("___________________________________");
		print3();
		System.out.println("___________________________________");
		print4();
		System.out.println("___________________________________");
		print5();
		System.out.println("___________________________________");
		print6();
		System.out.println("___________________________________");*/
		printYanhui();
	}
	
	/**
	
	*****
	*****
	*****
	*****
	
	*/
	public static void print1() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/**
	
	*****
	***
	**
	*
	
	*/
	public static void print2() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	/**
	
	*
	**
	***
	****
	*****	
	
	*/
	public static void print3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	/*
	
	1*1
	2*1 2*2
	3*1 3*2 3*3
	
	*/
	public static void print4() {
		for(int i = 1; i < 10; i++){
			for(int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}
	
	
	/*

	@@@*@@@
    @@***@@
    @*****@
	*******
	*/
	
	public static void print5() {
	
		for (int i = 0; i < 4; i++ ) {
			StringBuilder sbuilder = new StringBuilder();
			for (int j = i; j < 3; j++) {
				sbuilder.append("@");
			}
			System.out.print(sbuilder);
			for (int j = 0; j < (2 * i) + 1 ; j++) {
				System.out.print("*"); 
			}
			System.out.print(sbuilder);
			System.out.println();
			
		}
	}
	
	/*
	@@@*@@@
    @@***@@
    @*****@
	*******
	@*****@
	@@***@@
	@@@*@@@
	*/
	public static void print6() {
		// 总共需要打印7个符号
		int tp = 7;
		/**
		 * @@@*@@@
		   @@***@@
		   @*****@
		   *******
		 */
		for(int i = 0; i < ((tp / 2) + 1); i++) {
			int starNum = 2 * i + 1;
			
			StringBuilder sBuilder = new StringBuilder();
			for (int j = 0; j < (tp - starNum) / 2; j++) {
//				sBuilder.append("@");
				System.out.print(" ");
			}
			
			StringBuilder starBuilder = new StringBuilder();
			for(int j = 0; j < starNum; j++) {
//				starBuilder.append("*");
				System.out.print("*");
			}
			System.out.println(starBuilder.append(sBuilder));
		}
		
		
		for(int i = 1; i < tp / 2 + 1; i++) {
			StringBuilder atBuilder = new StringBuilder();
			for(int j = 0; j < i; j++) {
//				atBuilder.append("@");
				System.out.print(" ");
			}
			
			StringBuilder starBuilder = new StringBuilder();
			for(int j = 0; j < tp - (2 * i); j++ ) {
//				starBuilder.append("*");
				System.out.print("*");
			}
			
			System.out.println(/*starBuilder.append(atBuilder)*/);
		}
	} 
	/*
	 0		1 
	 1	   1 1
	 2	  1 2 1
	 3	 1 3 3 1
	 4	1 4 6 4 1
	 */
		
	
	public static void printYanhui() {
		int total = 10;
		
		int[][] lines = new int[total][];
		
		for (int i = 0; i < total; i ++) {
			for(int j = 0; j < total - i; j++) {
				System.out.print(" ");
			}
			
			int[] tmpArray = new int[i + 1];
			for(int j = 0; j < i + 1; j++) {
				if (0 == j || i == j)  {
					tmpArray[j] = 1;
				} else {
					tmpArray[j] = lines[i - 1][j] + lines[i - 1][j - 1];
				}
				System.out.print(tmpArray[j] + " ");
			}
			lines[i] = tmpArray; 
			System.out.println();
		}
		
	}

} 
