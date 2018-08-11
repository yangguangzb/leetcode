import org.junit.Test;

/**
 * @Author zb
 * @Date 2018/8/11
 */
public class Demo02 {

    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为
     * We%20Are%20Happy。
     */

    public String replaceSpace(StringBuffer str){
        int strLength = str.toString().length();
        if(strLength <= 0){
            //直接输入""时，返回应该为""而不是null
            return "";
        }
        //直接调用API
        return str.toString().replaceAll(" ","%20");
    }

    @Test
    public void test(){
        Demo02 demo02 = new Demo02();
        StringBuffer sb = new StringBuffer("We Are Happy");
        System.out.println(demo02.replaceSpace(sb));

    }

}
