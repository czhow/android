package 成员类案例03;

class Outer{
	private int i=0;
	public Outer(int i){
		this.i=i;
	}
	public void print(){
		System.out.println("Outer:"+i);
	}
	public class Inner{
		private int j=0;
		public Inner(int j){
			this.j=j;
		}
		public void print(){
			System.out.println("Inner:"+i+","+j);
		}
	}
}

public class TestInner{
	public static void main(String[] args){
		Outer outer=new Outer(10);
		outer.print();
		Outer.Inner inner=outer.new Inner(20);
		inner.print();
	}
}