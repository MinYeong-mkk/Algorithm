import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] counter = new int[N + 1];
        int[] answer = new int[N];
        
        // 스테이지 도달한 플레이어 수 세기
        for (int i = 0; i < stages.length; i++) {
            if (stages[i] <= N) {
                counter[stages[i]]++;
            }
        }
        
        // 실패율 계산을 위한 리스트
        List<double[]> failureList = new ArrayList<>();
        int totalPlayers = stages.length; // 전체 플레이어 수
        
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureList.add(new double[]{i, 0});
            } else {
                double failureRate = (double)counter[i] / totalPlayers;
                failureList.add(new double[]{i, failureRate});
                totalPlayers -= counter[i]; // 현재 스테이지에서 실패한 사람을 제외
            }
        }
        
        // 실패율을 기준으로 정렬 (내림차순)
        Collections.sort(failureList, (a, b) -> Double.compare(b[1], a[1]));
        
        // 정답 배열에 스테이지 번호만 담기
        for (int i = 0; i < N; i++) {
            answer[i] = (int)failureList.get(i)[0];
        }
        
        return answer;
    }
}
