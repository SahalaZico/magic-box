#include <stdio.h>

void selectionSort(int *T, int N);
void bubbleSort(int *T, int N);

int main (){
 int Arr[]={5, 1, 4, 2, 8};
 int i, N=5;

 printf("Sebelum sorting: \n");
 for (i=0; i<N; i++){
   printf("%d ", Arr[i]);
 }
 
 printf("\nSorting dengan selection sort. \n"); 
bubbleSort(Arr, N); 
 
 printf("Setelah sorting: \n");
 for (i=0; i<N; i++){
   printf("%d ", Arr[i]);
 }
 return 0;
 }
 
void bubbleSort(int *T, int N){
	int i, temp, pass,k,swap=1;
	while(swap != 0){
		swap = 0;
		for(i = 0; i < N-1; i++){
			if(T[i+1]<T[i]){
				temp = T[i+1];
				T[i+1] = T[i];
				T[i] = temp;
				swap++;
			}
			for (k = 0; k < N; ++k){
      			printf("%d ", T[k]);
    		}
    		printf("\n"); 
		}

	}	
 }
 
 void selectionSort(int *T, int N){
	int i, temp, pass, Imin,k;
	for (pass=0; pass<(N-1); pass++){
	    Imin = pass;
		for (i=pass+1; i < N; i++){
		  if (T[Imin] > T[i]) Imin = i; 
		}
		temp = T[Imin];
		T[Imin] = T[pass];
		T[pass] = temp;
		for (k = 0; k < N; ++k){
      		printf("%d ", T[k]);
    	}
    	printf("\n");    
	}
	
 }
