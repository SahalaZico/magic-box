#include <stdio.h>

int main(){
	float T;
	printf("Masukkan suhu tubuh: ");
	scanf("%f",&T);
	if(T<36){
		printf("Hipotermia");
	}
	else if(T >= 36 && T <= 37.5){
		printf("Normal");
	}
	else if(T > 37.5 && T <= 39){
		printf("Demam");
	}
	else if(T > 39){
		printf("Hipertermia");
	}
	return 0;
}
