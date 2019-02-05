
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

        public boolean delete(int key) {

                Node current = root;
                Node parent = root;
                boolean isLeft = true;
                //searching candidate to delete
                while(current.data.getKey() != key){

                        parent = current;

                        if (key < current.data.getKey()){
                                current = current.left;
                                isLeft = true;
                        } else {
                                current = current.right;
                                isLeft = false;
                        }

                        if (current == null)    //not found
                                return false;
                }
                //searching candidate to delete


                //found node has no children
                if (current.left == null && current.right == null){

                        if (current == root) {
                                root = null;
                        } else if (isLeft){
                                parent.left = null;
                        } else {
                                parent.right = null;
                        }
                } else if (current.right == null ){ //found node has no right child
                                if (current == root){
                                        root = current.left;
                                } else if (isLeft) {
                                        parent.left = current.left;
                                } else
                                        parent.right = current.left;
                        } else if(current.left == null) {//found node has no left child
                                if (current == root) {
                                        root = current.right;
                                } else if (isLeft) {
                                        parent.left = current.right;
                                } else
                                        parent.right = current.right;
                        }
                        else {//found node has both child

                                Node successor = successor(current);

                                if (successor == root){
                                        root = successor;
                                } else if (isLeft)
                                                parent.left = successor;
                                        else
                                                parent.right = successor;

                                successor.left = current.left;
                               // successor.right = current.right;
                }
                        return true;

        }

        private Node successor(Node found){//finding first big node that bigger than found

                Node successorParenr = found;
                Node successor = found;
                Node current = found.right;

                while (current != null){
                        successorParenr = successor;
                        successor = current;
                        current = current.left;
                }

                if (successor != found.right){
                        successorParenr.left = successor.right;
                }
                return successor;

        }



        public static void main(String[] args) {

                Tree tree = new Tree();
                tree.add(new Car(300, "two"));
                tree.add(new Car(100, "three"));
                tree.add(new Car(150, "four"));
                tree.add(new Car(50, "minus one"));
                tree.add(new Car(350, "minus one"));
                tree.add(new Car(325, "minus one"));
                tree.add(new Car(375, "minus one"));
                tree.add(new Car(380, "minus one"));
                tree.add(new Car(310, "minus one"));
                tree.add(new Car(315, "minus one"));

                System.out.println(tree.find(-1));
                System.out.println(tree.find(315));
                tree.print();
                tree.delete(350);
                System.out.println("do hast");
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