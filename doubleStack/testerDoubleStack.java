package doubleStack;

public class testerDoubleStack {

	public static void main(String[] args) {
		
		DoubleStack ds= new DoubleStack(5);
		System.out.print(ds.push1(5)+ " | ");
		System.out.print(ds.push2(6)+ " | ");
		System.out.print(ds.push1(2)+ " | ");
		System.out.print(ds.push2(6)+ " | ");
		System.out.print(ds.pop1()+ " | ");
		System.out.print(ds.pop2()+ " | ");
	}

}
