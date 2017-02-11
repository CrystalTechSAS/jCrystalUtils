package jcrystal.json;

import java.util.Comparator;

/**
 * Created by G on 11/13/2016.
 */
public enum JsonLevel{
    ID(0), MIN(1), BASIC(2), NORMAL(3), DETAIL(4), FULL(5), NONE(Integer.MAX_VALUE);
    public final int level;
    JsonLevel(int level){
        this.level = level;
    }
    public String baseName(){
        return name().substring(0,1)+name().substring(1).toLowerCase();
    }
    public static Comparator<JsonLevel> nullComparator = new Comparator<JsonLevel>() {
        @Override
        public int compare(JsonLevel o1, JsonLevel o2) {
            if(o1 == o2)return 0;
            if(o1 == null)return -1;
            if(o2 == null)return 1;
            return o1.compareTo(o2);
        }
    };
}
