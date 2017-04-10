package 匿名内部类案例02;

interface pr{
	void print1();
}

public class Main {
	public pr dest(){
		return new pr(){
			public void print1(){
				System.out.println("Hello world!!");
			}
		};
	}
public static void main(String args[]){
	Main c=new Main();
	pr hw=c.dest();
	hw.print1();
}

}
