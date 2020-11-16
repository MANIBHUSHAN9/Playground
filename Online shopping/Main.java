#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fc,sa,sd,sc,aa,ad,ac,f,s,a;
  cin>>fa>>fd>>fc>>sa>>sd>>sc;cin>>aa>>ad>>ac;
  int d1,d2,d3;
  d1=100-fd;
  d2=100-sd;
  d3=100-ad;
  f=((fa*d1)/100)+fc;
  s=((sa*d2)/100)+sc;
  a=aa*d3/100+ac;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if(f<s&&f<a){
    cout<<"He will prefer Flipkart";
  }else if(s<f&&s<a){
    cout<<"He will prefer Snapdeal";
  }
  else if(a<s&&a<f){
    cout<<"He will prefer Amazon";
  }else {
    cout<<"He will prefer Flipkart";
    return 0;}
}
