#include <iostream>     // std::cin, std::cout
using namespace std;
int main () {
  char name[256], title[256];
  string a;
  cout << "Please, enter your name: ";
  cin.getline (name,256);
  cout << "Please, enter your movie: ";
  cin>>a;

  cout << name << "'s favourite movie is " << a;

  return 0;
}
