#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,r,i;
  cin>>m>>n>>r;
  i=pow(m,n);
  if(i>=r)
  {
   cout<<"Doctor, you can proceed with your experiment.";
  }
  else
     cout<<"Sorry Doctor! You need more bacteria.";
}