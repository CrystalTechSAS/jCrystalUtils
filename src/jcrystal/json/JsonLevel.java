package jcrystal.json;

import java.util.ArrayList;
import java.util.Comparator;

/**
* Created by G on 11/13/2016.
*/
public enum JsonLevel{
	ID(0), MIN(1), BASIC(2), NORMAL(3), DETAIL(4), FULL(5), TOSTRING(-1), NONE(Integer.MAX_VALUE), DEFAULT(Integer.MAX_VALUE);
	public static final JsonLevel[] managedValues;
	static {
		ArrayList<JsonLevel> temp= new ArrayList<>();
		for(JsonLevel l : values())if(l.autoManaged)temp.add(l);
		managedValues = temp.toArray(new JsonLevel[temp.size()]);
	}
	public final int level;
	public final boolean autoManaged;
	JsonLevel(int level){
		this.level = level;
		autoManaged = this.level >= 0 && this.level < Integer.MAX_VALUE;
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
			return Integer.compare(o1.level, o2.level);
		}
	};
}
