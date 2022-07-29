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
    String data;
}

class NodeList{
    int index;

    // 리스트 추가 함수
    boolean add(String element) {
        Node node = new Node();
        node.data = element;

        index++;
        System.out.println(index + node.data);
        return false;
    }

    // 리스트 사이즈 추출 함수
    int size() {
        System.out.println(index);
        return index;
    }
}

//