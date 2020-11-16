#include<iostream>
#include<string.h>
using namespace std;
int main() 
{ 
char str[100],rev[100];
  cin.getline(str,20);
    int i;
  for(i=strlen(str)-1;i>=0;i--)
  {
    cout<<str[i];
}
}