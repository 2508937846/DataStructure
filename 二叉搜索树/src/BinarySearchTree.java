/**
 * @author wtx
 * @date 2022/3/2
 */
public class BinarySearchTree<E> {
    private int size;

    public int size() {
        return 0;
    }// 元素的数量

    public boolean isEmpty() {
        return size == 0;
    } // 是否为空

    public void clear() {

    } // 清空所有元素

    public void add(E element) {

    } // 添加元素

    public void remove(E element) {

    } // 删除元素

    public boolean contains(E element) {
        return false;
    } // 是否包含某元素

    private void elementNotNullCheck(E element) {
        if (element == null) {
            throw new IllegalArgumentException("element must not be null");
        }
    }

    private static class Node<E> {
        E element;

    }
}
