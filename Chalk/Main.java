#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  b=int(a/(sqrt(a)));
  a=a+b;
  cout<<a+1;
}