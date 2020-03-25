#include <iostream>
using namespace std;
int main(){
   int arr[]={21,87,15,99, -12};
   /* The array index starts with 0, the
    * first element of array has 0 index
    * and represented as arr[0]
    */
   int i=0;
   while(arr[i]!=15){
      cout<<arr[i]<<endl;
      i++;
   }
}
