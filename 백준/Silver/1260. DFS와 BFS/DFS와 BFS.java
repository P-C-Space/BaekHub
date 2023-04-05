import java.util.*;

public class Main {

    // 간선 List
    public static ArrayList<Integer>[] link;

    private static Queue<Integer> queue; // Bfs 큐

    public static boolean[] visit_check;

    public static int N; // 정점의 개수
    public static int M; // 간선의 개수
    public static int V; // 정점을 시작할 번호

    public static void Dfs(int begin){
        visit_check[begin] = true;
        System.out.print(begin + 1 + " ");

        for (int i = 0;i<link[begin].size();i++){
            if(!visit_check[link[begin].get(i)]){
                Dfs(link[begin].get(i));
            }
        }
    }


    public static void Bfs(int begin){
        queue = new LinkedList<Integer>();
        queue.offer(begin);

        visit_check[begin] = true;
        System.out.print(begin+1 + " "); // V 시작

        while(!queue.isEmpty()){
            int tmp = queue.poll();

            for(int i = 0; i < link[tmp].size();i++){
                if(!visit_check[link[tmp].get(i)]){ // 방문하지 않았다면
                    queue.offer(link[tmp].get(i)); // 큐에 저장
                    visit_check[link[tmp].get(i)] = true; // 방문 기록
                    System.out.print(link[tmp].get(i)+1 + " "); // +1 출력
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        N = s.nextInt();
        M = s.nextInt();
        V = s.nextInt(); 
        visit_check = new boolean[N]; // false 로 초기화

        link = new ArrayList[N];

        // 이차원 배열
        for(int i = 0;i<N;i++){
            link[i] = new ArrayList<Integer>();
        }
        
        // 간선 저장
        for (int i = 0; i<M;i++){
            int A = s.nextInt()-1;
            int B = s.nextInt()-1;
            link[A].add(B);
            link[B].add(A);
        }

        // 정렬
        for (int i = 0;i<N;i++){
            Collections.sort(link[i]);
        }

        // 간선 확인
        // for(int i =0;i<N;i++){
        //     for(int j = 0;j<link[i].size();j++){
        //         System.out.print(link[i].get(j));
        //     }
        //     System.out.println();
        // }

        Dfs(V-1); // dfs 호출

        System.out.println(); // 줄바꿈
        visit_check = new boolean[N]; // false 로 초기화

        Bfs(V-1); // bfs 호출

        s.close();
    }
}
