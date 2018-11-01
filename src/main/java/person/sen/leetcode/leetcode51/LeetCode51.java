package person.sen.leetcode.leetcode51;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeetCode51 {

    static final int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
    static final int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

    private List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        //List<List<String>> result = new ArrayList<>();
        List<List<Integer>> mark = new ArrayList<>();
        List<String> location = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            mark.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                mark.get(i).add(0);
            }

            //location.add("");

            String item = "";
            for (int j = 0; j < n; j++) {
                item += ".";
            }

            location.add(item);
        }

        generate(0, n, location, result, mark);

        return result;
    }

    private void generate(int k, int n, List<String> location, List<List<String>> result, List<List<Integer>> mark) {
        if (k == n) {
            this.result.add(deepClone(location));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (mark.get(k).get(i) == 0) {
                //copy old mark
                List<List<Integer>> tmpMark = deepClone(mark);
                //set new Q position
                setNewQPosition(k, location, i, 'Q');

                putDownTheQueeen(k, i, mark);
                generate(k + 1, n, location, result, mark);
                mark = tmpMark;
                //set the Q back
                setNewQPosition(k, location, i, '.');
            }
        }
    }

    private void setNewQPosition(int k, List<String> location, int i, char target) {
        char[] locationChars = location.get(k).toCharArray();
        locationChars[i] = target;
        location.set(k, new String(locationChars));
    }


    private void putDownTheQueeen(int x, int y, List<List<Integer>> mark) {
        mark.get(x).set(y, 1);
        for (int i = 1; i < mark.size(); i++) {
            for (int j = 0; j < 8; j++) {
                int newX = x + i * dx[j];
                int newY = y + i * dy[j];
                if (newX >= 0 && newX < mark.size() && newY >= 0 && newY < mark.size()) {
                    mark.get(newX).set(newY, 1);
                }
            }
        }

    }

    private <T> T deepClone(T source) {
        java.io.ObjectOutputStream oos = null;
        java.io.ObjectInputStream ois = null;

        T result = null;

        try {
            // 通过序列化实现深拷贝
            java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
            oos = new java.io.ObjectOutputStream(bos);
            // 序列化以及传递这个对象
            oos.writeObject(source);
            oos.flush();
            java.io.ByteArrayInputStream bin = new java.io.ByteArrayInputStream(bos.toByteArray());
            ois = new java.io.ObjectInputStream(bin);
            // 返回新的对象
            result = (T) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}
