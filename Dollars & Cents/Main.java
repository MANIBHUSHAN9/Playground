#include<iostream>
using namespace std;
int main()
{
  int d1,d2,d,c1,c2,c;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  if(c<100)
  {
    cout<<d<<"\n";
    cout<<c;
}
  else
  {
    c=c-100;
    d=d+1;
    cout<<d<<"\n";
    cout<<c;
  }
}