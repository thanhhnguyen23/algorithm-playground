import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class LeastRecentlyUsed{
  // store keys in cache
  static Deque<Integer> dq;

  // store references of key in cache
  static HashSet<Integer> map;

  // maximum capacity of cache
  static int csize;

  public static void main(String[]args){
    // System.out.println("hello world!");
    LeastRecentlyUsed lru = new LeastRecentlyUsed(3);
    lru.get(5);
    lru.get(9);
    lru.get(19);
    lru.display();
    lru.get(2);
    lru.display();
  }

  public void display(){
    Iterator<Integer> itr = dq.iterator();
    System.out.println("display method executed");
    while(itr.hasNext()){
      System.out.println(itr.next() + "");
    }
  }
  public void get(int x){
    if(!map.contains(x)){
      if(dq.size() == csize){
        int last = dq.removeLast();
        map.remove(last);
      }
    }
    else{
      int index = 0;
      int i = 0;
      Iterator<Integer> itr = dq.iterator();
      while(itr.hasNext()){

        if(itr.next() == x){
          index = i;
          break;
        }
        i++;
      }
      dq.remove(index);
    }
    dq.push(x);
    map.add(x);
  }
  public LeastRecentlyUsed(int n){
    // System.out.println("hello world from LRU " + n);
    dq = new LinkedList<>();
    map = new HashSet<>();
    csize = n;
    System.out.println("dq: " + dq + "\nmap: " +  map + "\nLRU cache size: " + csize);
  }
}
