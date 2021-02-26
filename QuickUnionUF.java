public class QuickUnionUF {
  private int[] id;
  private int[] sz;
  public QuickUnionUF(int N){
    id = new int[N];
    for (int i = 0; i < N; i++) id[i] = i;

    sz = new int[N];
    for (int i = 0; i < N; i++) sz[i] = 1;
  }
  private int root(int i) {
    int j = i;
    while (j != id[i]) {
      j = id[i];
    }
    return j;
  }
  public boolean contected(int p, int q) {
    return root(p) == root(q);
  }
  public int union(int p, int q) {
    int i = root(p);
    int j = root(q);
    if (i == j) return sz[i];

    if (sz[i] > sz[j]) {
      id[i] = j;
      sz[i] += sz[j];
      return sz[i];
    } else {
      id[j] = i;
      sz[j] += sz[i];
      return sz[j];
    }
  }
}
