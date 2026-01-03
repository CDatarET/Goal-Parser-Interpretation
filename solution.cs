public class Solution {
    public string Interpret(string command) {
        StringBuilder sb = new StringBuilder();
        bool skip = false;
        for(int i = 0; i < command.Length; i++){
            if(skip){
                skip = false;
                continue;
            }

            if(command[i] == 'G') sb.Append("G");
            else{
                if(command[i] == 'l'){
                    sb.Append("al");
                    skip = true;
                }

                if(command[i] == ')') sb.Append("o");
            }
        }

        return(sb.ToString());
    }
}
