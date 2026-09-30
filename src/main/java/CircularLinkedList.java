public class CircularLinkedList {

        private class Node {
            Object data;
            Node next;

            Node(Object data) {
                this.data = data;
            }
        }

        private Node dummy;

        public CircularLinkedList() {
            dummy = new Node(null);
            dummy.next = dummy;
        }

        public void addItem(Object item) {
            Node newNode = new Node(item);

            Node current = dummy;
            while (current.next != dummy) {
                current = current.next;
            }

            newNode.next = dummy;
            current.next = newNode;
        }

        public void showList() {
            Node current = dummy.next;

            while (current != dummy) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public void showReverseList() {
            showReverse(dummy.next);
            System.out.println();
        }

        private void showReverse(Node current) {
            if (current == dummy) {
                return;
            }

            showReverse(current.next);
            System.out.print(current.data + " ");
        }

        public boolean find(Object item) {
            Node current = dummy.next;

            while (current != dummy) {
                if (current.data.equals(item)) {
                    return true;
                }
                current = current.next;
            }

            return false;
        }

        public boolean remove(Object item) {
            Node previous = dummy;
            Node current = dummy.next;

            while (current != dummy) {

                if (current.data.equals(item)) {
                    previous.next = current.next;
                    return true;
                }

                previous = current;
                current = current.next;
            }

            return false;
        }

        public int size() {
            int count = 0;
            Node current = dummy.next;

            while (current != dummy) {
                count++;
                current = current.next;
            }

            return count;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            Node current = dummy.next;

            while (current != dummy) {
                sb.append(current.data);

                if (current.next != dummy) {
                    sb.append(" ");
                }

                current = current.next;
            }

            return sb.toString();
        }
}
