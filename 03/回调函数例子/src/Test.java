interface ICallBack {		//����һ���ӿ�
	void postExec();
}
// ����һ�����з��������и�����ʱ����ӿ����͵�
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
		foo.doSth();//���ú���
	}
}
