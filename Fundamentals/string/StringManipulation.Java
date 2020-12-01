public class StringManipulation{
    public String trimAndConcat(String a, String b){
        String c = a.trim() + b.trim();
        return c;
    }
        public Integer getIndexOrNull(String a, int b){
        Integer c = a.indexOf(b);
        if(c >= 0){
            return c;
        }else{
            return null;
        }
    }
    public Integer getIndexOrNull(String a, String b){
        Integer c = a.indexOf(b);
        if(c >= 0){
            return c;
        }else{
            return null;
        }
    }
    public String concatSubstring(String a, int b, int c, String d){
        String subString = a.substring(b,c);
        return subString + d;
    }
}