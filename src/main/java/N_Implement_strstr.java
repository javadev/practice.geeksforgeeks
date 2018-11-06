public class N_Implement_strstr
{
    int strstr(String s, String x)
    {
        // if s is null or if s's length is less than that of x's
        if (s == null || x.length() > s.length()) {
            return -1;
        }

        // if x is null or is empty
        if (x == null || x.length() == 0) {
            return 0;
        }

        for (int i = 0; i <= s.length() - x.length(); i++)
        {
            int j;
            for (j = 0; j < x.length(); j++) {
                if (x.charAt(j) != s.charAt(i + j)) {
                    break;
                }
            }

            if (j == x.length()) {
                return i;
            }
        }

        return -1;

    }
}
