class Solution:
    def interpret(self, command):
        s = []
        skip = False
        for c in command:
            if skip:
                skip = False
                continue
            if c == "G": s.append("G")
            else:
                if c == "l":
                    s.append("al")
                    skip = True
                
                if c == ")":
                    s.append("o")
        
        return "".join(s)
