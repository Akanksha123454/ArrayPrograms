package array.com;

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        char[] patternArr = pattern.toCharArray();

        if (strArr.length != patternArr.length) return false;

        for(int i=0; i<strArr.length; i++){
            for(int j= i+1; j<strArr.length; j++){
                if(patternArr[i] == patternArr[j] && !strArr[i].equals(strArr[j])){
                    return false;
                }
                if(patternArr[i] != patternArr[j] && strArr[i].equals(strArr[j])){
                    return false;
                }
            }
        }
        return true;
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WordPattern w=new WordPattern();
		boolean res=wordPattern("abba","dog cat cat dog");
		System.out.println(res);
		          
		    
		
	}

}
