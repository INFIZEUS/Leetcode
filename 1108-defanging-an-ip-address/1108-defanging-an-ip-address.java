class Solution {
   // public static String defangIPaddr(String address) {
   //      StringBuilder str = new StringBuilder();
   //      for (int i = 0; i < address.length(); i++) {
   //          if (address.charAt(i) == '.') {
   //              str.append("[.]");
   //          } else {
   //              str.append(address.charAt(i));
   //          }
   //      }
   //      return str.toString();
   //  }
    public static String defangIPaddr(String address) {
        String replaceadd = address.replace(".","[.]");
        return replaceadd;
    }
}

