#include<iostream>
using namespace std;
int main()
{
  int a,b,sum=0;
  cin>>a;
  cin>>b;
  for(int j=a;j<b;j++)
  {
    sum=0;
    for(int i=1;i<j;i++)
      if(j%i==0)
        sum +=i;
    if(sum==j)
      cout<<j<<" ";
  }
}