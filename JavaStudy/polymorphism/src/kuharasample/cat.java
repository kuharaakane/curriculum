package kuharasample;

public class cat extends animal{


	public cat(String anyCall) {
		super.anyCall = anyCall;
	}

	@Override
	protected void naku() {
		System.out.println(super.anyCall);
		// TODO 自動生成されたメソッド・スタブ
	}

}
