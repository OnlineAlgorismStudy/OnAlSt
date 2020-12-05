
//리턴 하면 띄어쓰기가 되서 안되네요,,, 값은 맞는데 ㅠㅠ
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        //중복 제거 해시셋
        HashSet<Integer> hash = new HashSet<Integer>();

		// 중첩 for문,
		for (int i = 0; i < answer.length; i++) {
			for (int j = 1; j < answer.length; j++) {
				if (i == j) { // i == j랑 중복된 값을 제거하고 hashset으로 엮어주면됨
					continue;
				}
				hash.add(answer[i]+answer[j]);
			} // for(j)
		} // for(i)
        //정렬을 위해 ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>(hash);
        //정렬
		Collections.sort(al);
        //Inteager >> int 다운캐스팅
		for (int i = 0; i < al.size(); i++) {
			answer[i] = (int) al.get(i);
		}
        return answer;
    }
}
