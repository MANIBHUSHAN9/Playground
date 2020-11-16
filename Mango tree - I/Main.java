#include<iostream>
using namespace std;
int main()
{
  int r,c,t;
  cin>>r>>c>>t;
  int total = r * c; 
  //int tree = t - 1;
  if (r>=0 && c>=0) {
    if(t<=c || t % c == 0 || (t - 1) % c == 0) {
      cout<<"Yes";
    }
    else {
      cout<<"No";
    }
  }
}