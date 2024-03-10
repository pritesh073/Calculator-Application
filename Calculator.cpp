#include <iostream>

using namespace std;

int main()
{
    int number1,number2,result;
    char op;
    cout<<"welcome to simple calculator";
    cout<<"enter an operation(+,-,*,/):";
    cin>>op;
    
    cout<<"Enter first number";
    cin>>number1;
    
    cout<<"Enter second number";
    cin>>number2;
    switch(op)
    {
        case '+':
        result=number1+number2;
        cout<<"result"<<result;
        break;
        
        case'-':
        result=number1-number2;
        cout<<"result"<<result;
        break;
        
        case '*':
        result=number1*number2;
        cout<<"result"<<result;
        break;
        
        case'/':
        result=number1/number2;
        cout<<"result"<<result;
        break;
    }

    return 0;
}


