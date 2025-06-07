import java.util.*;

class StopWatch {
    private long startTime;
    private long endTime;

    StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void end(){
        endTime = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return endTime - startTime;
    }
}

class Test{
    public static void main(String [] args){

        int size = 100000;
        int[] number = new int[size];
        
        for(int i = 0; i < size; i++){
            number[i] = (int)(Math.random() * 100000);
        }

        StopWatch s1 = new StopWatch();

        s1.start();

        selectionSort(number, size);

        s1.end();

        System.out.println("Execution Time for Sorting 100,000 numbers is: " + s1.elapsedTime() / 1000 + " seconds");


    }

    public static void selectionSort(int number[], int size){
    for(int i = 0; i < size - 1; i++){
    int smallestIndex = i;

    for(int j = i+1; j < size - 1; j++){
       if (number[j] < number[smallestIndex]) {
        smallestIndex = j;
       }
    }

    int temp = number[i];
    number[i] = number[smallestIndex];
    number[smallestIndex] = temp;
}
    }
}