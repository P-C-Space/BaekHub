import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Queue{
    private LinkedList<Integer> queue;

    public Queue(){
        queue = new LinkedList<>();
    }

    public void push_queue(int x){
        queue.addLast(x);
    }

    public int pop_queue(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.removeFirst();
    }

    public int size_queue(){
        return queue.size();
    }

    public boolean empty_queue(){
        return queue.isEmpty();
    }

    public int front_queue(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.getFirst();
    }

    public int back_queue(){
        if(queue.isEmpty()){
            return -1;
        }
        return queue.getLast();
    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int i_command_count = Integer.parseInt(br.readLine());

        Queue q = new Queue();

        for(int i =0;i<i_command_count;i++){
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push":
                    q.push_queue(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(q.pop_queue()).append("\n");
                    break;           
                case "size":
                    sb.append(q.size_queue()).append("\n");
                    break;
                case "empty":
                    if(q.empty_queue()){
                        sb.append(1).append("\n");
                    }
                    else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    sb.append(q.front_queue()).append("\n");
                    break;
                case "back":
                    sb.append(q.back_queue()).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}
