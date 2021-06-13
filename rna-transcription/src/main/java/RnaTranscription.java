import java.util.Map;
import java.util.stream.Collector;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<Character, Character> encoding = Map.of(
            'G', 'C',
            'C', 'G',
            'T', 'A',
            'A', 'U'
        );
        return dnaStrand.chars().mapToObj(c -> (char) c).map(encoding::get)
            .collect(
                Collector.of(
                    StringBuilder::new,
                    StringBuilder::append,
                    StringBuilder::append,
                    StringBuilder::toString
                ));
    }
}
