#include<iostream>
using namespace std;
int main()
{
  int n,i,k,found=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
}
  cin>>k;
  for(i=0;i<n;i++)
  {
    if(arr[i]==k)
    {
      found=1;
    }
  }
  if(found==1)
  {
    cout<<"She passed her exam";
  }
  else
    cout<<"She failed";
}