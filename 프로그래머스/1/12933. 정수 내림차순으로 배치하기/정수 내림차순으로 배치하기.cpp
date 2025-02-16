#include <string>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(long long n) {
    vector<long long> vec;
    string str = to_string(n);
    sort(str.begin(), str.end(), greater<char>());
    return stoll(str);
}