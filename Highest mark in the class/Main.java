#include<iostream>
using namespace std;
int main()
{
int n,i,k;
cin>>n;
int arr[n];
for(i=0;i<n;i++){
cin>>arr[i];
}
k=arr[0];
for(i=0;i<n;i++){
if(arr[i]>k){
k=arr[i];
}
}
cout<<k;
}