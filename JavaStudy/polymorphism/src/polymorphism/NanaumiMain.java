package polymorphism;

/**
 * 3. 七海クラス: メイン処理
 * <pre>インターフェースを実装したクラスのインスタンス生成してメソッドを呼び出す<pre>
 */
public class NanaumiMain {

 public static void main(String[] args) {
  // 3. 現実（1, 2 を使ってみる）
 Nanaumi Nanaumi = new Nanaumi("七海", "2019/03");
 Nanaumi.daseyaKinmuhyo();
 Nanaumi.daseyaKotsuhi();
 Nanaumi.doNothing();
 Nanaumi.goToSevenEleven();

	  // 3. 現実（1, 2 を使ってみる）
	 Nanaumi nanaumi = new Nanaumi("七海", "2019/01");

	  // Javaカリキュラム作って報告
	 final String message = nanaumi.doCreateJavaCurriculum();
	 System.out.println("message = " + message);
 }
}
