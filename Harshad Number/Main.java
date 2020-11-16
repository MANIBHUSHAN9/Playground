#include<iostream>
using namespace std;
int main()
{
  int a,b,s=0,d;
  cin>>a;
  d=a;
  while(a!=0)
  {
    b=a%10;
    s=s+b;
    a=a/10;
}
  if(d%s==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}