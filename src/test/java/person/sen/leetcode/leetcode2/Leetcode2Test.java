package person.sen.leetcode.leetcode2;

import org.junit.Assert;
import org.junit.Test;
import person.sen.leetcode.model.ListNode;

import static org.junit.Assert.*;

public class Leetcode2Test {

    private Leetcode2 leetcode2 = new Leetcode2();

    @Test
    public void addTwoNumbers() throws Exception {
        ListNode number11 = parseNumberToListNode(123456);
        ListNode number12 = parseNumberToListNode(123);
        ListNode expect1 = parseNumberToListNode(123579);

        ListNode number21 = parseNumberToListNode(55);
        ListNode number22 = parseNumberToListNode(55);
        ListNode expect2 = parseNumberToListNode(110);

        ListNode result1 = leetcode2.addTwoNumbers(number11, number12);
        ListNode result2 = leetcode2.addTwoNumbers(number21, number22);

        Assert.assertEquals(expect1, result1);
        Assert.assertEquals(expect2, result2);
    }

    @Test
    public void addTwoNumbers2() throws Exception {
        ListNode number21 = parseNumberToListNode(55);
        ListNode number22 = parseNumberToListNode(55);
        ListNode expect2 = parseNumberToListNode(110);

        //ListNode result1 = leetcode2.addTwoNumbers(number11, number12);
        ListNode result2 = leetcode2.addTwoNumbers(number21, number22);

        //Assert.assertEquals(expect1, result1);
        Assert.assertEquals(expect2, result2);
    }

    @Test
    public void addTwoNumbers3() throws Exception {
        ListNode number21 = parseNumberToListNode(555);
        ListNode number22 = parseNumberToListNode(555);
        ListNode expect2 = parseNumberToListNode(1110);

        //ListNode result1 = leetcode2.addTwoNumbers(number11, number12);
        ListNode result2 = leetcode2.addTwoNumbers(number21, number22);

        //Assert.assertEquals(expect1, result1);
        Assert.assertEquals(expect2, result2);
    }

    @Test
    public void testParseNumber(){
        ListNode number1 = new ListNode(1);
        ListNode number2 = new ListNode(2);
        ListNode number3 = new ListNode(3);
        ListNode number4 = new ListNode(4);
        ListNode number5 = new ListNode(5);
        ListNode number6 = new ListNode(6);
        ListNode number7 = new ListNode(7);

        number1.next = number2;
        number2.next = number3;
        number3.next = number4;
        number4.next = number5;
        number5.next = number6;
        number6.next = number7;

        ListNode result = parseNumberToListNode(7654321);

        Assert.assertEquals(number1, result);
    }



    private ListNode parseNumberToListNode(int parameter){
        char[] charArray = (parameter+"").toCharArray();

        ListNode result = new ListNode(Integer.valueOf(charArray[charArray.length-1]+""));

        ListNode ref = result;

        for(int i = charArray.length-2; i>=0; i--){
            ListNode node = new ListNode(Integer.valueOf(charArray[i]+""));
            ref.next = node;
            ref = node;
        }

        return result;
    }

}
