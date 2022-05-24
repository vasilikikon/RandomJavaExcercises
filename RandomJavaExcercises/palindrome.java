class Solution {
 public boolean isPalindrome(int x) {
  String xs = String.valueOf(x);
  int xsl = xs.length() - 1;
  int cnt = 0;
  for (int i = 0; i <= xsl; i++) {
   if (xs.charAt(i) == xs.charAt(xsl - i)) {
    cnt++;
   }
  }
  if (cnt == xsl + 1)
   return true;
  else
   return false;
 }
}
// correct!