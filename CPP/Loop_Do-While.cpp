#include <iostream>
using namespace std;
int main(){
   int arr[]={21,99,15,109};
   /* Array index starts with 0, which
    * means the first element of array
    * is at index 0, arr[0]
    */
   int i=0;
   do{
      cout<<arr[i]<<endl;
      i++;
   }while(i<4);
   return 0;
}
