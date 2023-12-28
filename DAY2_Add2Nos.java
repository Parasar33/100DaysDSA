class Solution {
    public ListNode addTwoNumbers(ListNode num1, ListNode num2) {
        ListNode placeholder = new ListNode(0);
        ListNode tailNode = placeholder;
        int carryDigit = 0;

        while (num1 != null || num2 != null || carryDigit != 0) {
            int digitInNum1 = (num1 != null) ? num1.val : 0;
            int digitInNum2 = (num2 != null) ? num2.val : 0;

            int sum = digitInNum1 + digitInNum2 + carryDigit;
            int resultingDigit = sum % 10;
            carryDigit = sum / 10;

            ListNode newDigitNode = new ListNode(resultingDigit);
            tailNode.next = newDigitNode;
            tailNode = tailNode.next;

            num1 = (num1 != null) ? num1.next : null;
            num2 = (num2 != null) ? num2.next : null;
        }

        ListNode finalResult = placeholder.next;
        placeholder.next = null;
        return finalResult;
    }
}
