#include <iostream>
using namespace std;

int main(){
	//pertama buat array  nilai dan nama
   string nama[5];
   int nilai[5];
   string keterangan[5];
   
   //buat inputan untuk masukkan nilai dan nama
   //loop masukkan
   for(int i = 0; i < 5 ; i++){
   		cout<<"Masukkan nama ke-"<<i+1<<": ";
   		cin>>nama[i];
   		cout<<"Masukkan nilai ke-"<<i+1<<": ";
		cin>>nilai[i];
		if(nilai[i]>=60){
			keterangan[i] = "LULUS";
		}
		else{
			keterangan[i] = "TIDAK LULUS";
		} 	
   }
   
   cout<<"		   DAFTAR NILAI MAHASISWA"<<endl;
   cout<<"		   ======================"<<endl<<endl<<endl;
   cout<<"	=============================================="<<endl;
   cout<<"	NO	NAMA		NILAI	     KET"<<endl;
   cout<<"	=============================================="<<endl;
   
   //loop keluaran
    for(int i = 0; i < 5 ; i++){
   		cout<<"	"<<i+1<<"	"<<nama[i]<<"		"<<nilai[i]<<"	     "<<keterangan[i]<<endl;
   }
   
   


   return 0;
}
