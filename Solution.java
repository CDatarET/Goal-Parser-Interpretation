class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        boolean skip = false;
        for(int i = 0; i < command.length(); i++){
            if(skip){
                skip = false;
                continue;
            }

            if(command.charAt(i) == 'G') sb.append("G");
            else{
                if(command.charAt(i) == 'l'){
                    sb.append("al");
                    skip = true;
                }

                if(command.charAt(i) == ')') sb.append("o");
            }
        }

        return(sb.toString());
    }
}
