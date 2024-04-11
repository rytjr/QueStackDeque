package Deque1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/*정수를 저장하는 덱을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 여덟 가지이다.

1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.*/

public class Deque1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()) {
                case "1" : dq.addFirst(Integer.parseInt(st.nextToken())); break;
                case "2" : dq.addLast(Integer.parseInt(st.nextToken())); break;
                case "3" : sb.append(!dq.isEmpty() ? dq.removeFirst() : -1).append("\n"); break;
                case "4" : sb.append(!dq.isEmpty() ? dq.removeLast() : -1).append("\n"); break;
                case "5" : sb.append(dq.size()).append("\n"); break;
                case "6" : sb.append(dq.isEmpty() ? 1 : 0).append("\n"); break;
                case "7" : sb.append(!dq.isEmpty() ? dq.getFirst() : -1).append("\n"); break;
                case "8" : sb.append(!dq.isEmpty() ? dq.getLast() : -1).append("\n"); break;
            }
        }
        System.out.println(sb.toString());
    }

}
