package BasicDSA;

import java.util.ArrayList;
import java.util.List;

class MyCalendar1 {
    List<int[]> intervals;


    public MyCalendar1() {
        intervals = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {
        if(intervals.size()<=0){
            intervals.add(new int[]{startTime,endTime});
        }else{
            for(int[] interval: intervals){
                if(startTime<interval[1]) return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */
