package katas.kyu7;

import java.net.URL;
import java.util.HashMap;

public class URLTimestamps {
    public class UrlMap {
        HashMap<String, Long> map = new HashMap<>();

        public void setTimestamp(URL url, long timestamp) {
            map.put(url.toString(), timestamp);
        }

        public long getTimestamp(URL url) {
            return map.getOrDefault(url.toString(), -1L);
        }
    }
}
