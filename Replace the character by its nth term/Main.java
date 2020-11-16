#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{   
   char str[100], ch;  
   int len, element, i;   
   scanf("%s", str);   
   scanf("%d", &element);      
   ch = str[element-1];           
   for(i=0;str[i] != '\0'; i++)
	  str[i] = ch;   
   printf("%s",str);   
   return 0;
}