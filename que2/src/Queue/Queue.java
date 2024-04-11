package Queue;

import java.util.*;
import java.io.*;

/*정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여섯 가지이다.

push X: 정수 X를 큐에 넣는 연산이다.
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 큐에 들어있는 정수의 개수를 출력한다.
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.*/

public class Queue {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		java.util.Deque<Integer> que = new LinkedList<>();
		
		int Num = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < Num; i++) {
			st = new StringTokenizer(bf.readLine());
			String command = st.nextToken();
			if(command.equals("push")) { 
				que.add(Integer.parseInt(st.nextToken()));
			}
			if(command.equals("pop")) {
				if(que.isEmpty()) {
					bw.write(-1+ "\n");
				}
				else {
					bw.write(que.poll()+ "\n");
				}
			}
			if(command.equals("size")) {
				bw.write(que.size()+ "\n");
			}
			if(command.equals("empty")) {
				if(que.isEmpty()) {
					bw.write(1+ "\n");
				}
				else {
					bw.write(0+ "\n");
				}
			}
			if(command.equals("front")) {
				if(que.isEmpty()) {
					bw.write(-1+ "\n");
				}
				else {
					bw.write(que.peek()+ "\n");
				}
			}
			if(command.equals("back")) {
				if(que.isEmpty()) {
					bw.write(-1  + "\n");
				}
				else {
					bw.write(que.peekLast()+ "\n");
				}
			}
		}
		bw.flush();
		bw.close();
	}

}
