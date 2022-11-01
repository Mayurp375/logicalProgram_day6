public class stopWatch {

    public static void Stopwatch() {
        Stopwatch stopwatch = new Stopwatch();
        System.out.println("press 1 to start the stopWatch");
        stopwatch.start();

        Stopwatch endtime = new Stopwatch();
        System.out.println("press 2 to stop time");
        endtime.end();

        float time = stopwatch.elapsedTime;
        System.out.println("this is time :" + time);
    }


}

class Stopwatch {
    public float StartTime = 0;
    public float EndTime = 0;
    public float elapsedTime = 0;

    public void start() { //This count for start time
        StartTime = System.currentTimeMillis();
        System.out.println("Start time is :" + StartTime);

    }

    public void end() { //this is count for end time
        EndTime = System.currentTimeMillis();
        System.out.println("End time is :" + EndTime);
    }

    public float getElapsed() { //this is for measurement of start time and end time
        elapsedTime = StartTime - EndTime;
        return elapsedTime;
    }
}