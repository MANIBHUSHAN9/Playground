#include <stdio.h>
#include<string.h>
int main()
{
 char s[100];
  int i,j,len,si,ei;
  gets(s);
  len=strlen(s);
  ei=len-1;
  for(i=len-1;i>=0;i--){
    if(s[i]== ' ' ||i==0){
      if(i==0){
        si=0;
      }
      else{
        si=i+1;
          }
        for(j=si;j<=ei;j++){
          printf("%c",s[j]);
        }
      
      ei=i-1;
    printf(" ");
    }
  }
   return 0;
}