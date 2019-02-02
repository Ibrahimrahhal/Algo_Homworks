
#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

int main() {
	int num;
	cin >> num;
	int arr[num];
	int tot = 0;
	for (int i = 0; i < num; i++) {
		cin >> arr[i];
		tot += arr[i];
	}
	sort(arr, arr + num);
	int sum = 0, number = 0;
	for (int i = num - 1; i >= 0; i--) {
		sum += arr[i]; 
		tot -= arr[i];
		number++;
		if (sum > tot) {
			cout << number; return 0;
		}

	
	}

	return 0;
}
