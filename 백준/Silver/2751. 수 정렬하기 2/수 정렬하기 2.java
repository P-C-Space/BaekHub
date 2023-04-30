import java.util.*;

public class Main {
    
    // 합병정렬 코드 직접 구현
    // public static int[] arr;
    // public static int[] temp;
    // // 데이터 위치 교체
    // public static void swap(int []arr, int x,int y){
    //     // data를 swap
    //     int tmp = arr[x];
    //     arr[x] = arr[y];
    //     arr[y] = tmp;
    // }

    // // 합병 정렬
    // // public static void MergeSort(int start,int end){
    // //     if(start < end){ // 하나로 쪼개 질 때까지
    // //         int mid = (start + end)/2;
    // //         MergeSort(start,mid); // 재귀 분할
    // //         MergeSort(mid+1,end);
    // //         Merge(start,mid,end); // 합병
    // //     }
    // // } 

    // public static void MergeSort(int[] arr, int start,int end){
    //     if(start < end){ // 하나로 쪼개 질 때까지
    //         int mid = start + (end - start) /2;
    //         MergeSort(arr,start,mid); // 재귀 분할
    //         MergeSort(arr, mid+1,end);
    //         Merge(arr, start,mid,end); // 합병
    //     }
    // } 

    // public static void Merge(int[] arr, int start, int mid, int end){
    //     int s = start;
    //     int m = mid+1;
    //     int idx = 0; // 인덱스
    //     temp = new int[end-start+1];
    //     while(s <= mid && m <= end){
    //         if(arr[s] <= arr[m]){
    //             temp[idx++] = arr[s++];
    //         }
    //         else{
    //             temp[idx++] = arr[m++];
    //         }
    //     }

    //     while(s <= mid){
    //         temp[idx++] = arr[s++];
    //     }

    //     while(m <= end){
    //         temp[idx++] = arr[m++];
    //     }

    //     for(int i = 0;i<=end;i++){
    //         arr[start+i] = temp[i];
    //     }

    // }

    // public static void main(String[] args){
    //     //  nlogn 이하인 시간복잡도 알고리즘은
    //     //  O(1) 해시 함수
    //     //  O(logN) 이진 탐색
    //     //  O(N) 순차 탐색
    //     //  O(NlogN) 퀵 정렬, 병합 정렬
    //     Scanner s = new Scanner(System.in);

    //     //  입력
    //     int N = s.nextInt();

    //     arr = new int[N];

    //     for(int i =0;i<N;i++){
    //         arr[i] = s.nextInt();
    //     }

    //     // 합병 정렬 사용
    //     MergeSort(arr, 0,N-1);

    //     for(int i =0;i<N;i++){
    //         System.out.println(arr[i]);
    //     }
    //     s.close();
    // }


    // 자바에서 제공하는 합병 정렬 코드 
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int N = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0;i<N;i++){
            arr.add(s.nextInt()); // 인자 받기
        }
        
        // Time sort 으로 정렬
        Collections.sort(arr);

        // 출력속도를 위한 StringBuilder 이용 값을 넣어주고 출력
        for(int num : arr){
            sb.append(num).append("\n");
        }

        System.out.println(sb);
        
        s.close();
    }
}
