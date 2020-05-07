#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 float x1,y1,x2,x3,y2,y3;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  float a = (x1 + x2 + x3) / 3;  
  float b = (y1 + y2 + y3) / 3;  
  cout<< (x1 + x2 + x3) / 3 << "\n" << (y1 + y2 + y3) / 3 <<"\n";
}