// No or only one absent: s.indexOf('A') == s.lastIndexOf('A')
// No triple late: !s.contains("LLL")

class Solution {
    public boolean checkRecord(String s) {
        return !(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL"));
    } 
}
