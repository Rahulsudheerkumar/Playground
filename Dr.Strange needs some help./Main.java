#include<iostream>
int main()
{
int a,b,c;
    int result = 1;
  std::cin>>a>>b>>c;
while (a != 0)
{
        result *= b;
        --a;
}
  if(c<result)
  {
   std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else 
  {
   std::cout<<"Sorry Doctor! You need more bacteria.";
  }

}