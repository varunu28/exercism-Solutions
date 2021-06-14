class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < this.phrase.length()) {
            while (!Character.isLetter(this.phrase.charAt(idx))) {
                idx++;
            }
            sb.append(Character.toUpperCase(this.phrase.charAt(idx++)));
            while (idx < this.phrase.length() &&
                this.phrase.charAt(idx) != ' ' && this.phrase.charAt(idx) != '-') {
                idx++;
            }
        }
        return sb.toString();
    }

}
