class RaindropConverter {

  String convert(int number) {
    return (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) ?
        (
            (number % 3 == 0 ? "Pling" : "") +
                (number % 5 == 0 ? "Plang" : "") +
                (number % 7 == 0 ? "Plong" : "")
        ) :
        String.valueOf(number);
  }

}
