class Solution {
    public boolean isValid(String s) {
    Stack<Character> stk=new Stack<>();
    int i=0,len=s.length();
    while(i<len) {
        switch(s.charAt(i)){
            case '{' :stk.push('{'); break;
            case '[' : stk.push('[');break;
            case '(' : stk.push('('); break;
             case ')':
                    if(stk.isEmpty() || stk.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                        // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stk.isEmpty() || stk.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stk.isEmpty() || stk.pop() != '[')
                    {
                        return false;
                    }
                    break;
           
            default: break;
        }
        i++;
       
    } 
     return stk.isEmpty(); 
    }
}
