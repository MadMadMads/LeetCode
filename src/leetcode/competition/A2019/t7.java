package leetcode.competition.A2019;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/12 15:18
 * Modified By:
 */
public class t7 {
    public static class node implements Comparable {

        public node(int ts, int id) {
            this.ts = ts;
            this.id = id;
        }

        public node() {}
        int ts;
        int id;

        public int getTs() {
            return ts;
        }

        public void setTs(int ts) {
            this.ts = ts;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public int compareTo(Object o) {
            node n = (node) o;
            if (this.id > n.id) return 1;
            else if (this.id == n.id) return 0;
            else if(this.id < n.id) return -1;
            else {
                if (this.ts >= n.ts) return 1;
                else return -1;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<node> list = new ArrayList<>();
        HashMap<Integer, Integer> res = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int T = scanner.nextInt();
        for (int i = 0; i < M; i++) {
            int ts = scanner.nextInt();
            int id = scanner.nextInt();
            list.add(new node(ts,id));
        }
        Collections.sort(list);
        for (int i = 0; i < T; i++) {

        }
    }
}
