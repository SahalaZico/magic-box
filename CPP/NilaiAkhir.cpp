#include<iostream>
using namespace std;

int main(){
	string NIM,nama;
	double nil_UTS,nil_UAS,nil_akhir;
	cout<<"Masukkan NIM: ";
	cin>>NIM;
	cout<<"Masukkan nama: ";
	cin>>nama;
	cout<<"Masukkan UTS: ";
	cin>>nil_UTS;
	cout<<"Masukkan UAS: ";
	cin>>nil_UAS;
	nil_akhir = (nil_UTS + nil_UAS)/2;
	cout<< "NIM      : "<<NIM<<endl;
	cout<< "Nama     : "<<nama<<endl;
	cout<< "UTS      : "<<nil_UTS<<endl;
	cout<< "UAS      : "<<nil_UAS<<endl;
	cout<< "Nil_Akhir: "<<nil_akhir<<endl;
	return 0;
}

