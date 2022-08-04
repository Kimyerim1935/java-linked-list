class Application {
    public static void main(String[] args) {
        NodeList nodeList = new NodeList(); // (first: null, size = 0)

//        nodeList.addFirst("aaa");
//        nodeList.addFirst("bbb");
//        nodeList.addFirst("ccc");
//        nodeList.addFirst("ddd");
        nodeList.addLast("eee");
        nodeList.addLast("fff");
        nodeList.addLast("ggg");
        nodeList.addLast("hhh");

//        nodeList.add(1, "111");
//        nodeList.add(3, "333");
//        nodeList.removeFirst();
        nodeList.print();

//        System.out.println("remove= " + nodeList.remove());
//        System.out.println("size= " + nodeList.size());
//        System.out.println("remove= " + nodeList.remove());
//        System.out.println("size= " + nodeList.size());
    }
}
