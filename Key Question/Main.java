#include <stdio.h>
int main()
{
   int n,a[10],i=0,j,k;
  scanf("%d",&n);
  while(n){
    a[i++]=n%10;
    n=n/10;
  }
  for(j=0;j<i;j++){
    for(k=j+1;k<i;k++)
    {
      int temp;
      if(a[j]>a[k]){
        temp=a[j];
        a[j]=a[k];
        a[k]=temp;}
    }
  }
  for(k=0;k<i;k++){
    printf("%d ",a[k]);
  }
        
        return 0;
}