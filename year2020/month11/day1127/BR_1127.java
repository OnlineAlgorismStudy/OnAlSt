import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
		/* **************************************************
		 * 문제.
		 * 정수 배열 numbers가 주어집니다.
		 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		 * 
		 * numbers의 길이는 2 이상 100 이하입니다.
		 * numbers의 모든 수는 0 이상 100 이하입니다.
		 *
		 *
		 * 입력 예.
		 * ===========================
		 * [2,1,3,4,1]
		 * [5,0,2,7]
		 * ===========================
		 *
		 * 출력 예.
		 * ===========================
		 * [2,3,4,5,6,7]
		 * [2,5,7,9,12]
		 * ===========================
		 * **************************************************/
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length-1; i++) {
        	for (int j = i+1; j < numbers.length; j++) {
        		int sum = numbers[i]+numbers[j];
        		if (!answer.contains(sum)) answer.add(sum);
        	}
        }
        
        return listToSortedArray(answer);
    }
    
    private int[] listToSortedArray(List<Integer> list) {
    	int[] array = new int[list.size()];
    	
    	for(int i = 0; i < list.size(); i++) {
    		array[i] = list.get(i);
    	}
    	Arrays.sort(array);
    	return array;
    }
}
