import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
            String text = "functional style aboriginal dictionary generator";

            Function<String, List<String>> function = a -> Arrays.stream(a.split(" "))
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList());
            function.apply(text)
                    .forEach(System.out::println);
    }
}
// Программа написана в функциональном стиле.
// На это указывает реализация функционального интерфейса Function,
// и монады в виде Stream API.