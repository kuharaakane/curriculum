
public class Curriculum {
	public static void main(String[] args) {

//		データ型　int String

		String これが変数 = "あいう";
		int seisu = 1234;
		int 偶数 = 4;

		System.out.println(これが変数);
		System.out.println("int = seisu =" + seisu);
        System.out.println("int = seisu =" + seisu + " + 偶数 = " + 偶数+ "   変数や配列どうしも連結できるよ");
        System.out.println(これが変数 + seisu);


//        配列
//        宣言と要素数length
        int [] hensu = {1,2,3,4,5};
        System.out.println("lengthで要素数を出してるよ");
        System.out.println(hensu.length);


        String[] animar = {"0_neko","1_inu","2_tori","3_fox"};
        System.out.println("要素数の先頭は0からだよ" + animar[0]);
        System.out.println(animar[1] + "+" +  animar[2]);

        animar[0] = "mikeneko";
        System.out.println("要素数は0からカウントだけど配列の番号は一からカウントだよ。0_neko = " + animar[0] + "   ネコにミケネコで代入してるからミケネコで表示されるよ。");
        System.out.println("0_neko = " + animar[0]);


        animar[2] = "inko";

        animar[3] = "itachi";
        System.out.println( animar[2] + "+" +  animar[3] + "変数や配列どうしも連結できるよ");


        int testkekka[] = {75,59,86,36};
        int sum = 0;
        sum = testkekka[0] + testkekka[1] + testkekka[2] + testkekka[3];
        System.out.println(sum);




















	}


}
