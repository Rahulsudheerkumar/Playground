// C++ program to find maximum number of 
// handshakes. 
#include<iostream> 
using namespace std; 


int maxHandshake(int n) 
{ 
return (n * (n - 1))/ 2; 
} 

// Driver Code 
int main() 
{ 
int n; 
  cin>>n;
cout << maxHandshake(n) <<endl; 

return 0; 
} 
