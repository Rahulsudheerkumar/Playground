#include<iostream>
using namespace std;
int main()
{
  int a;
  float c,b;
  cin>>a>>b;
  c=b;
  if(a==2){
    c=(0.5*b)+b;
    cout<<c;}
  else if(a==3)
  {
    c=2*b;
    cout<<c;}
  else if(a>3)
  {
    cout<<"Number of items is more";
  }
  if(a==1)
    cout<<b;
}