#include <stdio.h>

int main(){
	float a,b;
	int menu;
	printf("Masukkan a: ");
	scanf("%f",&a);
	printf("Masukkan b: ");
	scanf("%f",&b);
	printf("Menu\n1.Penjumlahan\n2.Perkalian\n3.Pengurangan\n4.Pembagian\n");
	printf("Pilih menu: ");
	scanf("%d",&menu);
	if(menu == 1){
		printf("a + b = %f",a+b);
	}
	else if(menu == 2){
		printf("a x b = %f",a*b);
	}
	else if(menu == 3){
		printf("a - b = %f",a-b);
	}
	else if(menu == 4){
		printf("a : b = %f",a/b);
	}
	return 0;
}
