#include <stdio.h>
union status
{
  int rank ;
  char deg[4] ;
} ;
struct personal
{
  long id ; float gpa ;
  union status level ;
} ;

struct identity
{
  char name[30] ;
  struct personal student ; 
} ; 

int main( )
{ struct identity jb = {"Joe Brown"}, *ptr = &jb;
	struct identity Mhs[5];
	Mhs[0] = jb;
	printf(Mhs[0]);
   char u_g;
   Mhs[0].student.id = 123456789 ;
   Mhs[0].student.gpa = 3.4 ;
   printf ("Enter student status - u or g\n");
   scanf ("%c", &u_g);
   if (u_g == 'u')
     { printf ("Enter rank -- 1, 2, 3, 4 or 5\n");
       scanf ("%d", &Mhs[0].student.level.rank);
       printf ("%s is level %d\n" , Mhs[0].name , Mhs[0].student.level.rank);
     }
    else   
   {  printf ("Enter degree sought -- ms or phd\n");
      scanf ("%s", &Mhs[0].student.level.deg);
      printf ("%s is a %s candidate\n", Mhs[0].name , Mhs[0].student.level.deg );
   } /* End of else statement */
   printf ("%s %ld %f\n" , Mhs[0].name , Mhs[0].student.id , Mhs[0].student.gpa );
   printf ("%s%ld %f\n" , ptr->name , ptr->student.id ,ptr->student.gpa );
}
