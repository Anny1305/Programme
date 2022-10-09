import java.util.*;

public class Sample {
    // output
    // l:3, o:2, d:1, e:1, h:1, w:1
    public static void main(String[] args) {

        String str = "helloworld";
        List<Word> wrd = new ArrayList<>();

        Map<Character,Integer> mp = new HashMap<>();
        for (int i =0; i< str.length(); i++){
            mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> entry: mp.entrySet()){
            Word w = new Word(entry.getKey(), entry.getValue());
            wrd.add(w);
        }

        System.out.println(wrd);

        Collections.sort(wrd, new Comparator<Word>() {
            @Override
            public int compare(Word w1, Word w2) {
                if (w1.count == w2.count){
                    return w1.ch-w2.ch;
                }

                return w2.count-w1.count;

            }
        });
        System.out.println(wrd);
    }
}
class Word{

    char ch;
    int count;

    public Word(char ch, int count) {
        this.ch = ch;
        this.count = count;
    }

    @Override
    public String toString() {
        return  ch+":"+ count;
    }
}
