#include <iostream>

int main ()
{
    int ans,n,c;
         c=0;
    std::cin >>n;
       ans=n;
  std::cout<<n<<"\n";
    while ( ans != 1 )
    {
        if ( ans % 2 == 1)
            ans = (3 * ans) + 1;
                 
        else
            ans /= 2  ;
            
    
    std::cout <<ans << "\n";
      c=c+1;
      
    }
     std::cout<<c;
    return 0;
}