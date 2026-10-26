class Solution {

    public String addStrings(String num1, String num2) {

        StringBuilder str = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;

        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum1 = 0;
            int sum2 = 0;

            if (i >= 0) {
                sum1 = num1.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum2 = num2.charAt(j) - '0';
                j--;
            }

            int sum = sum1 + sum2 + carry;

            str.append(sum % 10);
            carry = sum / 10;
        }

        return str.reverse().toString();
    }
}
