package com.cg.statickeyword;

public class StaticBlock {
	//Static Block is used if you want to initialize the values without using Constructor and obj.creation.
		//then use static block.
		// And make the variable of the class as Static.
		static int num;
		static String str;
		static
		{
			num=26;
			str="Onkar";
		}
		//constructor
		/*StaticBlock() 
		{
			num=23;
			str="Onkar";
		}*/
		public static void main(String[] args) {
			StaticBlock s = new StaticBlock();
			System.out.println(num);
			System.out.println(str);
		}

}
