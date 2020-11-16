#include<iostream>
using namespace std;
int main()
{
  int row,column,i,j,m[10][10];
  cin>>row>>column;
  for(i=0;i<row;i++)
  {
    for(j=0;j<column;j++)
    {
        std::cin>>m[i][j];
    }
  }
  for(i=0;i<column;i++)
  {
    for(j=0;j<row;j++)
    {
        std::cout<<m[j][i]<<" ";
    }
    cout<<"\n";
  }
}