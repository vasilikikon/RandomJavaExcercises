class Solution {
 public int findMaxForm(String[] strs, int m, int n) {
  int[] cnt = new int[strs.length];
  int[] cnt2 = new int[strs.length];
  int finale = 0;
  int smaller = 100000;
  int total = 0;
  for (int i = 0; i < strs.length; i++)
   for (int j = 0; j < strs[i].length(); j++)
    if (strs[i].charAt(j) == '0') {
     cnt[i]++;
     if (cnt[i] > finale && cnt[i] <= m)
      finale = cnt[i];
    }
  for (int i = 0; i < strs.length; i++)
   for (int j = 0; j < strs[i].length(); j++)
    if (strs[i].charAt(j) == '1') {
     cnt2[i]++;
     if (cnt2[i] < smaller && cnt2[i] <= n)
      smaller = cnt2[i];
    }
  System.out.printf("The zeros were %d and the ones were %d", finale, smaller);
  total = smaller + finale;
  return total;
 }

}