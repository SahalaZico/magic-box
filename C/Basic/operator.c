#include "boolean.h"
#include <stdio.h>
int main(){
	boolean Bool1, Bool2, TF;
	int i,j,hsl;
	float x,y,res;
	
	Bool1 = true;
	Bool2 = false;
	TF = Bool1 && Bool2;
	printf("%d\n",TF);
	TF = Bool1 || Bool2;
	printf("%d\n",TF);
	TF = !Bool1;
	printf("%d\n",TF);
	TF = Bool1 ^Bool2;
	printf("%d\n",TF);
	
	i=5;
	j=2;
	hsl = i+j;
	hsl = i-j;
	hsl = i/j;
	hsl = i*j;
	hsl = i%j;
	
	x=5.0;
	y=2.0;
	res = x + y;
	res = x - y;
	res = x / y;
	res = x * y;
	return 0;
}

