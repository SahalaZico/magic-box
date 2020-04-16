#include <stdio.h>
#include <string.h>

int main(){
	char date[10];
	int hari,bulan,tahun, modhari;
	scanf("%s",&date);
	hari = (date[0]-'0')*10 + date[1] - '0';
	bulan = (date[3]-'0')*10 + date[4] - '0';
	tahun = (date[6]-'0')*1000 + (date[7] - '0') * 100 + (date[8]-'0')*10 + date[9] - '0';	
	hari += 1;	
	if(bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11){
		modhari = 30;
	}
	else if (bulan == 2){
		if(tahun % 4 == 0){
			modhari = 29;
		}
		else{
			modhari = 28;
		}
	}
	else {
		modhari =31;
	}
	if(hari / modhari > 0){
		bulan += 1;
		if(bulan > 12){
			bulan %= 12;
			tahun += 1;
		}
	}
	hari = hari % modhari;
	printf("%d-%d-%d",hari,bulan,tahun);
	return 0;
}
