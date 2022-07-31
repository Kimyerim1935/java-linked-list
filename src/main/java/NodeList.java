//Todo

//       boolean add() {} // 리스트 가장 끝에 항목을 추가
//       void add(int index) {} // 리스트의 index에 해당하는 부분에 항목을 추가
//       void addFirst() {} // 리스트의 가장 끝에 항목을 추가
//       void addLast(String element)       // 리스트의 가장 끝에 항목을 추가
//
//       String remove()                    // 리스트의 가장 끝에서 항목을 추출 및 제거
//       boolean remove(String element)     // 리스트에서 해당 항목을 찾아 제거
//       String removeFirst()               // 리스트의 가장 처음 항목을 추출 및 제거
//       String removeList()                // 리스트의 가장 끝 항목을 추출 및 제거
//
//       int size()                         // 현재 리스트의 사이즈를 반환
//       String get(int index)              // 리스트의 index에 해당하는 항목을 추출하며, 제거는 하지 않음
//       void clear()                       // 현재 리스트를 빈 리스트로 초기화

class Node {
    String data; // 인스턴스변수 , 멤버변수
    Node next;

    // 생성자(Constructor)
    // 인스턴스 생성시에 호출되는 특별한 메서드
    public Node(String element) {
        this.data = element;
        this.next = null;
    }

    // 메서드
    String getData() {
        System.out.println(this.data);
        return this.data;
    }

}

class NodeList {
    Node first;
    Node last;
    int size;

    public NodeList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    // 리스트 추가 함수
    boolean add(String element) {
        Node node = new Node(element); // 노드 생성

        if (first == null) {
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++; // index of NodeList
        return true;
    }

    public String get(int index) {
        Node cursor = first;

        if (index < 0 || index > size - 1) {
            String empty = "Empty";
            return empty;
        }

        for (int i = 0; i < index; i++) {
            cursor = cursor.next;
        }

        return cursor.data;
    }

    public String remove() {
        Node cursor = first;

        if (size == 0) {
            return "삭제할 노드가 없습니다.";
        }

        for (int i = 0; i < size; i++) {
            if (i == size-1) {
                last = null;
                size--;
            }
            cursor = cursor.next;
        }

        if (last == null) {
            cursor = first;
            for (int j = 0; j < size; j++) {
                if (j == size-1) {
                    last = cursor;
                }
                cursor = cursor.next;
                System.out.println("last: " + last.data + last.next);
            }
        }
            last.next = null;
//        System.out.println(size);
        return cursor.getData();
    }

    // 리스트 사이즈 추출 함수
    int size() {
        if (size == 0) System.out.println("Node를 추가해주세요.");
//        System.out.println(size);
        return size;
    }
}
