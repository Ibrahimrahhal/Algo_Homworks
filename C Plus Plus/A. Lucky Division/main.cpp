#include <iostream>
#include <string>

using namespace std;
bool cknumber(int x) {
	string y = to_string(x);
	for (int i = 0; y[i]; i++) {
		if (y[i] == '4' || y[i] == '7')
			continue;
		else
			return false;

	}
	return true;




}
int main() {
	int y;
	cin >> y;
	if (cknumber(y)) { cout << "YES"; return 0; }
	for (int i = y - 1; i > 0; i--) {
		if (y%i == 0) if (cknumber(i)) { cout << "YES"; return 0; }
	}
	cout << "NO";


	return 0;
}
