import java.util.*;
import java.text.SimpleDateFormat;

class Solution {
  public String solution(int a, int b) {
      String answer = "";
      int dayNum = 0;
      int[] mon = {0,31,29,31,30,31,30,31,31,30,31,30,31};
      
      for(int i=0;i<a;i++){
          dayNum += mon[i];
      }
      
      dayNum = (dayNum+b)%7;
      switch(dayNum){
          case 0: answer = "THU"; break;
          case 1: answer = "FRI"; break;
          case 2: answer = "SAT"; break;
          case 3: answer = "SUN"; break;
          case 4: answer = "MON"; break;
          case 5: answer = "TUE"; break;
          case 6: answer = "WED"; break;
      }
      
      return answer;
  }
}