#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int x1=3,y1=4;
  int x,y,l,j,k;
  cin>>x>>y;
  k=(x-x1)*(x-x1);
  j=(y-y1)*(y-y1);
  l=sqrt(k+j);
  cout<<l;
  return 0;
}