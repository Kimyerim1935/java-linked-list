class Application {
    public static void main(String[] args) {
        NodeList nodeList = new NodeList(); // (first: null, size = 0)

        nodeList.add("aaa"); // (first: [data: AAA, next: null], size = 1)
        nodeList.add("bbb"); // (first: [data: AAA, next: [data: BBB, next: null]], size = 2)
        nodeList.add("ccc");
        nodeList.add("ddd");
        nodeList.add("eee");
        nodeList.add("fff");

        nodeList.remove();
        nodeList.size();
        nodeList.add("aaa"); // (first: [data: AAA, next: null], size = 1)
        nodeList.add("bbb"); // (first: [data: AAA, next: [data: BBB, next: null]], size = 2)
        nodeList.add("ccc");
        nodeList.add("ddd");
        nodeList.add("eee");
        nodeList.add("fff");

        nodeList.size();

        nodeList.remove();
    }
}
