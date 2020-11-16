#include<iostream>
using namespace std;
int main()
{
  int a,b,e,o;
  cin>>a;
  while(a>0)
  {
    b=a%10;
    if(b%2==0)
      e=e+b;
    else
      o=o+b;
    a=a/10;
  }
  if(e==o)
    cout<<"Yes";
  else
    cout<<"No";
}