#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[10][10];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    int temp=a[0][i];
    for(j=1;j<r;j++)
    {
       if(a[j][i]>temp)
       {
         temp=a[j][i];
       }
    }
    cout<<temp<<"\n";
  }
}