
public class Tree {

        private Node root;

        public Node find(int key){

                if (root == null) {
                        return null;
                }

                Node current = root;

                while(current.data.getKey() != key){

                        if (key < current.data.getKey()) {
                                current = current.left;
                        } else {
                                current = current.right;
                        }

                        if (current == null){
                                return null;
                        }

                }
                return current;
        }

        public void print () {
                print(root);
        }

        private void print (Node node){


                if (node == null) {
                        return;
                }

                System.out.println(node.data);

                print(node.left);
                print(node.right);

        }

        public void add(Data data){

                Node node = new Node(data);
                if (root == null) {
                        root = node;
                        return;
                }

                Node current = root;

                Node parent;
                while(true){

                        parent = current;
                        if (data.getKey() < current.data.getKey()) {
                                current = current.left;
                                if (current == null){
                                        parent.left = node;
                                        return;
                                }
                        } else {
                                current = current.right;
                                if (current == null){
                                        parent.right = node;
                                        return;
                                }
                        }



                }
        }



        public static void main(String[] args) {

                Tree tree = new Tree();
                tree.add(new Car(2, "two"));
                tree.add(new Car(3, "three"));
                tree.add(new Car(4, "four"));
                tree.add(new Car(-1, "minus one"));

                System.out.println(tree.find(-1));
                tree.print();

        }
}


class Node {

        Data data;
        Node right;
        Node left;

        Node (Data data){
                this.data = data;
        }

        @Override
        public String toString() {
                return "Node{" +
                        "data=" + data +
                        '}';
        }
}


interface Data {

        int getKey();
        void setKey(int key);
        String getValue();
        void setValue(String value);
}


class Car implements Data {

        int key;
        String value;

        public Car (int key, String value){
                this.key = key;
                this.value = value;
        }

        public int getKey(){
                return key;
        }

        public void setKey(int key){
                this.key =key;
        }

        public String getValue(){
                return value;
        }

        public void setValue(String value){
                this.value = value;
        }

        @Override
        public String toString() {
                return "Car{" +
                        "key=" + key +
                        ", value='" + value + '\'' +
                        '}';
        }
}