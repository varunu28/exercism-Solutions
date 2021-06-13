import java.util.stream.Collectors;

public class PangramChecker {
    public boolean isPangram(String input) {
        return input.chars().mapToObj(c -> (char) c)
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .collect(Collectors.toSet()).size() == 26;
    }
}
