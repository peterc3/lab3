import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;
public class WebScraper {

    public static void main(String[] arg) {
        String hamlet = (urlToString("http://erdani.com/tdpl/hamlet.txt"));
        String chart = (urlToString("https://www.bls.gov/tus/charts/chart9.txt"));
        String forecast = (urlToString("http://tgftp.nws.noaa.gov/data/raw/fz/fzus53.klot.srf.lot.txt"));

        System.out.println(wordCount(chart));

    }

    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static int wordCount(String text) {
        int count = 0;
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == ' ' || arr[i + 1] == ' ') {
                count++;
            }
        }
        return count;
    }

    public static int oneWord(String target, String text) {
        char[] arr = text.toCharArray();
        int count = 0;



        return count;
    }

}
