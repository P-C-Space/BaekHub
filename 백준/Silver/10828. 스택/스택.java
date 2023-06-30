import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Stack{
    private List<Integer> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void push(int x){
        stack.add(x);
    } 

    public int pop(){
        if(isEmpty()){
            return -1; // 스택이 비어있음
        }
        return stack.remove(stack.size() - 1);
    }

    public int top(){
        if(isEmpty()){
            return -1;
        }
        return stack.get(size()-1);
    }

    public int size(){
        return stack.size();
    }
}

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();

        int i_command_count = 0;
        i_command_count = Integer.parseInt(br.readLine());



        for(int i = 0;i<i_command_count;i++){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push":
                stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(stack.pop()).append("\n");
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "top":
                    sb.append(stack.top()).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
