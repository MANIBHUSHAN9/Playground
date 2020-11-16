#include<iostream>
using namespace std;
int max(int arr[],int m){
   int temp=arr[0],k=0;
  for(int i=0;i<m;i++){
    if(arr[i]>temp){
      temp=arr[i];
      k++;
    }
  }
  return k;
}
int main()
{
  int r,c,i,j,x=0,t,row[10],column[10],sum,y=0,r1,c1;
  cin>>r>>c;
  int a[10][10];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++){
      sum=0;
    for(j=0;j<c;j++){
      sum=sum+a[i][j];
    }
    row[x++]=sum;
  }
  cout<<"Sum of rows is ";
  for(i=0;i<x;i++){
    cout<<row[i]<<" ";
  }
  cout<<"\n";
  r1=max(row,x);
  cout<<"Row "<<r1+1<<" has maximum sum"<<"\n";
    for(i=0;i<r;i++){
        sum=0;
    for(j=0;j<c;j++){
      sum=sum+a[j][i];
    }
    column[y++]=sum;
  }
  cout<<"Sum of columns is ";
  for(i=0;i<y;i++){
   cout<<column[i]<<" ";
  }
  cout<<"\n";
  c1=max(column,y);
  cout<<"Column "<<c1+1<<" has maximum sum";
}