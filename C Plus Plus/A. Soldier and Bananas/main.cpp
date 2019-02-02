#include <iostream>
#include <string>

using namespace std;

int main() {
	int x, y, z;
	cin >> x >> y >> z;
	int sum = 0;
	for (int i = 1; i <= z; i++) {
		sum += i * x;
	}
	if (sum > y) { cout << sum - y; return 0; }
	else { cout << 0;  return 0; }


	return 0;
}
