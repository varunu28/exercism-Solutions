import java.util.HashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        return phrase.chars()
            .mapToObj(c -> (char) c)
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .collect(
                Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
            .values()
            .stream()
            .noneMatch(v -> v > 1);
    }

}
