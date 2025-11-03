class palindrome{
    
        public static void main(String args[]){

            String s= "MOM";
            String r = "";
            for(int i = s.length()-1; i >= 0; i--){
                r = r + s.charAt(i);
            }
            boolean isPalindrome = s.equals(r);
            if(isPalindrome){   
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
