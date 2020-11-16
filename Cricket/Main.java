#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int a,d,p;
  float b,c,w,r,q,o,s,t;
  cin>>a>>b>>c>>d;
  o=a/6;
  cout<<o<<"\n";
  p=d/6;
  r=d%6;
  w=r/10;
  q=p+w;
  cout<<fixed<<setprecision(1)<<q<<"\n";
  s=c/q;
   cout<<fixed<<setprecision(1)<<s;
  t=b/o;
   cout<<"\n"<<fixed<<setprecision(1)<<t<<"\n";
  if(s<t)
    cout<<"Not Eligible to Win";
  else
    cout<<"Eligible to Win";
  
}