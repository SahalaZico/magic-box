#include <iostream>
#include <string>
using namespace std;

int main()
{
	int kolom = 5, baris =3;
    string arr[baris][kolom];
    int angka = 1;
    
    for(int i = 0; i < baris; i++)
    {
        for(int j = 0; j < kolom; j++)
        {
        	if(j<(kolom/2-i) || j>(kolom/2+i)){
        		arr[i][j] = " ";
			}
			else{
				arr[i][j] = to_string(angka);   
			} 
            	
            angka++;          	 	
        }
        
    }
    
    for(int i = 0; i < baris; i++)
    {
        for(int j = 0; j < kolom; j++)
        {
			cout << arr[i][j] << " ";   		
        }
        cout << endl;
        
    }

    return 0;
}
