package Stack2;

import java.util.*;
import java.io.*;

/*정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.*/

//스택의 사용법을 알 수 있었다.

public class Stack2 {
	public static void main(String[] args) throws IOException {
		
		Stack<Integer> stack = new Stack<>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int Num = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < Num; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int number = Integer.parseInt(st.nextToken());
			
			if(number == 1) {
				//스택에 값을 넣음
				stack.push(Integer.parseInt(st.nextToken()));
			}
			if(number == 2) {
				// 스택이 비어있으면 -1을 아니면 맨 위의 값을 삭제하고 출력
				if(stack.empty()) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(stack.pop() + "\n");
				}
			}
			if(number == 3) {
				//스택의 크기 출력
				bw.write(stack.size() + "\n");
			}
			if(number == 4) {
				//스택이 비어있으면 1 아니면 0
				if(stack.empty()) {
					bw.write(1 + "\n");
				}
				else {
					bw.write(0 + "\n");
				}
			}
			if(number == 5) {
				//스택이 비어있으면 -1 아니면 맨위의 값을 삭제하지 않고 출력
				if(stack.empty()) {
					bw.write(-1 + "\n");
				}
				else {
					bw.write(stack.peek() + "\n");
					
				}
			}
			
		}
		bw.flush();
		bw.close();
	}

}
