#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  cin>>r>>c;
  int a[10][10];
for(i=0;i<r;i++){
for(j=0;j<c;j++){
cin>>a[i][j];
  } }
for(i=0;i<r;i++){
  int temp=a[i][0];
  for(j=1;j<c;j++){
       if(a[i][j]>temp)
       {
         temp=a[i][j];
       }
    }
    cout<<temp<<"\n";
  }
}