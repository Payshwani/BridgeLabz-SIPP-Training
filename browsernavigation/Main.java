import java.util.Scanner;

class Node {
    String url;
    Node prev, next;
    Node(String url) { this.url = url; }
}

class Browser {
    Node current;

    void visit(String url) {
        Node node = new Node(url);
        if (current != null) {
            current.next = null;
            node.prev = current;
            current.next = node;
        }
        current = node;
    }

    void back() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    void forward() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void show() {
        System.out.println(current != null ? current.url : "No page");
    }
}

public class Main {
    public static void main(String[] args) {
        Browser b = new Browser();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String cmd = sc.nextLine();
            if (cmd.equals("exit")) break;
            if (cmd.startsWith("visit")) b.visit(cmd.split(" ")[1]);
            else if (cmd.equals("back")) b.back();
            else if (cmd.equals("forward")) b.forward();
            else if (cmd.equals("current")) b.show();
        }
    }
}
