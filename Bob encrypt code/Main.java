#include <stdio.h>
#include<math.h>
int main()
{
  int s,n,m,i,j;
  scanf("%d %d %d",&s,&n,&m);
  i=pow(s,n);
  i=i%10;
  j=pow(i,m);
  j=j%1000000007;
  
  printf("%d",j);
   return 0;
}