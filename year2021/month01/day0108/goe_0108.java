package year2021.month1;

public class goe_0108 {
    public static int solution(String skill, String[] skill_trees) {

        int answer = 0;

        boolean flag = true;
        String start = skill.substring(0,1);
        int start_index = 0;
        int current_index = 0;

        for(int i = 0; i < skill_trees.length; i++) {
            start_index = skill_trees[i].indexOf(start);

            for(int j = 1; j < skill.length(); j++) {
                current_index = skill_trees[i].indexOf(skill.charAt(j));

                if(((start_index > -1)&&(start_index < current_index)) || (start_index == current_index) || (current_index < 0)&&(current_index < start_index)) {
                    System.out.println("if start: " + start_index+ " " + "current: " + current_index);
                    flag = true;
                } else {
                    System.out.println("else start: " + start_index+ " " + "current: " + current_index);
                    flag = false;
                    break;
                }

                start_index = current_index;
                System.out.println("start_index = current_index: " + start_index +", " + current_index);

            }
            System.out.println("Flag: " + flag);
            if(flag == true){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"BACDE", "BDA", "AECB", "CBADF", "CABED"}));
    }
}
