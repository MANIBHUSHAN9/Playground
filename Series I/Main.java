#include<iostream>
using namespace std;
int main()
{
  int n;
  float m=0.5;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    cout<<m<<" ";
    m=m*3;
  }
}