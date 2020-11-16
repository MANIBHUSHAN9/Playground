 #include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,x=0,t;
  cin>>r>>c;
  int a[10][10];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  int temp[50];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      temp[x++]=a[i][j];
    }
  }
  t=temp[0];
  for(i=0;i<x;i++){
      if(temp[i]>t){
          t=temp[i];
      }
  }
  cout<<"The maximum element is "<<t;
}