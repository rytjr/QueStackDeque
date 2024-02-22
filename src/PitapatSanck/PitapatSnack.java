package PitapatSanck;

import java.util.*;
import java.io.*;

/*인하대학교 학생회에서는 중간, 기말고사 때마다 시험 공부에 지친 학우들을 위해 간식을 나눠주는 간식 드리미 행사를 실시한다. 승환이는 시험 기간이 될 때마다 간식을 받을 생각에 두근두근 설레서 시험 공부에 집중을 못 한다. 이번 중간고사에서도 역시 승환이는 설레는 가슴을 안고 간식을 받기 위해 미리 공지된 장소에 시간 맞춰 도착했다. 그런데 이게 무슨 날벼락인가! 그 곳에는 이미 모든 학생들이 모여있었고, 승환이는 마지막 번호표를 받게 되었다. 설상가상으로 몇몇 양심에 털이 난 학생들이 새치기를 거듭한 끝에 대기열의 순서마저 엉망이 되고 말았다. 간식을 나눠주고 있던 인규는 학우들의 터져 나오는 불만에 번호표 순서로만 간식을 줄 수 있다고 말했다. 

그제야 학생들이 순서대로 줄을 서려고 했지만 공간이 너무 협소해서 마음대로 이동할 수 없었다. 다행히도 대기열의 왼쪽에는 1열로 설 수 있는 공간이 존재하여 이 공간을 잘 이용하면 모두가 순서대로 간식을 받을 수 있을지도 모른다. 자칫 간식을 못 받게 될지도 모른다는 위기감을 느낀 승환이는 자신의 컴퓨터 알고리즘적 지식을 활용해 과연 모든 사람들이 순서대로 간식을 받을 수 있는지 확인하는 프로그램을 만들기로 했다. 만약 불가능 하다면 승환이는 이번 중간고사를 망치게 될 것 이고 가능하다면 힘을 얻어 중간고사를 잘 볼 수 있을지도 모른다.

사람들은 현재 1열로 줄을 서있고, 맨 앞의 사람만 이동이 가능하다. 인규는 번호표 순서대로만 통과할 수 있는 라인을 만들어 두었다. 이 라인과 대기열의 맨 앞 사람 사이에는 한 사람씩 1열이 들어갈 수 있는 공간이 있다. 현재 대기열의 사람들은 이 공간으로 올 수 있지만 반대는 불가능하다. 승환이를 도와 프로그램을 완성하라.

현재 간식 배부 공간을 그림으로 나타내면 다음과 같다.*/

//문제를 읽고 쉬운 문제라고 생각했지만 문제에 정답 요건이 정확하지 않아 어려움을 겪었다. 이런 점은 백준의 아쉬운 점이다.

public class PitapatSnack {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Num = Integer.parseInt(bf.readLine());
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int[] list = new int[Num];
		
		for(int i = 0; i < Num; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(StackSort(list));
	} 
	
	//숫자로 나누어진 배열을 넘겨 받아 정답이면 Nice 틀리면 Sad를 return한다.
	public static String StackSort(int[] list) {
		
		Stack<Integer> stack = new Stack<>();
		
		int count = 1;
		
		for(int i = 0 ; i < list.length; i++) {
			
			if(count == list[i]) {
				count++;
			}
			else if (!stack.empty() && stack.peek() == count) {
				//i--을 통해 다시 확인을 해야한다.
				i--;
				stack.pop();
				count ++;
			}
			else{
				stack.push(list[i]);
			}
		}
		while(!stack.empty()) {
			if(stack.peek() == count) {
				stack.pop();
				count++;
			}
			else {
				stack.pop();
			}
		}
	    if(count -1 == list.length) {
	    	return "Nice";
	    }
	    else return "Sad";
	}
}
