#include<iostream>
int main()
{
   int a,b,c,d,e,f;
   std::cin>>a>>b>>c>>d;
  e=a+c;
  f=b+d;
  if(f>100)
  {
  f=f-100;
    e=++e;
  }

   std::cout<<e<<"\n"<<f;

}