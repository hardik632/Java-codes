import java.util.Stack;
public class CalculatePostFixExpresion{
    public static void evaluate(String exp){
        Stack<Integer>stack = new Stack<>();
        int result = 1;
        int len = exp.length();
        for(int i=0;i<len;i++){
            char c = exp.charAt(i);
            if(Character.isDigit(c)){
                int n = Character.getNumericValue(c);
                stack.push(n);
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^'){
                if(!stack.isEmpty()){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    switch(c){
                        case '+':
                            result = num2 + num1;
                            break;
                        case '-':
                            result = num2 - num1;
                            break;
                        case '*':
                            result = num2 * num1;
                            break;
                        case '/':
                            result = num2 / num1;
                            break;
                        case '^':
                            for(int j=0;j<num1;j++){
                                result = result * num2;
                            }
                    }
                    stack.push(result);
                }
                
            }
            else{
                System.out.println("Inavlid Expression");
            }
        }
        if(!stack.isEmpty()){
            System.out.println(stack.peek());
        }
    }
    public static void main(String []args){
        // String exp = "31+8*42/-";
        // String exp = "965-4*+21+/2/";
        String exp = "23^";
        evaluate(exp);
    }
}