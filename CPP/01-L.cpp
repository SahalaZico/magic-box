#include <iostream>
using namespace std;

int main()
{
	int kolom = 5, baris =3;
    int arr[baris][kolom];
    int angka = 1;
    
    for(int i = 0; i < kolom; i++)
    {
        for(int j = 0; j < baris; j++)
        {
            	arr[j][i] = angka;
            	angka++;          	
            	
        }
        
    }
    
    for(int i = 0; i < baris; i++)
    {
        for(int j = 0; j < kolom; j++)
        {
        	if(arr[i][j]!=2 && arr[i][j]!=3 && arr[i][j]!=6){
        		cout << arr[i][j] << " "; 
			}
            else{
            	cout << "  ";	
			}            	
        }
        cout << endl;
        
    }
    return 0;
}
