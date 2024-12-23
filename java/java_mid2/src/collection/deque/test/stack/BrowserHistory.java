package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> stackBrowser = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String s) {
        if (currentPage != null) {
            stackBrowser.push(currentPage);
        }
        currentPage = s;
        System.out.println("방문: " + s);
    }

    public String goBack() {
        if (!currentPage.isEmpty()) {
            currentPage = stackBrowser.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
