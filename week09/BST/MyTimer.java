public class MyTimer
{
    private long startTime, endTime;
    
    public void start() {
        // Try to force a run of the garbage collector so it doesn't
        // happen while we are timing.  You aren't expected to understand
        // the next two lines.
        System.gc();
        System.runFinalization();
        
        startTime = System.currentTimeMillis();
    }
    
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    
    public int elapsed() {
        return (int)(endTime - startTime);
    }
    
    public double elapsedSeconds() {
        return (double)(endTime - startTime)/1000;
    }
}