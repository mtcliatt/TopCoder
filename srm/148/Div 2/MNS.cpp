#include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

class MNS {
public:
	int combos(vector<int> numbers) {
		int squares = 0;
		sort(numbers.begin(), numbers.end());

		int target = accumulate(numbers.begin(), numbers.end(), 0) / 3;

		do {
			int rowa = numbers[0] + numbers[1] + numbers[2];
			int rowb = numbers[3] + numbers[4] + numbers[5];
			int rowc = numbers[6] + numbers[7] + numbers[8];
			int cola = numbers[0] + numbers[3] + numbers[6];
			int colb = numbers[1] + numbers[4] + numbers[7];
			int colc = numbers[2] + numbers[5] + numbers[8];

			if(rowa == target)
			{
				if(rowa == rowb && rowa == rowc && rowa == colb && rowa == colc && rowa == cola)
					squares++;
			}

		} while(next_permutation(numbers.begin(), numbers.end()));

		return squares;
	}
};
