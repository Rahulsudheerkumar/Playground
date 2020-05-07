#include <iostream>
using namespace std;

int main() 
{
    int a;
    int n, r = 1;

    cout << "Enter the value of a"<<"\n";
    cin >>a;
    cout << "Enter the value of n"<<"\n";
    cin >>n;
    cout<<"The value of "<<a<<" power "<<n<<" is ";

    while (n!= 0) {
        r *= a;
        --n;
    }

    cout << r;
    
    return 0;
}