#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=11;i<=11+(4*(n-1));i=i+4)
  {
    cout<<i*i<<" ";
  }
}