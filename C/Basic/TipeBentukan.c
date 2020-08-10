#include <stdio.h>
union status{
  int rank ;
  char deg[4] ;
};

struct personal{
  long id; 
  float gpa;
  union status level;
};

struct identity{
  char name[30];
  struct personal student; 
};

int main( ){
	int i;
	struct identity MHS[5];
	char u_g;
	for(i = 0; i < 5 ; i++){
		printf("Masukkan data Mahasiswa ke-%d\n",i+1);
		printf("Masukkan nama: ");
		scanf("%s", &MHS[i].name);
		printf("Masukkan id: ");
		scanf("%d", &MHS[i].student.id);
		printf("Masukkan gpa: ");
		scanf("%f", &MHS[i].student.gpa);
		printf("Masukkan status - u atau g\n");
		scanf("%s", &u_g);
		if (u_g == 'u'){
			printf ("Enter rank -- 1, 2, 3, 4 or 5\n");
			scanf ("%d", &MHS[i].student.level.rank);
			printf ("%s is level %d\n" , MHS[i].name ,MHS[i].student.level.rank);
		}
		else{
			printf ("Enter degree sought -- ms or phd\n");
			scanf ("%s", &MHS[i].student.level.deg);
			printf ("%s is a %s candidate\n", MHS[i].name , MHS[i].student.level.deg );
		}
   		printf ("%s %ld %.2f\n" , MHS[i].name , MHS[i].student.id , MHS[i].student.gpa );
		
	}


}  
