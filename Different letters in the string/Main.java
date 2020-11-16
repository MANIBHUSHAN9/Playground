#include <stdio.h>
#include <string.h>
int main()
{
  int i,j;
    char str1[50],str2[50];
    scanf("%s",str1);
    scanf("%s",str2);
    for(i=0, j=0;i<strlen(str1);i++)
    {
            if(str1[i]==str2[j])
            {
                j++;
            }
            else{
                printf("%c",str1[i]);   
            }     
    }
  	if(j==strlen(str1)){
		printf("NA");
  	}
    return 0;
}