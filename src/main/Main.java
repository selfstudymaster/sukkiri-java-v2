package main;

// コーディング練習用
//public class Main {
//
//	public static void main(String[] args) {
//		System.out.println("Hello tensai!");
//	}
//
//}

//  list01-01
//public class Main {
//	  public static void main(String[] args) {
//	    System.out.println("RPG: スッキリ魔王征伐");
//	    System.out.println("Ver.0.1 by 湊");
//	    System.out.println("＜ただいま鋭意学習・制作中＞");
//	    System.out.println("プログラムを終了します");
//	  }
//}

//list01-02
//public class Main {
//	  public static void main(String[] args) {
//	    int age;
//	    age = 30;
//	    System.out.println(age);
//	  }
//}

//list01-03
//public class Main {
//	public static void main(String[] args) {
//		int age = 20;
//		System.out.println("私の年齢は" + age);
//		age = 31;
//		System.out.println("…いや、本当の年齢は" + age);
//	}
//}

//list01-04
//public class Main {
//	public static void main(String[] args) {
//		double tax = 1.08;
//		int fax = 5;
//		System.out.println( "5万円から4万円に値下げします");
//		tax = 4; // taxに代入すべきところを誤ってfaxに代入
//		System.out.println( "ＦＡＸの新価格（税込み）");
//		System.out.println( fax * tax + "万円" );
//	}
//}

// list01-05
public class Main {
	public static void main(String[] args) {
		final double TAX = 1.08;
		int fax = 5;
		System.out.println( "5万円から4万円に値下げします");
		fax = 4;
		System.out.println( "ＦＡＸの新価格（税込み）");
		System.out.println( fax * TAX + "万円" );
	}
}