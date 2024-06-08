import java.util.HashMap;

class Logger {
    HashMap<String,Integer> map = new HashMap<>();
    public Logger() {
        map = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message) || map.get(message) <= timestamp){
            map.put(message,timestamp+10);
            return true;
        }
        return false;
    }
}