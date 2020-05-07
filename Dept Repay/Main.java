#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  float d,e,f,g;
  std::cin>>a>>b>>c;
  d=a*b*c/100;
  e=a+d;
  f=d*2/100;
  g=e-f;
  std::cout<<d<<"\n"<<e<<"\n"<<f<<"\n"<<g;
  return 0;
}