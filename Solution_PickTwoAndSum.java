import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Solution_PickTwoAndSum {
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();
        String arrays[] = input.split(", ");
        numbers = new int[arrays.length];
        for (int i = 0; i < arrays.length; i++) {
            numbers[i] = Integer.parseInt(arrays[i]);
        }
        int n = numbers.length;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                if (!result.contains(sum)) {
                    result.add(sum);
                }
            }
        }
        result.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 -o2;
            }
        });

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return;
    }
}
