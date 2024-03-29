package polymorphism;

/**
 * 2. 司令をこなす側: 七海クラス
 * <pre>public interface インターフェース名 {}<pre>
 */
public class Nanaumi implements OrderFromMotoki,OrderFromShihandai {

	 private String name;
	 private String date;

	 public Nanaumi(String n, String yyyyMM) {
	 name = n;
	 date = yyyyMM;
	 }

	 /*
	 * 司令（インターフェース）が増えた際にOverrideした各メソッドそれぞれを修正することになると、
	 * 修正箇所を探すことは大変だし、賢くない書き方になるので一箇所にまとめましょう！
	 * 以下はOverrideしたメソッドの処理を実行する際に、フラグを立てて該当す処理をさせるメソッドの例
	 */
	  // 司令をこなす！
	 private void submitOrder(final int shoriFlg) {
	 String nameAnd = name + "、";

	 if (shoriFlg == 0) {
	  // 勤務表
	 System.out.println(nameAnd + date + "の勤務表出しました(｀･ω･´)ゞ！！！！！！");
	 } else if (shoriFlg == 1) {
	  // 交通費
	 System.out.println(nameAnd + date + "の交通費も出しました(｀･ω･´)ゞ！！！！！！");
	 } else {
	  // その他
	 System.out.println(nameAnd + "本当はまだ何も出してません(｀･ω･´)ドヤ！！！！！！");
	 }
	 }

	  // 言いづらいけど、何もしてません！←
	 public void doNothing() {
	 submitOrder(-1);
	 }

	@Override
	public void daseyaKinmuhyo() {

		submitOrder(0);
	}

	@Override
	public void daseyaKotsuhi() {
		submitOrder(1);
	}

	@Override
	public void goToSevenEleven() {
		System.out.println("先にセブンイレブン行ってきやす！");
		}

	@Override
	public String doCreateJavaCurriculum() {
		// TODO 自動生成されたメソッド・スタブ
		return "Javaカリキュラム完成しました！";
	}


}


