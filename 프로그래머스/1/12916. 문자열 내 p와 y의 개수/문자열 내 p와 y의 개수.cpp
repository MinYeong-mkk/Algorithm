#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    int n = 0;
    for(int i=0; i<s.size(); i++){
        if(s[i] == 'p' || s[i] == 'P') n++;
        else if(s[i] == 'y' || s[i] == 'Y') n--;
    }
    return n==0;
}