#include<iostream>
using namespace std;
int main()
{
  int n,i,k,loc;
  std::cout<<"Enter the number of elements in the array"<<"\n";
  std::cin>>n;
  int arr[n];
  std::cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<n;i++){
    std::cin>>arr[i];
  }
  std::cout<<"Enter the location where you wish to insert an element"<<"\n";
  std::cin>>loc;
  if(loc>n+1 || loc<=0){
   cout<<"Invalid Input";
  }
  else{
  std::cout<<"Enter the value to insert"<<"\n";
  std::cin>>k;
  std::cout<<"Array after insertion is"<<"\n";
  for(i=n-1;i>=loc-1;i--){
    arr[i+1]=arr[i];  
  }
  arr[loc-1]=k;
  for(i=0;i<=n;i++){
   std::cout<<arr[i]<<"\n";
  }
  }
}