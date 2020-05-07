#include<iostream>
int main()
{
  int n,h;
  std::cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
  for(int i = 1;i < n; ++i)
    {
       if(arr[0] < arr[i])
           arr[0] = arr[i];
    }
    std::cout << arr[0];
  
}