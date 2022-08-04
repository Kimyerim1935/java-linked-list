// Todo

//       void add(int index) {} // 리스트의 index에 해당하는 부분에 항목을 추가
//
//       boolean remove(String element)     // 리스트에서 해당 항목을 찾아 제거
//
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

  void print() {
    Node cursor = first;

    while (cursor != null){
      System.out.println("cursor" + cursor.data);
      cursor = cursor.next;
    }

    System.out.println("First : " + first.getData());
    System.out.println("Last : " + last.getData());
    System.out.println("size: " + size);
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

  // 리스트의 가장 처음에 항목을 추가
  void addFirst(String element) {
    Node firstNode = new Node(element);
    firstNode.next = first;

    first = firstNode;

    size++;

    if(size == 1) {
      last = firstNode;
    }
  }

  // 리스트의 index에 해당하는 부분에 항목을 추가
  void add(int index, String element) {
    // index번째의 data 추가
    // 이전 노드.next에 추가 노드 주소 연결, 추가 노드.next에 원래노드.next 주소 넣기
    // size가 0이라면 메시지 출력 후 first, last에 추가
    // aaa bbb(ccc) [element, ccc] ccc

    Node indexNode = new Node(element);
    Node cursor = first;

//    if (size == 0){
//      System.out.println("생성된 노드가 없으므로, 첫번째에 항목을 추가합니다.");
//      first = indexNode;
//      last = indexNode;
//    } else {

    // 지금 노드 리스트 상태
    // f            l
    // eee fff ggg hhh
    // fff ggg hhh null
    // 만약 i번째에 추가하고 싶다면, 커서를 i-1번째로 옮긴 뒤, next를 element로
    // 커서의 next를 element.next로

        int move = index-2;

        for (int i = 0; i < move; i++){
          cursor = cursor.next;
        }
//    }
    indexNode.next = cursor.next;
    cursor.next = indexNode;
    size++;
  }

  // 리스트의 가장 끝에 항목을 추가
  void addLast(String element) {
    Node lastAddNode = new Node(element);

    if (first == null) {
      first = lastAddNode;
    } else {
      last.next = lastAddNode;
    }
    size++;
    last = lastAddNode;
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

  // 가장 마지막 항목 제거 함수
  public String remove() {
    if (size == 0) {
      return "삭제할 노드가 없습니다.";
    }
    size--;

    if (first == last) {
      String result = first.getData();
      first = last = null;
      return result;
    }

    Node cursor = first;

    String result = last.getData();

    while (cursor.next != last) {
      cursor = cursor.next;
    }

    cursor.next = null;
    last = cursor;

    return result;
  }

  // 리스트의 가장 첫번째 항목을 추출 및 제거
  String removeFirst() {

    if (first == last) {
      String result = first.getData();
      first = last = null;
      return result;
    }
    Node cursor = first;
    String result = first.data;

    cursor.data = null;
    first = cursor.next;
    size--;

    return result;
  }

  // 리스트의 가장 마지막 항목을 추출 및 제거
  String removeList() {
    return remove();
  }

  // 리스트 사이즈 추출 함수
  int size() {
    //        System.out.println(size);
    return size;
  }

  // 리스트 초기화 함수
  void clear() {
    Node cursor = first;

  }
}
