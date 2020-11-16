#include<iostream>
using namespace std;
int main()
{
  int n,i,sumeven=0,sumodd=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
}
  for(i=0;i<n;i++)
  {
    if(arr[i]%2)
    {
      sumeven=sumeven+arr[i];
    }
    else
    {
      sumodd=sumodd+arr[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sumodd<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<sumeven;
}