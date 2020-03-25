#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a,b;
    cin>>a;
    cin>>b;
    string arr[11] = {"one", "two", "three", "four", "five", "six", "seven", "eigth", "nine", "odd", "even"};
    for(int i=a ; i<=b ; i++){
        if(i<=9){
			cout << arr[i-1]<<endl;
        }
        else{
        	if(i % 2 == 0){
                cout << arr[10]<<endl;
            }
            else{
                cout << arr[9]<<endl;
            }
        }
    }
    return 0;
}
