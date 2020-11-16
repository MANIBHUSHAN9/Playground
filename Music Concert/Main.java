#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int *a;
  int n,i,even=0,odd=0;
  cin>>n;
  a=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
  if((*(a+i)%2)==0)
  {
    even++;
  }
  else
  {
    odd++;
  }
  }
  cout<<odd<<"\n"<<even;
  return 0;
}