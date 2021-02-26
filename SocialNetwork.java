import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SocialNetwork {
  public static void main(String[] args) {
    // assume id is index from 0
    // examples: 0 2 1614322029479
    int maxSize = 1;
    int count = StdIn.readInt();
    StdOut.println("count: " + count);
    QuickUnionUF uf = new QuickUnionUF(count);
    while (!StdIn.isEmpty()) {
      int p = StdIn.readInt();
      int q = StdIn.readInt();
      long ts = StdIn.readLong();
      int sz = uf.union(p, q);
      StdOut.println("sz: " + sz);
      if (sz > maxSize) {
        maxSize = sz;
      }
      if (maxSize == count) {
        StdOut.println("The answer is:" + ts);
        break;
      }
    }
  }
}