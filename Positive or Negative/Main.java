#include<iostream>
using namespace std;
int main()
{
  int x;
  std::cin>>x;
  if(x<0)
  {
    std::cout<<x<<" is a negative number.";
  }
  else
  {
  std::cout<<x<<" is a positive number.";
  }
}