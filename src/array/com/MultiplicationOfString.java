package array.com;

public class MultiplicationOfString {		
		    public String multiply(String num1, String num2) {
		        if (num1.equals("0") || num2.equals("0")) return "0";

		        int n = num1.length();
		        int m = num2.length();
		        int[] result = new int[n + m];

		        // Multiply each digit
		        for (int i = n - 1; i >= 0; i--) {
		            int d1 = num1.charAt(i) - '0';

		            for (int j = m - 1; j >= 0; j--) {
		                int d2 = num2.charAt(j) - '0';

		                int sum = d1 * d2 + result[i + j + 1];
		                result[i + j + 1] = sum % 10;                   // current digit
		                result[i + j] += sum / 10;                      // carry to next
		            }
		        }

		        // Convert result array to string manually (no StringBuilder)
		        String res = "";
		        boolean leadingZero = true;
		        for (int digit : result) {
		            if (digit == 0 && leadingZero) continue;
		            leadingZero = false;
		            res += (char)(digit + '0');  // convert int to char and append
		        }

		        return res.equals("") ? "0" : res;
		    }

		    public static void main(String[] args) {
		    	MultiplicationOfString sol = new MultiplicationOfString();
		        System.out.println(sol.multiply("123", "45")); // Output: 5535		    
		}
	}


