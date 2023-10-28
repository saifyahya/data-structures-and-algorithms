//package CC30.lib.src.main.java.cc30;
//
//public class HashTable <K,V>{
//    private HashNode[] buckets;
//    private int numOfBuckets;
//    private int size;  //number of key/value pairs
//    public HashTable(){
//        this(10);
//    }
//    public HashTable(int capacity){
//        this.numOfBuckets=capacity;
//        this.size=0;
//        this.buckets= new HashNode[capacity];
//    }
//    public int getIndexFromKey(int key){   //modular hash function
//        return key%numOfBuckets;
//    }
//
//    public int size(){ //number of hashNodes or key value pairs
//        return size;
//    }
//    public int capacity(){  //hashtable total capacity
//        return numOfBuckets;
//    }
//    public boolean isEmpty(){
//        return size == 0;
//    }
//
//    public void put(K key, V value){
//    int hashCode = getIndexFromKey(key);
//    HashNode head = buckets[hashCode];
//    while (head!=null){
//        if(head.key==key){
//            head.value=value;
//            return;
//        }
//        head=head.next;
//    }
//        head = buckets[hashCode];
//        HashNode newHashNode = new HashNode(key,value);
//        newHashNode.next=head;
//        buckets[hashCode]=newHashNode;
//         size++;
//    }
//
//    public V get(K key){
//        int hashCode = getIndexFromKey(key);
//        HashNode head = buckets[hashCode];
//        while (head!=null){
//            if(head.key==key)
//                return head.value;
//            head=head.next;
//        }
//        return null;
//    }
//
//    public V remove(K key){
//        int hashCode = getIndexFromKey(key);
//        HashNode head = buckets[hashCode];
//HashNode prev = null;
//while(head!=null){
//    if (head.key==key && prev==null){
//        buckets[hashCode]=head.next;
//        size--;
//        return head.value;
//    }
//    prev=head;
//    head=head.next;
//            if(head.key==key){
//                prev.next=head.next;
//                size--;
//                return head.value;
//            }
//}
//return null;
//    }
//
//    private class HashNode<K,V>{
//        private K key;
//        private V value;
//        private HashNode next;
//
//        public HashNode(K key, V value){
//            this.key=key;
//            this.value=value;
//        }
//
//    }
//
//}
