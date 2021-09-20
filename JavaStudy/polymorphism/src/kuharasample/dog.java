package kuharasample;

public class dog extends animal {

	public dog(String anyCall) {
		super.anyCall = anyCall;
	}

	@Override
	protected void naku() {
		System.out.println(super.anyCall);
		// TODO 自動生成されたメソッド・スタブ
	}

}