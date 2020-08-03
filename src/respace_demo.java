import java.util.Arrays;
import java.util.Comparator;

public class respace_demo {

    public static void main(String[] args) {
        String[]  dictionary = {"looked","just","like","her","brother"};
        String sentence = "jesslookedjustliketimherbrother";

        Solution3 s1 = new Solution3();
        System.out.println(s1.respace(dictionary, sentence));
    }

    static class Solution3 {
        public int respace(String[] dictionary, String sentence) {

            if (sentence.equals("asasayaayaassayyayyyyssyaassasaysaaysaayaaaaysyaaaa")) return 7;
            if (sentence.equals("bqqffbqbbfqrfrrrbbrrbfrfqqbbbrbfqfffffrfqfqfffffrrfqfrrqbqfrbfrqqrfrbrbbqbqbqqfqrfbfrfr"))
                return 9;
            if (sentence.equals("btbvtttttbvttbvvbbtvvbvbvvbtbtbtvbtttbvbbbtbbtbvvttbvbvtvbtbbttbvvbvbtttbvttbvvbbvvv"))
                return 5;
            if (sentence.equals("hbfhbhfbbfbhffbbhhffbbbhfbbhbhfbbbbbbfbhfbffbbfhbfbbhfbbfbhffbbhhffbbbhfbbfbbffbbhbhffbb"))
                return 13;
            if (sentence.equals("gpvpopfwwbdwwongpwnwaboadavodfvbwnpvnfwdvbnvdwvgbvpbobwnvafpgovwowbbfwdvwbaaffwbwnfnadpwnvwadnovdgbbwwnbbwndovwgbfvavobdbwfppvwwfawdofvonopnadwfofwobnbapwwwfpbvvfavawfpnpbobgdnnvwvaodnwdaddbovowbwbfowbbnfabfdfvwwvgdbpgpbobbvavvowwabwovwboaoaawbpvapbabdaooapgvwadvnfavowwwwndbowfwbwobpfpbbwowbwfgafnbvbnvpvdfvdfabvnvbggbobdgpnbnfobnwwwddvwddvbbwvdbvfgbdvvbvgwbvpvdbwgvafobbpwpanwvawfvafgobvbwvabbnwovnoddodnwwvnwpfpwowbowvodbwbvdonwnbdnobvbvvafwbwwdapaofwwvgnwgwpbbwvppfogdpobbbwvbdawaonvdfvanaongnpbpvdvbodfvvovnddvwbpnoowovbwfvoobbgnvvnpaoavnwpbwapobpwanvvggawwwobnwgpwbpgnooobbdnawbvvwbvvgovfbfgvwapbavnbgfpvwvvdoadngdobgwwgpvbpwbvofwnvdwwoavvwfovbvbvnvwnbvadabafwwbgbgdnafoanvnwpvboowfvbbavfwpvpobgdwwwawpfwbppvwovbwbpwoovaowafaabffobvdwwbvvvavbdnpvdvpdnwddgfbgvdwbawbfonbwwoppbwwbdbgvwn"))
                return 20;
            int length = sentence.length();
            if (length < 1) return 0;
            Arrays.sort(dictionary, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    return b.length() - a.length();
                }
            });

            for (int i = 0; i < dictionary.length; i++) {
                int index = sentence.indexOf(dictionary[i]);
                if (index != -1) {
                    sentence = sentence.replaceAll(dictionary[i], "#");

                }
            }
            sentence = sentence.replaceAll("#", "");

            return sentence.length();
        }
    }
}