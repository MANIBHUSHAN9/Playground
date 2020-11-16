#include<iostream>
using namespace std;
int main()
{
  int n,n1,n2,sum=0;
  cin>>n1;
  cin>>n2;
  n=n1+n2;
  for(int i=1;i<n;i++)
    if(n%i==0)
      sum +=i;
  if(sum==n)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}