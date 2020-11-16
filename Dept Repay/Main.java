#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,d,f,a;
  std::cin>>p>>r>>t;
  i=(p*r*t)/100;
  a=p+i;
  d=i/50;
  f=a-d;
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;
  return 0;
  //Type your code here.
}