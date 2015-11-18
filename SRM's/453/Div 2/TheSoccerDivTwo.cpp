#include <algorithm>
#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

class TheSoccerDivTwo
{
public:

	int find(vector<int> points)
	{ 
		//C++;

		int place = 0, myIndex = 0;
		points[0] += 3;
		int curPoints = points[0];

		sort(points.begin(), points.end());

		for(int i = points.size() - 1; i >= 0; i--)
		{
			if(points[i] == curPoints)
			{
				myIndex = i;
				break;
			}
		}

		place = points.size() - myIndex;

		int above = points.size() - 1 - myIndex;
		int start = 0;
		int end = myIndex - above - 2;

		if(myIndex <= points.size() / 2)
			return place;

		while(start < end)
		{
			if(points[start] + 3 > curPoints && points[end] + 1 > curPoints)
			{
				place++;
				end -= 2;
			}
			else
			{
				start++;
				end--;
			}
		}

		return place;
	}

};
