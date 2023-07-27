package stack;
public class testerStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>(9);
		System.out.println(st.push(10));
		System.out.println(st.push(9));
		System.out.println(st.pop());
	}
	

}
