#include<iostream>
using namespace std;
int main()
{
float d,c;
  int a;
  cin>>a>>d;
  if(a>13)
  {
    if(d>=13.00 && d<14.00)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
    
}
  else
  {
    if(d>13.00 && d<14.00)
    {
       cout<<"$2.00";
      
    }
    else
    {
      cout<<"$4.00";
    }
  }
}