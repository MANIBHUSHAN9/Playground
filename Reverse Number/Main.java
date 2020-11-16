#include <iostream>
int main() 
{
int n,i,x=0;
  std::cin>>n;
  while(n>0){
    
    i=n%10;
    x=x*10+i;
    n=n/10;}
  std::cout<<x;
	return 0;
}