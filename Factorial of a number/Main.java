#include<iostream>
int main(){
  int n,i,k,f=1;
  std::cin>>n;
  k=n;
  for(i=1;i<n;i++){
    if(k>0){
    f=f*k;
    k--;
  }}
  std::cout<<f;
  return 0;
  
}