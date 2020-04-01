import java.util.Stack;
class PreFixToInfix{
    public static void main( String[] args){
        // String exp = "31+8*42/-";
        // String exp = "965-4*+21+/2/";
        String exp = "+23";
        // String exp = "/*-426+21";
        evaluate(exp);
    }
    public static void evaluate( String str)
    {
        Stack<Character>stack = new Stack<>();
        Stack<Character>stack2 = new Stack<>();
        for(int i = str.length()-1; i>=0; i--)
        {
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                // int n = Character.getNumericValue(c);
                stack.push(c);
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
                if(!stack.isEmpty()){
                    char num1 = stack.pop();
                    char num2 = stack.pop();
                    switch(c){
                        case '+':
                            stack.push(num1);
                            stack.push('+');
                            stack.push(num2);
                            break;
                        case '-':
                            stack.push(num1);
                            stack.push('-');
                            stack.push(num2);
                            break;
                        case '*':
                            stack.push(num1);
                            stack.push('*');
                            stack.push(num2);
                            break;
                        case '/':
                            stack.push(num1);
                            stack.push('/');
                            stack.push(num2);
                            break;
                        case '^':
                            stack.push(num1);
                            stack.push('^');
                            stack.push(num2);
                            break;
                    }
                }
            }     
        }
        if(!stack.isEmpty()){
            stack2.push( stack.pop());
        }
        if(!stack2.isEmpty()){
            System.out.print( stack2.peek());
            stack2.pop();
        }
    }
}