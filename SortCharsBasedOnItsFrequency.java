class SortCharsBasedOnItsFrequency{
    public String frequencySort(String s) {

       Map<Character, Long> freq = s.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       String sortedChars = s.chars()
       .mapToObj(e-> (char)e)
       .sorted(Comparator.naturalOrder())
       .sorted(Comparator.comparing( e-> freq.get(e)).reversed())
       .map(e->String.valueOf(e))
       .collect(Collectors.joining());
    return sortedChars;

        
    }
}