class Solution {
    public long solution(int n) {
        return fibo(n);
    }
    public static int fibo(int n){
        int f=1;
        int pref=0;
        int temp=0;
        
        for(int i=0;i<n;i++){
            temp = f;
            f = (f+pref)%1234567;
            pref = temp;
        }
        return f;
    }
}

/*
미늉 문제 보는중?
이런문제는 나도 어려워. 처음풀어보면 특히 더 나도 방금 이문제 보고 어떻게 풀어야될지 감이 안왔어.
일단 규칙을 찾을 수 있도록 노력해봐야해
힌트 필요하면 말해.
네옹
아니 aws 잠깐 봤엉 아하
나 근데 방금 규칙찾았거든?
하나하나 해봐바
째려보면 답안나오는문제임. 이건. 나 싸피 쌤도 수학 잘못해서 규칙 찾으려고 하나하나 다 해본댔어.아하
1 = 1 (1)
2 = 2 (11, 2)
3 = 3 (111, 12, 21)
4 = 5 (1111, 112, 121, 211, 22)
5 = 8(11111, 1112, 1211, 1121, 1112, 122, 212, 221)
6 = ?
피보나치? 오대박
누나
나도 5에서
눈치챘어 ㅋ
근데 나 피보 구현할 줄 몰흠
ㅋ
아니  누나 할수있음재귀?재귀보다 전에 누나가 구현했떤 방식이 더 빨라
t바놉ㄱ문안
반복문에서 temp로 했던거
언제지?흠... 프로그래머스였을걸
*/