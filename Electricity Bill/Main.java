#include<iostream>
using namespace std;
int main()
{
  int n;
  int x;
  cin>>n;
  if(n<=200){
    x=n*0.5;
    cout<<"Rs."<<x;
  }
  else if(n>200&&n<=400){
    cout<<"Rs."<<(n*0.65)+100;
  }
  else if(n>400&&n<=600){
    cout<<"Rs."<<(n*0.8)+200;
  }
  else if(n>600){
    cout<<"Rs."<<(n*1.25)+425;
  }
  return 0;
}