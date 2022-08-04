class Application {
    public static void main(String[] args) {
        NodeList nodeList = new NodeList(); // (first: null, size = 0)

//        nodeList.add("aaa"); // (first: [data: AAA, next: null], size = 1)
//        nodeList.add("bbb"); // (first: [data: AAA, next: [data: BBB, next: null]], size = 2)
//        nodeList.add("ccc");
//        nodeList.add("ddd");
//        nodeList.addLast("eee");
//        nodeList.addLast("fff");
//        nodeList.addLast("ggg");
//        nodeList.addLast("hhh");
        nodeList.addFirst("aaa");
        nodeList.addFirst("bbb");
        nodeList.addFirst("ccc");
        nodeList.addLast("eee");
        nodeList.addLast("fff");
        nodeList.addLast("ggg");
        nodeList.addLast("hhh");

//        System.out.println("remove= " + nodeList.remove());
//        System.out.println("size= " + nodeList.size());
//        System.out.println("remove= " + nodeList.remove());
//        System.out.println("size= " + nodeList.size());
    }
}
