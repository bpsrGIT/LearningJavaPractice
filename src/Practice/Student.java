package Practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {
    String name;
    //ARRAY
//    private static Integer[] studentMark;
    //ARRAYLIST
    private ArrayList<Integer> studentMark = new ArrayList<Integer>();

    Student(String name, Integer... marks ){
        this.name = name;
        //ARRAY
//        studentMark = marks;
        //ARRAYLIST
        // cant define instances like array and you have to add them individually for arraylist
        for(Integer mark: marks) {
        	this.studentMark.add(mark);
        }
    }


	public Integer getNumberOfMarks(){
		//ARRAY
//        return studentMark.length;
        //ARRAYLIST
        //they dont have the methid .length. instead they use .size()
        return studentMark.size();
    }

    public Integer getTotalSumOfMarks() {
        Integer sum = 0;
        //ARRAY
//        for(int i = 0; i < studentMark.length; i++){
//            sum = sum + studentMark[i];
//        }
        //ARRAYLIST
        for(int i = 0; i < studentMark.size(); i++){
            sum += studentMark.get(i);
        }
        return sum;
    }

    public Integer getMaximumMark(){
    	//ARRAY
//        Integer max = Integer.MIN_VALUE;
//        for(Integer mark : studentMark){
//            if(mark>max){
//                max = mark;
//            }
//        }
        //ARRAYLIST
         Integer max = Collections.max(studentMark);
        return max;
    }

    public Integer getMinimumMark(){
    	//ARRAY
//        Integer min = Integer.MAX_VALUE;
//        for(Integer mark : studentMark){
//            if(mark<min){
//                min = mark;
//            }
//        }
    	//ARRAYLIST
         Integer min = Collections.min(studentMark);
        return min;
    }

    public BigDecimal getAverageMarks(){
        BigDecimal total = new BigDecimal(getTotalSumOfMarks());
        BigDecimal num = new BigDecimal(getNumberOfMarks());

        BigDecimal average = total.divide(num);
        return average;
    }
    
    void addNewMark(int mark) {
		studentMark.add(mark);
	}
    
    public String toString() {
    	return name + " " + studentMark;
    }
    
    void removeMarkAtIndex(int idx) {
		studentMark.remove(idx);
	}
    
}
