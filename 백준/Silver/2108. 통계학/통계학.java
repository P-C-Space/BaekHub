
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int N = Integer.parseInt(bufferedReader.readLine());

        int median, mode, range;
        Map<Integer, Integer> numbers = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        int maxMode = 0;
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(bufferedReader.readLine());
            list.add(number);
            sum += number;
            numbers.put(number, numbers.getOrDefault(number, 0) + 1);
            maxMode = Math.max(maxMode, numbers.get(number));
        }

        // 산술평균 (소수점 첫째 자리 반올림)
        stringBuilder.append(Math.round((double) sum / N)).append("\n");

        // 중앙값
        Collections.sort(list);
        median = list.get(N / 2);
        stringBuilder.append(median).append("\n");

        // 최빈값 찾기
        List<Integer> maxModeList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() == maxMode) {
                maxModeList.add(entry.getKey());
            }
        }
        Collections.sort(maxModeList);
        mode = (maxModeList.size() > 1) ? maxModeList.get(1) : maxModeList.get(0);
        stringBuilder.append(mode).append("\n");

        // 범위
        range = list.get(N - 1) - list.get(0);
        stringBuilder.append(range).append("\n");

        System.out.println(stringBuilder);
    }
}