
class Solution {
	public int[] solution(int brown, int yellow) {
	int[] answer = new int[2];

   for(int length=3; length<brown+yellow; length++) {
        int width = (brown+yellow) / length;
        if(width >= length) {
            if((width-2) * (length-2) == yellow) {
                answer[0]=width;
                answer[1]=length;
                break;
            }
        }
    }

    return answer;
}
}