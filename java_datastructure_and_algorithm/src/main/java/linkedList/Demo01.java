package linkedList;

/**
 * @Author zb
 * @Date 2018/8/12
 */
public class Demo01 {
    /**
     * 链表头的引用
     */
    Node head = null;

    /**
     * 向链表中插入数据:
     * 找到链表的末尾结点，把新节点的数据作为末尾节点的后续结点
     * @param data
     */
    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return ;
        }
        //临时结点
        Node temp = head;
        while (temp.next != null){
            temp  = temp.next;
        }
        temp.next = newNode;
    }

    /**
     * 删除第index个节点:
     * 把要删除结点的前结点指向要删除的后结点，即直接跳过要删除的结点
     * @param index
     * @return 成功true 失败false
     */
    public Boolean deleteNode(int index){
        //待删除结点的不存在
        if(index < 1 || index > length()){
            return false;
        }
        //删除头结点
        if(index == 1){
            head = head.next;
            return true;
        }
        //待删结点的前结点
        Node preNode = head;
        //待删除结点
        Node curNode = preNode.next;
        int i = 1;
        while(curNode != null){
            i++;
            //寻找待删除的结点
            if(i == index){
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
        }
        return false;
    }

    /**
     * 链表结点排序，并返回排序后的头结点
     * 选择排序算法，即每次都选出未排序结点中最小的结点，与第一个未排序结点交换
     * @return
     */
    public Node linkSort(){
        Node curNode = head;
        while(curNode != null){
            Node nextNode = curNode.next;
            while(nextNode != null){
                if(curNode.data > nextNode.data){
                    int temp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = temp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }

    /**
     * 获取链表的长度
     * @return
     */
    public int length(){
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    /**
     * 打印结点
     */
    public void printLink(){
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data+" ");
            curNode = curNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Demo01 test = new Demo01();
        test.addNode(3);
        test.addNode(1);
        test.addNode(4);
        test.addNode(2);
        test.printLink();
        test.deleteNode(4);
        test.printLink();
    }
}

/**
 * 定义存储结点
 */
class Node {
    /**
     * 指向下一结点的引用
     */
    Node next = null;
    /**
     * 存储的数据
     */
    int data;
    public Node(int data){
        this.data = data;
    }
}
