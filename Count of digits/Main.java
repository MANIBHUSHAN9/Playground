#include<iostream>
int main()
{
  using namespace std;
  long long int n,i=0;
  cin>>n;
  do 
  {
    i=i+1;
    n=n/10;
}
  while(n>0);
  cout<<i;
}