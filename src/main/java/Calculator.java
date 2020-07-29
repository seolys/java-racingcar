import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public int plus(String input) {
        String[] split = input.split(" ");

        int result = 0;
        if (split.length > 2) result = Integer.parseInt(split[0]);
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (s.equalsIgnoreCase("+")) {
                result += Integer.parseInt(split[i+1]);
            }
        }
        return result;
    }

    public int minus(String input) {
        String[] split = input.split(" ");

        List<Integer> collect = Arrays.stream(split)
                .filter(e -> !e.equals("-"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return collect.get(0) - collect.get(1);
    }
}
