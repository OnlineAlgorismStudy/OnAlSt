import java.util.*;

class Solution {
	public int[] solution(int[] numbers) {

		ArrayList<Integer> arr = new ArrayList<>();

		int[] answer = {};
		for (int i = 0; i < numbers.length - 1; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if (arr.indexOf(sum) < 0) {
					arr.add(sum);
				} // end if

			} // end for
		} // end for

		answer = new int[arr.size()];

		for (int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		} // end for

		Arrays.sort(answer);
		return answer;

	} // end main
} // end class
