package Zero;

import java.util.*;
import java.io.*;

/*첫 번째 줄에 정수 K가 주어진다. (1 ≤ K ≤ 100,000)

이후 K개의 줄에 정수가 1개씩 주어진다. 정수는 0에서 1,000,000 사이의 값을 가지며, 정수가 "0" 일 경우에는 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.

정수가 "0"일 경우에 지울 수 있는 수가 있음을 보장할 수 있다.*/

//단순히 넣고 뺴는 계산은 스택을 이용해 쉽게 만들수 있다.

public class Zero {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> stack = new Stack<>();
		
		int Num = Integer.parseInt(bf.readLine());
		int sum = 0;
		
		for(int i = 0; i < Num; i++) {
			
			int x = Integer.parseInt(bf.readLine());
			
			if(x == 0) {
				stack.pop();
			}
			else {
				stack.push(x);
			}
			
			
		}
		//stack을 pop하며 크기가 같이 줄어든다는 사실을 간과하고 사욯했음 다음에는 주의가 필요
		/*
		 * for(int i = 0; i < stack.size(); i++) {
			sum += stack.pop();
		}
		*/
		
		
		while (!stack.isEmpty()) {
		    sum += stack.pop();
		}
		
		System.out.print(sum);
	}

}
