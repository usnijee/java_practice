package lecture.dataStructure.linear.hashTable;

// Practice2
// 해시 충돌 해결 - 개방 주소법 (선형 탐사법)

class MyHashTable2 extends MyHashTable {

    MyHashTable2(int size) {
        super(size);
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);

        if (this.elemCnt == this.table.length) {
            System.out.println("Hash table is full!");
            return;
        } else if (this.table[idx] == null) {
            this.table[idx] = data;
        } else {
            int newIdx = idx;
            while (true) {
                /**
                 * 선형 탐사법 -> data에 해당하는 hashIndex가 이미 존재한다면
                 * newIdx = (newIdx + 1) % this.table.length;을 통해 새롭게 index를 갱신하여 사용
                 */
                newIdx = (newIdx + 1) % this.table.length;
                if (this.table[newIdx] == null) {
                    break;
                }
            }
            this.table[newIdx] = data;
        }
        elemCnt++;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        MyHashTable2 ht = new MyHashTable2(5);
        ht.setValue(1, 1);
        ht.setValue(3, 3);
        ht.printHashTable();

        ht.setValue(1, 10); // 해시 충돌 발생 -> 그 다음 idx에 10 저장됨 (2: 10)
        ht.printHashTable();

        ht.setValue(1, 20);
        ht.setValue(1, 30);
        ht.setValue(1, 40);
        ht.printHashTable();
    }
}

