#include <iostream>
using namespace std;
int main(){
   char ch='b';
   switch(ch) {
      case 'd': cout<<"Case1 ";
      break;
      case 'b': cout<<"Case2 ";
      break;
      case 'x': cout<<"Case3 ";
      break;
      case 'y': cout<<"Case4 ";
      break;
      default: cout<<"Default ";
   }
   return 0;
}
