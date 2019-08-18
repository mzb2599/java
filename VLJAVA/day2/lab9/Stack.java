class Stack
{
    int stack=new int st[10];
    int top
Stack()
{
    top=-1;
}
void push(int val){
    int i;
    if(top==9)
    {
        System.out.println("Stack is full");
    }
    else
        System.out.println("Enter the value to push in the Stack");
        for ( i = 0; i < 10; i++) {
          st[++top]=val;  
        }
}
int pop(){
    if(top==-1)
    System.out.println("Stack is empty");
    return 0;
    else{
        val=st[top--]
    }
}
void display(int n)
{
    System.out.println("Elements in stack are :");
    for ( i = 0; i < n; i++) {
    System.out.print(st[i] +"\t");    
    }
}
}