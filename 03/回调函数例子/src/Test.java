interface ICallBack {		//声明一个接口
	void postExec();
}
// 另外一个类有方法里面有个参数时这个接口类型的
class FooBar {
	private ICallBack callBack;

	public void setCallBack(ICallBack callBack) {
		this.callBack = callBack;
	}
	public void doSth() {
		callBack.postExec();
	}
}
public class Test {

	public static void main(String[] args) {
		FooBar foo = new FooBar();
		foo.setCallBack(new ICallBack() {
			@Override
			public void postExec() {
				// TODO Auto-generated method stub
				System.out.println("method executed.");
			}
		});
		foo.doSth();//调用函数
	}
}
