#include<iostream>
int main(){
  int a,b,t;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  t=a;
  a=b;
  b=t;
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
  return 0;
}