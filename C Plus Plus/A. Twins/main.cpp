#include <iostream>
#include <string>

using namespace std;

int main() {
	int num;
	cin >> num;
	int arr[num][3];
	for (int i = 0; i < num; i++)
		for (int j = 0; j < 3; j++)
			cin >> arr[i][j];

	int hld = 0;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < num; j++) {
			hld += arr[j][i];
		}
		if (hld != 0) { cout << "NO"; return 0; }
	}
	cout << "YES";

	return 0;
}
