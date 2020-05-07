#include<iostream>
int main()
{
int a,b,c,m;
  std::cout<<"Enter first number :";
  std::cin>>a;
  std::cout<<" Enter second number :";
  std::cin>>b;
  std::cout<<" Menu"<<"\n"<<"1.Addition"<<"\n"<<"2.Subtraction"<<"\n"<<"3.Multiplication"<<"\n"<<"4.Division"<<"\n"<<"5.Remainder"<<"\n";
  std::cin>>m;
  switch(m)
  {
      
    case 1:
      c=a+b;
      std::cout<<c;
      break;
    case 2:
      c=a-b;
      std::cout<<c;
      break;
    case 3:
      c=a*b;
      std::cout<<c;
      break;
    case 4:
      c=a/b;
     std::cout<<c;
      break;
    case 5:
      c=a%b;
      std::cout<<c;
      break;
    default:
     std::cout<<"Invalid operation";
      break;  
      
  }
  return(0);
}