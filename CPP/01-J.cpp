#include <iostream>
using namespace std;

int main()
{
	int kolom = 5, baris =3;
    int arr[baris][kolom];
    int angka = 1;
    
    for(int i = 0; i < baris; i++)
    {
        for(int j = 0; j < kolom; j++)
        {
        	if(j<(kolom/2-i) || j>(kolom/2+i)){
				arr[i][j] = 0;
			}
			else{
				arr[i][j] = angka;
            	angka++;  
			} 	          		
        }
        
    }
    
    for(int i = 0; i < baris; i++)
    {
        for(int j = 0; j < kolom; j++)
        {
        	if(arr[i][j]==0){
        		cout << "  ";
			}
			else{
				cout << arr[i][j] << " ";   
			} 		
        }
        cout << endl;
        
    }
    return 0;
}
