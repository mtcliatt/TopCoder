#include <vector>
#include <list>
#include <map>
#include <set>
#include <queue>
#include <deque>
#include <stack>
#include <bitset>
#include <algorithm>
#include <functional>
#include <numeric>
#include <utility>
#include <sstream>
#include <iostream>
#include <iomanip>
#include <cstdio>
#include <cmath>
#include <cstdlib>
#include <ctime>

using namespace std;


class FoxAndIntegers {
public:
	vector <int> get(int AminusB, int BminusC, int AplusB, int BplusC) {
		vector<int> list;
		double a = (AminusB + AplusB)/2;
		double b = AplusB - a;
		double c = BplusC - b;

		if( ((int)a != a) || ((int)b != b) || ((int)c != c)) {
			return list;
		}

		if( AminusB != (a-b) || BminusC != (b-c) || AplusB != (a+b) || BplusC != (b+c)) {
			return list;
		}

		list.push_back((int)a);
		list.push_back((int)b);
		list.push_back((int)c);

		return list;
	}
};



//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
