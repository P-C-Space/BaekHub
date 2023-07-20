import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static Set<Integer> know;
    static ArrayList<ArrayList<Integer>> member;

    public static void main(String[] args) throws IOException {
        // 거짓말
        // N 사람수
        // M 파티수
        // 각 파티마다 오는 사람의 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 사람 수
        int M = Integer.parseInt(st.nextToken()); // 파티 수

        st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken()); // 아는 사람 수
        know = new HashSet<>(); // 초기화
        for (int i = 0; i < number; i++) { // 아는 사람수 입력
            know.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<ArrayList<Integer>> party = new ArrayList<>(); // 파티 형식
        for (int i = 0; i < M; i++) {
            party.add(new ArrayList<>());
        }

        member = new ArrayList<>(); // 파티 멤버의 연관성 체크
        for (int i = 0; i <= N; i++) {
            member.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) { // 파티 횟수 만큼
            st = new StringTokenizer(br.readLine()); // 한줄 받고
            int temp_party_numbers = Integer.parseInt(st.nextToken()); // 사람 수 만큼
            for (int j = 0; j < temp_party_numbers; j++) { // 실행하여 저장
                party.get(i).add(Integer.parseInt(st.nextToken())); // 파티 저장 부분
            }

            for (int j = 0; j < temp_party_numbers; j++) { // 파티 멤버 연관관계 저장
                for (int k = j + 1; k < temp_party_numbers; k++) {
                    int person1 = party.get(i).get(j);
                    int person2 = party.get(i).get(k);
                    member.get(person1).add(person2);
                    member.get(person2).add(person1);
                }
            }
        }

        // for (int i = 1; i < member.size(); i++) { // 1 ~ 멤버의 크기 만큼
        //     System.out.print(i + " : ");
        //     for (int j = 0; j < member.get(i).size(); j++) {
        //         System.out.print(member.get(i).get(j) + " ");
        //     }      
        //     System.out.println();
        // }

        Set<Integer> tmp_set = new HashSet<>(know); // 임시 Set
        for (int k : tmp_set) {
            dfs(k);
        }

        //System.out.println(know);

        if (number == 0) {
            System.out.println(M);
        } else {
            int count = 0;
            for (int k = 0; k < M; k++) {
                Set<Integer> tmp = new HashSet<>(know); // 임시 Set
                tmp.retainAll(party.get(k)); // 교집합 생성
                if (tmp.isEmpty()) {
                    count++; // 교집합 없으면 과장 할 수 있다
                }
            }
            System.out.println(count);
        }

    }

    static void dfs_1(int person) {

        for (int i = 0; i < member.get(person).size(); i++) {
            Set<Integer> tmp = new HashSet<>(know); // 임시 Set
            tmp.retainAll(member.get(person)); // 교집합 생성
            if (!tmp.isEmpty()) { // 교집합이 있을 경우 삭제
                for (int k : tmp) {
                    int index = member.get(person).indexOf(k);
                    member.get(person).remove(index);
                }
            }

            if (member.get(person).isEmpty()) {
                return;
            }
            know.add(member.get(person).get(i));
            dfs(member.get(person).get(i));
        }

    }

     static void dfs(int person) {
        for (int friend : member.get(person)) {
            if (!know.contains(friend)) {
                know.add(friend);
                dfs(friend);
            }
        }
    }
}
