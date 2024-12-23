package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {

    private Deque<Task> taskQueue = new ArrayDeque<>();

    public void addTask(Task task) {
        taskQueue.offerFirst(task);
    }

    public int getRemainingTasks() {
        return taskQueue.size();
    }

    public void processNextTask() {
        taskQueue.pollLast().execute(); // 착각하면 안된다 pollLast() = FIFO
    }
}
