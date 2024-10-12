import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (Character.isDigit(ch)) { // isDigit 숫자 값인지 확인 true false 반환
                int num = Character.getNumericValue(ch); // char 값을 int 값으로 반환
                if (ch == '1' && dartResult.charAt(i + 1) == '0') { // 10점 처리
                    num = 10;
                    i++;
                }
                scores[idx++] = num;
            } else {
                switch (ch) {
                    case 'S':
                        scores[idx - 1] = (int) Math.pow(scores[idx - 1], 1);
                        break;
                    case 'D':
                        scores[idx - 1] = (int) Math.pow(scores[idx - 1], 2);
                        break;
                    case 'T':
                        scores[idx - 1] = (int) Math.pow(scores[idx - 1], 3);
                        break;
                    case '*':
                        scores[idx - 1] *= 2;
                        if (idx - 2 >= 0) {
                            scores[idx - 2] *= 2;
                        }
                        break;
                    case '#':
                        scores[idx - 1] *= -1;
                        break;
                }
            }
        }
        return Arrays.stream(scores).sum();
    }
}
